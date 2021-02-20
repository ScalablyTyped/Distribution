package typings.autosize

import typings.jquery.JQuery
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Attach autosize to JQuery collection
    */
  @JSImport("autosize", JSImport.Namespace)
  @js.native
  def apply(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Attach autosize to NodeList
    */
  @JSImport("autosize", JSImport.Namespace)
  @js.native
  def apply(elements: NodeList): NodeList = js.native
  /**
    * Attach autosize to Element
    */
  @JSImport("autosize", JSImport.Namespace)
  @js.native
  def apply(element: Element): Element = js.native
  
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  @JSImport("autosize", "destroy")
  @js.native
  def destroy(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  @JSImport("autosize", "destroy")
  @js.native
  def destroy(elements: NodeList): NodeList = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  @JSImport("autosize", "destroy")
  @js.native
  def destroy(element: Element): Element = js.native
  
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  @JSImport("autosize", "update")
  @js.native
  def update(collection: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  @JSImport("autosize", "update")
  @js.native
  def update(elements: NodeList): NodeList = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  @JSImport("autosize", "update")
  @js.native
  def update(element: Element): Element = js.native
}
