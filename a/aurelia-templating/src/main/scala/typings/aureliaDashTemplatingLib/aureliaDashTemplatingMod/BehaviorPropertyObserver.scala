package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "BehaviorPropertyObserver")
@js.native
class BehaviorPropertyObserver protected () extends js.Object {
  /**
      * Creates an instance of BehaviorPropertyObserver.
      * @param taskQueue The task queue used to schedule change notifications.
      * @param obj The object that the property is defined on.
      * @param propertyName The name of the property.
      * @param selfSubscriber The callback function that notifies the object which defines the properties, if present.
      * @param initialValue The initial value of the property.
      */
  def this(taskQueue: aureliaDashTaskDashQueueLib.aureliaDashTaskDashQueueMod.TaskQueue, obj: js.Object, propertyName: java.lang.String, selfSubscriber: js.Function, initialValue: js.Any) = this()
  /**
      * Invoked by the TaskQueue to publish changes to subscribers.
      */
  def call(): scala.Unit = js.native
  /**
      * Gets the property's value.
      */
  def getValue(): js.Any = js.native
  /**
      * Sets the property's value.
      * @param newValue The new value to set.
      */
  def setValue(newValue: js.Any): scala.Unit = js.native
  /**
      * Subscribes to the observerable.
      * @param context A context object to pass along to the subscriber when it's called.
      * @param callable A function or object with a "call" method to be invoked for delivery of changes.
      */
  def subscribe(context: js.Any, callable: js.Function): scala.Unit = js.native
  /**
      * Unsubscribes from the observerable.
      * @param context The context object originally subscribed with.
      * @param callable The callable that was originally subscribed with.
      */
  def unsubscribe(context: js.Any, callable: js.Function): scala.Unit = js.native
}

