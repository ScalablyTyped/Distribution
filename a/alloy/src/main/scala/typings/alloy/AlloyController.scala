package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import typings.alloy.anon.PartialProxy
import typings.backbone.mod.EventsMixin
import typings.std.Partial
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for Alloy controllers.
  */
@js.native
trait AlloyController extends EventsMixin {
  
  /**
    * Provides convenience methods for working with Titanium Views in Alloy
    */
  var UI: AlloyControllerUI = js.native
  
  /**
    *
    * @param proxy View object to which to add class(es).
    * @param classes Array or space-separated list of classes to apply.
    * @param opts Dictionary of properties to apply after classes have been added.
    */
  def addClass[T /* <: Proxy */](proxy: T, classes: String): Unit = js.native
  def addClass[T /* <: Proxy */](proxy: T, classes: String, opts: Partial[T]): Unit = js.native
  def addClass[T /* <: Proxy */](proxy: T, classes: js.Array[String]): Unit = js.native
  def addClass[T /* <: Proxy */](proxy: T, classes: js.Array[String], opts: Partial[T]): Unit = js.native
  
  /**
    * Adds a tracked event listeners to a view proxy object. By default, any event listener declared in XML is tracked by Alloy.
    *
    * @param proxy Proxy view object to listen to.
    * @param type Name of the event.
    * @param callback Callback function to invoke when the event is fired.
    * @returns ID attribute of the view object. If one does not exist, Alloy will create a unique ID.
    */
  def addListener(proxy: Proxy, `type`: String, callback: js.Function1[/* e */ js.Any, Unit]): String = js.native
  
  var args: js.Any = js.native
  
  /**
    * Creates a dictionary of properties based on the specified styles.
    *
    * @param opts Dictionary of styles to apply.
    * @returns Dictionary of properties that can be passed to a view factory function or applyProperties().
    */
  def createStyle(opts: js.Any): PartialProxy = js.native
  
  /**
    * Frees binding resources associated with this controller and its UI
    * components.
    *
    * It is critical that this is called when employing model/collection binding
    * in order to avoid potential memory leaks. `$.destroy()` should be called
    * whenever a controller's UI is to be "closed" or removed from the app.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets all the tracked event listeners of the view-controller or only the
    * ones specified by the parameters.
    *
    * Passing no parameters, retrieves all tracked event listeners. Set a
    * parameter to null if you do not want to restrict the match to that
    * parameter.
    *
    * @param proxy Proxy view object.
    * @param type Name of the event.
    */
  def getListener(): js.Array[_] = js.native
  def getListener(proxy: js.UndefOr[scala.Nothing], `type`: String): js.Array[_] = js.native
  def getListener(proxy: Proxy): js.Array[_] = js.native
  def getListener(proxy: Proxy, `type`: String): js.Array[_] = js.native
  
  /**
    * Returns a list of the root view elements associated with this controller.
    */
  def getTopLevelViews(): js.Array[_] = js.native
  
  /**
    * Returns the specified view associated with this controller.
    *
    * If no id is specified, returns the first top-level view.
    *
    * @param id ID of the view to return.
    */
  def getView(): js.Any = js.native
  def getView(id: String): js.Any = js.native
  
  /**
    * Returns a list of all IDed view elements associated with this controller.
    */
  def getViews(): js.Array[_] = js.native
  
  /**
    * Removes a TSS class from the specified view object.
    *
    * @param proxy View object from which to remove class(es)
    * @param classes Array or space-separated list of classes to remove.
    * @param opts Dictionary of properties to apply after the class removal.
    */
  def removeClass[T /* <: Proxy */](proxy: T, classes: String): Unit = js.native
  def removeClass[T /* <: Proxy */](proxy: T, classes: String, opts: Partial[T]): Unit = js.native
  def removeClass[T /* <: Proxy */](proxy: T, classes: js.Array[String]): Unit = js.native
  def removeClass[T /* <: Proxy */](proxy: T, classes: js.Array[String], opts: Partial[T]): Unit = js.native
  
  /**
    * Removes all tracked event listeners or only the ones specified by the parameters.
    *
    * Passing no parameters, removes all tracked event listeners. Set a
    * parameter to null if you do not want to restrict the match to that
    * parameter.
    *
    * @param proxy Proxy view object to remove event listeners from.
    * @param type Name of the event to remove.
    * @param callback Callback to remove.
    */
  def removeListener(proxy: Proxy): AlloyController = js.native
  def removeListener(proxy: Proxy, `type`: js.UndefOr[scala.Nothing], callback: js.Function1[/* e */ js.Any, Unit]): AlloyController = js.native
  def removeListener(proxy: Proxy, `type`: String): AlloyController = js.native
  def removeListener(proxy: Proxy, `type`: String, callback: js.Function1[/* e */ js.Any, Unit]): AlloyController = js.native
  
  /**
    * Sets the array of TSS classes for the target View object, adding the classes specified and removing any applied classes that are not specified.
    *
    * @param proxy View object to reset.
    * @param classes Array or space-separated list of classes to apply after the reset.
    * @param opts Dictionary of properties to apply after the reset.
    */
  def resetClass[T /* <: Proxy */](proxy: T, classes: String): Unit = js.native
  def resetClass[T /* <: Proxy */](proxy: T, classes: String, opts: Partial[T]): Unit = js.native
  def resetClass[T /* <: Proxy */](proxy: T, classes: js.Array[String]): Unit = js.native
  def resetClass[T /* <: Proxy */](proxy: T, classes: js.Array[String], opts: Partial[T]): Unit = js.native
  
  /**
    * Applies a set of properties to view elements associated with this controller.
    *
    * @param args An object whose keys are the IDs (in form '#id') of views to which the styles will be applied.
    */
  def updateViews(args: StringDictionary[js.Any]): AlloyController = js.native
}
