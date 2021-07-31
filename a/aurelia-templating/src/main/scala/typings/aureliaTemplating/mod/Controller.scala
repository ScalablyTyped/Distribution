package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "Controller")
@js.native
class Controller protected () extends StObject {
  /**
    * Creates an instance of Controller.
    * @param behavior The HtmlBehaviorResource that provides the base behavior for this controller.
    * @param instruction The instructions pertaining to the controller's behavior.
    * @param viewModel The developer's view model instance which provides the custom behavior for this controller.
    * @param container The container that the controller's view was created from.
    */
  def this(
    behavior: HtmlBehaviorResource,
    instruction: BehaviorInstruction,
    viewModel: js.Object,
    container: Container
  ) = this()
  
  /**
    * Attaches the controller.
    */
  def attached(): Unit = js.native
  
  /**
    * Used to automate the proper binding of this controller and its view. Used by the composition engine for dynamic component creation.
    * This should be considered a semi-private API and is subject to change without notice, even across minor or patch releases.
    * @param overrideContext An override context for binding.
    * @param owningView The view inside which this controller resides.
    */
  def automate(): Unit = js.native
  def automate(overrideContext: js.Object): Unit = js.native
  def automate(overrideContext: js.Object, owningView: View_): Unit = js.native
  def automate(overrideContext: Unit, owningView: View_): Unit = js.native
  
  /**
    * The HtmlBehaviorResource that provides the base behavior for this controller.
    */
  var behavior: HtmlBehaviorResource = js.native
  
  /**
    * Binds the controller to the scope.
    * @param scope The binding scope.
    */
  def bind(scope: js.Object): Unit = js.native
  
  /**
    * Invoked when the view which contains this controller is created.
    * @param owningView The view inside which this controller resides.
    */
  def created(owningView: View_): Unit = js.native
  
  /**
    * Detaches the controller.
    */
  def detached(): Unit = js.native
  
  /**
    * Unbinds the controller.
    */
  def unbind(): Unit = js.native
  
  /**
    * The view associated with the component being controlled by this controller.
    * Note: Not all components will have a view, so the value may be null.
    */
  var view: View_ = js.native
  
  /**
    * The developer's view model instance which provides the custom behavior for this controller.
    */
  var viewModel: js.Object = js.native
}
