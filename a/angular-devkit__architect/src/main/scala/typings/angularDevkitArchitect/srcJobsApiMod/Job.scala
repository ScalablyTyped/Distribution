package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job[ArgumentT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */] extends StObject {
  
  /**
    * Argument sent when scheduling the job. This is a copy of the argument.
    */
  val argument: ArgumentT = js.native
  
  /**
    * Description of the job. Resolving the job's description can be done asynchronously, so this
    * is an observable that will resolve when it's ready.
    */
  val description: Observable_[JobDescription] = js.native
  
  /**
    * Get a channel that validates against the schema. Messages will be filtered by the schema.
    * @param name The name of the channel.
    * @param schema A schema to use to validate messages.
    */
  def getChannel[T /* <: JsonValue */](name: String): Observable_[T] = js.native
  def getChannel[T /* <: JsonValue */](name: String, schema: JsonSchema): Observable_[T] = js.native
  
  /**
    * The JobInboundMessage messages TO the job.
    */
  val inboundBus: Observer[JobInboundMessage[InputT]] = js.native
  
  /**
    * The input to the job. This goes through the input channel as messages.
    */
  val input: Observer[InputT] = js.native
  
  /**
    * The JobOutboundMessage FROM the job.
    */
  val outboundBus: Observable_[JobOutboundMessage[OutputT]] = js.native
  
  /**
    * Outputs of this job.
    */
  val output: Observable_[OutputT] = js.native
  
  /**
    * Pings the job and wait for the resulting Pong before completing.
    */
  def ping(): Observable_[scala.Nothing] = js.native
  
  /**
    * The current state of the job.
    */
  val state: JobState = js.native
  
  /**
    * Stops the job from running. This is different than unsubscribing from the output as in it
    * sends the JobInboundMessageKind.Stop raw input to the job.
    */
  def stop(): Unit = js.native
}
