package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "Controller")
@js.native
class Controller protected () extends js.Object {
  /**
      * Creates an instance of Controller.
      * @param behavior The HtmlBehaviorResource that provides the base behavior for this controller.
      * @param instruction The instructions pertaining to the controller's behavior.
      * @param viewModel The developer's view model instance which provides the custom behavior for this controller.
      * @param container The container that the controller's view was created from.
      */
  def this(behavior: HtmlBehaviorResource, instruction: BehaviorInstruction, viewModel: js.Object, container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container) = this()
  /**
      * The HtmlBehaviorResource that provides the base behavior for this controller.
      */
  var behavior: HtmlBehaviorResource = js.native
  /**
      * The view associated with the component being controlled by this controller.
      * Note: Not all components will have a view, so the value may be null.
      */
  var view: View = js.native
  /**
      * The developer's view model instance which provides the custom behavior for this controller.
      */
  var viewModel: js.Object = js.native
  /**
      * Attaches the controller.
      */
  def attached(): scala.Unit = js.native
  /**
      * Used to automate the proper binding of this controller and its view. Used by the composition engine for dynamic component creation.
      * This should be considered a semi-private API and is subject to change without notice, even across minor or patch releases.
      * @param overrideContext An override context for binding.
      * @param owningView The view inside which this controller resides.
      */
  def automate(): scala.Unit = js.native
  /**
      * Used to automate the proper binding of this controller and its view. Used by the composition engine for dynamic component creation.
      * This should be considered a semi-private API and is subject to change without notice, even across minor or patch releases.
      * @param overrideContext An override context for binding.
      * @param owningView The view inside which this controller resides.
      */
  def automate(overrideContext: js.Object): scala.Unit = js.native
  /**
      * Used to automate the proper binding of this controller and its view. Used by the composition engine for dynamic component creation.
      * This should be considered a semi-private API and is subject to change without notice, even across minor or patch releases.
      * @param overrideContext An override context for binding.
      * @param owningView The view inside which this controller resides.
      */
  def automate(overrideContext: js.Object, owningView: View): scala.Unit = js.native
  /**
      * Binds the controller to the scope.
      * @param scope The binding scope.
      */
  def bind(scope: js.Object): scala.Unit = js.native
  /**
      * Invoked when the view which contains this controller is created.
      * @param owningView The view inside which this controller resides.
      */
  def created(owningView: View): scala.Unit = js.native
  /**
      * Detaches the controller.
      */
  def detached(): scala.Unit = js.native
  /**
      * Unbinds the controller.
      */
  def unbind(): scala.Unit = js.native
}

