package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDocument2 extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDocument2_typekey")
  var MSHTMLDotIHTMLDocument2_typekey: IHTMLDocument2 = js.native
  
  val Script: Any = js.native
  
  val activeElement: IHTMLElement = js.native
  
  var alinkColor: Any = js.native
  
  def all(): Any = js.native
  def all(name: Any): Any = js.native
  def all(name: Any, index: Any): Any = js.native
  def all(name: Unit, index: Any): Any = js.native
  @JSName("all")
  val all_Original: IHTMLElementCollection = js.native
  
  def anchors(): Any = js.native
  def anchors(name: Any): Any = js.native
  def anchors(name: Any, index: Any): Any = js.native
  def anchors(name: Unit, index: Any): Any = js.native
  @JSName("anchors")
  val anchors_Original: IHTMLElementCollection = js.native
  
  def applets(): Any = js.native
  def applets(name: Any): Any = js.native
  def applets(name: Any, index: Any): Any = js.native
  def applets(name: Unit, index: Any): Any = js.native
  @JSName("applets")
  val applets_Original: IHTMLElementCollection = js.native
  
  var bgColor: Any = js.native
  
  val body: IHTMLElement = js.native
  
  var charset: String = js.native
  
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  var cookie: String = js.native
  
  def createElement(eTag: String): IHTMLElement = js.native
  
  /**
    * @param bstrHref [bstrHref='']
    * @param lIndex [lIndex=-1]
    */
  def createStyleSheet(): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: String, lIndex: Double): IHTMLStyleSheet = js.native
  def createStyleSheet(bstrHref: Unit, lIndex: Double): IHTMLStyleSheet = js.native
  
  var defaultCharset: String = js.native
  
  var designMode: String = js.native
  
  var domain: String = js.native
  
  def elementFromPoint(x: Double, y: Double): IHTMLElement = js.native
  
  def embeds(): Any = js.native
  def embeds(name: Any): Any = js.native
  def embeds(name: Any, index: Any): Any = js.native
  def embeds(name: Unit, index: Any): Any = js.native
  @JSName("embeds")
  val embeds_Original: IHTMLElementCollection = js.native
  
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: String): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean, value: Any): Boolean = js.native
  def execCommand(cmdID: String, showUI: Unit, value: Any): Boolean = js.native
  
  def execCommandShowHelp(cmdID: String): Boolean = js.native
  
  var expando: Boolean = js.native
  
  var fgColor: Any = js.native
  
  val fileCreatedDate: String = js.native
  
  val fileModifiedDate: String = js.native
  
  val fileSize: String = js.native
  
  val fileUpdatedDate: String = js.native
  
  def forms(): Any = js.native
  def forms(name: Any): Any = js.native
  def forms(name: Any, index: Any): Any = js.native
  def forms(name: Unit, index: Any): Any = js.native
  @JSName("forms")
  val forms_Original: IHTMLElementCollection = js.native
  
  def frames(pvarIndex: Any): Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  
  def images(): Any = js.native
  def images(name: Any): Any = js.native
  def images(name: Any, index: Any): Any = js.native
  def images(name: Unit, index: Any): Any = js.native
  @JSName("images")
  val images_Original: IHTMLElementCollection = js.native
  
  val lastModified: String = js.native
  
  var linkColor: Any = js.native
  
  def links(): Any = js.native
  def links(name: Any): Any = js.native
  def links(name: Any, index: Any): Any = js.native
  def links(name: Unit, index: Any): Any = js.native
  @JSName("links")
  val links_Original: IHTMLElementCollection = js.native
  
  val location: IHTMLLocation = js.native
  
  val mimeType: String = js.native
  
  val nameProp: String = js.native
  
  var onafterupdate: Any = js.native
  
  var onbeforeupdate: Any = js.native
  
  var onclick: Any = js.native
  
  var ondblclick: Any = js.native
  
  var ondragstart: Any = js.native
  
  var onerrorupdate: Any = js.native
  
  var onhelp: Any = js.native
  
  var onkeydown: Any = js.native
  
  var onkeypress: Any = js.native
  
  var onkeyup: Any = js.native
  
  var onmousedown: Any = js.native
  
  var onmousemove: Any = js.native
  
  var onmouseout: Any = js.native
  
  var onmouseover: Any = js.native
  
  var onmouseup: Any = js.native
  
  var onreadystatechange: Any = js.native
  
  var onrowenter: Any = js.native
  
  var onrowexit: Any = js.native
  
  var onselectstart: Any = js.native
  
  /** @param url [url='text/html'] */
  def open(): Any = js.native
  def open(url: String): Any = js.native
  def open(url: String, name: Any): Any = js.native
  def open(url: String, name: Any, features: Any): Any = js.native
  def open(url: String, name: Any, features: Any, replace: Any): Any = js.native
  def open(url: String, name: Any, features: Unit, replace: Any): Any = js.native
  def open(url: String, name: Unit, features: Any): Any = js.native
  def open(url: String, name: Unit, features: Any, replace: Any): Any = js.native
  def open(url: String, name: Unit, features: Unit, replace: Any): Any = js.native
  def open(url: Unit, name: Any): Any = js.native
  def open(url: Unit, name: Any, features: Any): Any = js.native
  def open(url: Unit, name: Any, features: Any, replace: Any): Any = js.native
  def open(url: Unit, name: Any, features: Unit, replace: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Any, replace: Any): Any = js.native
  def open(url: Unit, name: Unit, features: Unit, replace: Any): Any = js.native
  
  def parentWindow(pvarIndex: Any): Any = js.native
  @JSName("parentWindow")
  val parentWindow_Original: IHTMLWindow2 = js.native
  
  def plugins(): Any = js.native
  def plugins(name: Any): Any = js.native
  def plugins(name: Any, index: Any): Any = js.native
  def plugins(name: Unit, index: Any): Any = js.native
  @JSName("plugins")
  val plugins_Original: IHTMLElementCollection = js.native
  
  val protocol: String = js.native
  
  def queryCommandEnabled(cmdID: String): Boolean = js.native
  
  def queryCommandIndeterm(cmdID: String): Boolean = js.native
  
  def queryCommandState(cmdID: String): Boolean = js.native
  
  def queryCommandSupported(cmdID: String): Boolean = js.native
  
  def queryCommandText(cmdID: String): String = js.native
  
  def queryCommandValue(cmdID: String): Any = js.native
  
  val readyState: String = js.native
  
  val referrer: String = js.native
  
  def scripts(): Any = js.native
  def scripts(name: Any): Any = js.native
  def scripts(name: Any, index: Any): Any = js.native
  def scripts(name: Unit, index: Any): Any = js.native
  @JSName("scripts")
  val scripts_Original: IHTMLElementCollection = js.native
  
  val security: String = js.native
  
  val selection: IHTMLSelectionObject = js.native
  
  def styleSheets(pvarIndex: Any): Any = js.native
  @JSName("styleSheets")
  val styleSheets_Original: IHTMLStyleSheetsCollection = js.native
  
  var title: String = js.native
  
  var url: String = js.native
  
  var vlinkColor: Any = js.native
  
  def write(psarray: Any*): Unit = js.native
  
  def writeln(psarray: Any*): Unit = js.native
}
