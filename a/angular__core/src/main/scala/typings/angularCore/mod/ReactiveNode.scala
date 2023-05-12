package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node in the reactive graph.
  *
  * Nodes can be producers of reactive values, consumers of other reactive values, or both.
  *
  * Producers are nodes that produce values, and can be depended upon by consumer nodes.
  *
  * Producers expose a monotonic `valueVersion` counter, and are responsible for incrementing this
  * version when their value semantically changes. Some producers may produce their values lazily and
  * thus at times need to be polled for potential updates to their value (and by extension their
  * `valueVersion`). This is accomplished via the `onProducerUpdateValueVersion` method for
  * implemented by producers, which should perform whatever calculations are necessary to ensure
  * `valueVersion` is up to date.
  *
  * Consumers are nodes that depend on the values of producers and are notified when those values
  * might have changed.
  *
  * Consumers do not wrap the reads they consume themselves, but rather can be set as the active
  * reader via `setActiveConsumer`. Reads of producers that happen while a consumer is active will
  * result in those producers being added as dependencies of that consumer node.
  *
  * The set of dependencies of a consumer is dynamic. Implementers expose a monotonically increasing
  * `trackingVersion` counter, which increments whenever the consumer is about to re-run any reactive
  * reads it needs and establish a new set of dependencies as a result.
  *
  * Producers store the last `trackingVersion` they've seen from `Consumer`s which have read them.
  * This allows a producer to identify whether its record of the dependency is current or stale, by
  * comparing the consumer's `trackingVersion` to the version at which the dependency was
  * last observed.
  */
@js.native
trait ReactiveNode extends StObject {
  
  /**
    * Whether signal writes should be allowed while this `ReactiveNode` is the current consumer.
    */
  /* protected */ val consumerAllowSignalWrites: Boolean = js.native
  
  /**
    * Polls dependencies of a consumer to determine if they have actually changed.
    *
    * If this returns `false`, then even though the consumer may have previously been notified of a
    * change, the values of its dependencies have not actually changed and the consumer should not
    * rerun any reactions.
    */
  /* protected */ def consumerPollProducersForChange(): Boolean = js.native
  
  /**
    * Edges to consumers on which this node depends (in its producer capacity).
    */
  /* private */ val consumers: Any = js.native
  
  /**
    * Whether this consumer currently has any producers registered.
    */
  /* protected */ def hasProducers: Boolean = js.native
  
  /* private */ val id: Any = js.native
  
  /**
    * Called for consumers whenever one of their dependencies notifies that it might have a new
    * value.
    */
  /* protected */ def onConsumerDependencyMayHaveChanged(): Unit = js.native
  
  /**
    * Called for producers when a dependent consumer is checking if the producer's value has actually
    * changed.
    */
  /* protected */ def onProducerUpdateValueVersion(): Unit = js.native
  
  /**
    * Mark that this producer node has been accessed in the current reactive context.
    */
  /* protected */ def producerAccessed(): Unit = js.native
  
  /**
    * Notify all consumers of this producer that its value may have changed.
    */
  /* protected */ def producerMayHaveChanged(): Unit = js.native
  
  /**
    * Checks if a `Producer` has a current value which is different than the value
    * last seen at a specific version by a `Consumer` which recorded a dependency on
    * this `Producer`.
    */
  /* private */ var producerPollStatus: Any = js.native
  
  /**
    * Whether this `ReactiveNode` in its producer capacity is currently allowed to initiate updates,
    * based on the current consumer context.
    */
  /* protected */ def producerUpdatesAllowed: Boolean = js.native
  
  /**
    * Edges to producers on which this node depends (in its consumer capacity).
    */
  /* private */ val producers: Any = js.native
  
  /**
    * A cached weak reference to this node, which will be used in `ReactiveEdge`s.
    */
  /* private */ val ref: Any = js.native
  
  /**
    * Monotonically increasing counter representing a version of this `Consumer`'s
    * dependencies.
    */
  /* protected */ var trackingVersion: Double = js.native
  
  /**
    * Monotonically increasing counter which increases when the value of this `Producer`
    * semantically changes.
    */
  /* protected */ var valueVersion: Double = js.native
}
