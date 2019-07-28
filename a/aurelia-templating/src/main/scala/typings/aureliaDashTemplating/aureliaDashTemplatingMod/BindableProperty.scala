package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "BindableProperty")
@js.native
class BindableProperty protected () extends js.Object {
  /**
    * Creates an instance of BindableProperty.
    * @param nameOrConfig The name of the property or a cofiguration object.
    */
  def this(nameOrConfig: String) = this()
  def this(nameOrConfig: js.Object) = this()
  /**
    * Creates an observer for this property.
    * @param viewModel The view model instance on which to create the observer.
    * @return The property observer.
    */
  def createObserver(viewModel: js.Object): BehaviorPropertyObserver = js.native
  /**
    * Defines this property on the specified class and behavior.
    * @param target The class to define the property on.
    * @param behavior The behavior to define the property on.
    */
  def defineOn(target: js.Function, behavior: HtmlBehaviorResource): Unit = js.native
  /**
    * Registers this bindable property with particular Class and Behavior instance.
    * @param target The class to register this behavior with.
    * @param behavior The behavior instance to register this property with.
    * @param descriptor The property descriptor for this property.
    */
  def registerWith(target: js.Function, behavior: HtmlBehaviorResource): Unit = js.native
  def registerWith(target: js.Function, behavior: HtmlBehaviorResource, descriptor: js.Object): Unit = js.native
}

