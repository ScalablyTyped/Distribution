package typings.alloy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides convenience methods for working with Titanium Views in Alloy
  */
@js.native
trait AlloyControllerUI extends StObject {
  
  /**
    * Creates a Titanium UI element with the specified options.
    *
    * The following creates a new View and assigns the "dialog" TSS class
    * (defined in your styles) to the view, and finally adds it to main window.
    *
    * ```js
    * const view = $.UI.create("View", {
    *   classes: 'dialog'
    * });
    * $.index.add(view);
    * ```
    *
    * @param apiName Name of the UI element to create. This can either be the full class name, such as `Ti.UI.Button`, or the XML element, such as `Button`.
    * @param opts Styles and any additional properties you would like to apply directly the created view.
    */
  def create(apiName: String): js.Any = js.native
  def create(apiName: String, opts: AlloyStyleDict): js.Any = js.native
}
