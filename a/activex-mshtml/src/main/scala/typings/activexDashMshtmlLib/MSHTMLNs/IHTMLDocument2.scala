package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDocument2")
@js.native
class IHTMLDocument2 protected () extends js.Object {
  var `MSHTML.IHTMLDocument2_typekey`: IHTMLDocument2 = js.native
  val Script: js.Any = js.native
  val activeElement: IHTMLElement = js.native
  var alinkColor: js.Any = js.native
  @JSName("all")
  val all_Original: IHTMLElementCollection = js.native
  @JSName("anchors")
  val anchors_Original: IHTMLElementCollection = js.native
  @JSName("applets")
  val applets_Original: IHTMLElementCollection = js.native
  var bgColor: js.Any = js.native
  val body: IHTMLElement = js.native
  var charset: java.lang.String = js.native
  var cookie: java.lang.String = js.native
  var defaultCharset: java.lang.String = js.native
  var designMode: java.lang.String = js.native
  var domain: java.lang.String = js.native
  @JSName("embeds")
  val embeds_Original: IHTMLElementCollection = js.native
  var expando: scala.Boolean = js.native
  var fgColor: js.Any = js.native
  val fileCreatedDate: java.lang.String = js.native
  val fileModifiedDate: java.lang.String = js.native
  val fileSize: java.lang.String = js.native
  val fileUpdatedDate: java.lang.String = js.native
  @JSName("forms")
  val forms_Original: IHTMLElementCollection = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  @JSName("images")
  val images_Original: IHTMLElementCollection = js.native
  val lastModified: java.lang.String = js.native
  var linkColor: js.Any = js.native
  @JSName("links")
  val links_Original: IHTMLElementCollection = js.native
  val location: IHTMLLocation = js.native
  val mimeType: java.lang.String = js.native
  val nameProp: java.lang.String = js.native
  var onafterupdate: js.Any = js.native
  var onbeforeupdate: js.Any = js.native
  var onclick: js.Any = js.native
  var ondblclick: js.Any = js.native
  var ondragstart: js.Any = js.native
  var onerrorupdate: js.Any = js.native
  var onhelp: js.Any = js.native
  var onkeydown: js.Any = js.native
  var onkeypress: js.Any = js.native
  var onkeyup: js.Any = js.native
  var onmousedown: js.Any = js.native
  var onmousemove: js.Any = js.native
  var onmouseout: js.Any = js.native
  var onmouseover: js.Any = js.native
  var onmouseup: js.Any = js.native
  var onreadystatechange: js.Any = js.native
  var onrowenter: js.Any = js.native
  var onrowexit: js.Any = js.native
  var onselectstart: js.Any = js.native
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2 = js.native
  @JSName("plugins")
  val plugins_Original: IHTMLElementCollection = js.native
  val protocol: java.lang.String = js.native
  val readyState: java.lang.String = js.native
  val referrer: java.lang.String = js.native
  @JSName("scripts")
  val scripts_Original: IHTMLElementCollection = js.native
  val security: java.lang.String = js.native
  val selection: IHTMLSelectionObject = js.native
  @JSName("styleSheets")
  val styleSheets_Original: IHTMLStyleSheetsCollection = js.native
  var title: java.lang.String = js.native
  var url: java.lang.String = js.native
  var vlinkColor: js.Any = js.native
  def all(): js.Any = js.native
  def all(name: js.Any): js.Any = js.native
  def all(name: js.Any, index: js.Any): js.Any = js.native
  def anchors(): js.Any = js.native
  def anchors(name: js.Any): js.Any = js.native
  def anchors(name: js.Any, index: js.Any): js.Any = js.native
  def applets(): js.Any = js.native
  def applets(name: js.Any): js.Any = js.native
  def applets(name: js.Any, index: js.Any): js.Any = js.native
  def clear(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def createElement(eTag: java.lang.String): IHTMLElement = js.native
  /**
    * @param bstrHref [bstrHref='']
    * @param lIndex [lIndex=-1]
    */
  def createStyleSheet(): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: java.lang.String): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: java.lang.String, lIndex: scala.Double): IHTMLStyleSheet = js.native
  def elementFromPoint(x: scala.Double, y: scala.Double): IHTMLElement = js.native
  def embeds(): js.Any = js.native
  def embeds(name: js.Any): js.Any = js.native
  def embeds(name: js.Any, index: js.Any): js.Any = js.native
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: java.lang.String): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean, value: js.Any): scala.Boolean = js.native
  def execCommandShowHelp(cmdID: java.lang.String): scala.Boolean = js.native
  def forms(): js.Any = js.native
  def forms(name: js.Any): js.Any = js.native
  def forms(name: js.Any, index: js.Any): js.Any = js.native
  def frames(pvarIndex: js.Any): js.Any = js.native
  def images(): js.Any = js.native
  def images(name: js.Any): js.Any = js.native
  def images(name: js.Any, index: js.Any): js.Any = js.native
  def links(): js.Any = js.native
  def links(name: js.Any): js.Any = js.native
  def links(name: js.Any, index: js.Any): js.Any = js.native
  /** @param url [url='text/html'] */
  def open(): js.Any = js.native
  def open(url: java.lang.String): js.Any = js.native
  def open(url: java.lang.String, name: js.Any): js.Any = js.native
  def open(url: java.lang.String, name: js.Any, features: js.Any): js.Any = js.native
  def open(url: java.lang.String, name: js.Any, features: js.Any, replace: js.Any): js.Any = js.native
  def parentWindow(pvarIndex: js.Any): js.Any = js.native
  def plugins(): js.Any = js.native
  def plugins(name: js.Any): js.Any = js.native
  def plugins(name: js.Any, index: js.Any): js.Any = js.native
  def queryCommandEnabled(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandIndeterm(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandState(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandSupported(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandText(cmdID: java.lang.String): java.lang.String = js.native
  def queryCommandValue(cmdID: java.lang.String): js.Any = js.native
  def scripts(): js.Any = js.native
  def scripts(name: js.Any): js.Any = js.native
  def scripts(name: js.Any, index: js.Any): js.Any = js.native
  def styleSheets(pvarIndex: js.Any): js.Any = js.native
  def write(psarray: js.Any*): scala.Unit = js.native
  def writeln(psarray: js.Any*): scala.Unit = js.native
}

