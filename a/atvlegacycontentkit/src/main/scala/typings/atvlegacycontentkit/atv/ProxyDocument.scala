package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that allows you to show a loader while doing work in the background, and eventually replacing it with a page.
  */
@js.native
trait ProxyDocument extends StObject {
  
  /**
    * Cancel the proxy document and return back to the previous screen. This calls the onCancel callback.
    */
  def cancel(): Unit = js.native
  
  /**
    * Load the specified plist onto the controller stack and replace the proxy document.
    *
    * See https://github.com/SheaSmith/atv.js/wiki/Plist-findings for more information.
    * @param plist The plist to display.
    */
  def loadPlist(plist: String): Unit = js.native
  def loadPlist(plist: js.Object): Unit = js.native
  
  /**
    * Load a page based on a URL pointing to an XML template and replace the proxy document..
    *
    * See the XML documentation for more information.
    * @param url The URL of the XML template.
    * @param method The method to use to access the URL.
    * @param headers The headers to include with the request.
    * @param body The body to send with the request (if applicable).
    */
  def loadURL(url: String): Unit = js.native
  def loadURL(url: String, method: String): Unit = js.native
  def loadURL(url: String, method: String, headers: StringDictionary[String]): Unit = js.native
  def loadURL(url: String, method: String, headers: StringDictionary[String], body: String): Unit = js.native
  def loadURL(url: String, method: String, headers: StringDictionary[String], body: StringDictionary[String]): Unit = js.native
  def loadURL(url: String, method: String, headers: Unit, body: String): Unit = js.native
  def loadURL(url: String, method: String, headers: Unit, body: StringDictionary[String]): Unit = js.native
  def loadURL(url: String, method: Unit, headers: StringDictionary[String]): Unit = js.native
  def loadURL(url: String, method: Unit, headers: StringDictionary[String], body: String): Unit = js.native
  def loadURL(url: String, method: Unit, headers: StringDictionary[String], body: StringDictionary[String]): Unit = js.native
  def loadURL(url: String, method: Unit, headers: Unit, body: String): Unit = js.native
  def loadURL(url: String, method: Unit, headers: Unit, body: StringDictionary[String]): Unit = js.native
  
  /**
    * Load a page based on a parsed XML template / Node and replace the proxy document..
    *
    * See the XML documentation for more information.
    * @param xml The parent node, containing the XML tree to replace the current page with.
    * @param callback A callback called when the page has been swapped, and if it was successful.
    */
  def loadXML(xml: Node): Unit = js.native
  def loadXML(xml: Node, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Called when the user cancels the ProxyDocument by clicking back.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Shows the proxy document.
    */
  def show(): Unit = js.native
}
