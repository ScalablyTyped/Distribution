package typings.autosize

import typings.std.ArrayLike
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Attach Autosize to NodeList/Element/JQuery.
    *
    * @example
    * import autosize = require('autosize');
    *
    * // from a NodeList
    * autosize(document.querySelectorAll('textarea'));
    *
    * // from a single Node
    * autosize(document.querySelector('textarea'));
    *
    * // from a jQuery collection
    * autosize($('textarea'));
    */
  inline def apply(elements: ArrayLike[Element]): ArrayLike[Element] = ^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[Element]]
  inline def apply(elements: Element): Element = ^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("autosize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  inline def destroy(elements: ArrayLike[Element]): ArrayLike[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[Element]]
  inline def destroy(elements: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(elements.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  inline def update(elements: ArrayLike[Element]): ArrayLike[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elements.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[Element]]
  inline def update(elements: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elements.asInstanceOf[js.Any]).asInstanceOf[Element]
}
