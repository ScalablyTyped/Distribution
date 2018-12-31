package typings
package autosizeLib.autosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autosize", JSImport.Namespace)
@js.native
object autosizeModMembers extends js.Object {
  /**
    * Attach autosize to JQuery collection
    */
  def apply(collection: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    * Attach autosize to NodeList
    */
  def apply(elements: stdLib.NodeList): stdLib.NodeList = js.native
  /**
    * Attach autosize to Element
    */
  def apply(element: stdLib.Element): stdLib.Element = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(collection: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(elements: stdLib.NodeList): stdLib.NodeList = js.native
  /**
    * Removes Autosize and reverts any changes it made to the textarea element.
    */
  def destroy(element: stdLib.Element): stdLib.Element = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(collection: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(elements: stdLib.NodeList): stdLib.NodeList = js.native
  /**
    * Triggers the height adjustment for an assigned textarea element.
    * Autosize will automatically adjust the textarea height on keyboard and window resize events.
    * There is no efficient way for Autosize to monitor for when another script has changed the textarea value or for changes in layout that impact the textarea element.
    */
  def update(element: stdLib.Element): stdLib.Element = js.native
}

