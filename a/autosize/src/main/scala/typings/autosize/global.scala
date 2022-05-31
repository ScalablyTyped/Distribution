package typings.autosize

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object autosize {
    
    /**
      * Attach autosize to JQuery collection
      */
    inline def apply(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].apply(collection.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]
    /**
      * Attach autosize to NodeList
      */
    inline def apply(elements: NodeList): NodeList = ^.asInstanceOf[js.Dynamic].apply(elements.asInstanceOf[js.Any]).asInstanceOf[NodeList]
    /**
      * Attach autosize to Element
      */
    inline def apply(element: Element): Element = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSGlobal("autosize")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Removes Autosize and reverts any changes it made to the textarea element.
      */
    inline def destroy(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(collection.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]
    /**
      * Removes Autosize and reverts any changes it made to the textarea element.
      */
    inline def destroy(elements: NodeList): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(elements.asInstanceOf[js.Any]).asInstanceOf[NodeList]
    /**
      * Removes Autosize and reverts any changes it made to the textarea element.
      */
    inline def destroy(element: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Triggers the height adjustment for an assigned textarea element.
      * Autosize will automatically adjust the textarea height on keyboard and window resize events.
      * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
      */
    inline def update(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(collection.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]
    /**
      * Triggers the height adjustment for an assigned textarea element.
      * Autosize will automatically adjust the textarea height on keyboard and window resize events.
      * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
      */
    inline def update(elements: NodeList): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(elements.asInstanceOf[js.Any]).asInstanceOf[NodeList]
    /**
      * Triggers the height adjustment for an assigned textarea element.
      * Autosize will automatically adjust the textarea height on keyboard and window resize events.
      * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
      */
    inline def update(element: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
}
