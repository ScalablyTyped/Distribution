package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLWindow2 extends StObject {
  
  def apply(pvarIndex: Any): Any = js.native
  
  def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  /** @param message [message=''] */
  def alert(): Unit = js.native
  def alert(message: String): Unit = js.native
  
  val applicationCache: typings.activexMshtml.MSHTML.applicationCache = js.native
  
  def attachEvent(event: String, pdisp: Any): Boolean = js.native
  
  def blur(): Unit = js.native
  
  def clearInterval(timerID: Double): Unit = js.native
  
  def clearTimeout(timerID: Double): Unit = js.native
  
  val clientInformation: IOmNavigator = js.native
  
  val clipboardData: IHTMLDataTransfer = js.native
  
  def close(): Unit = js.native
  
  val closed: Boolean = js.native
  
  /** @param message [message=''] */
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  
  val constructor: Any = js.native
  
  def createPopup(): Any = js.native
  def createPopup(varArgIn: Any): Any = js.native
  
  var defaultStatus: String = js.native
  
  def detachEvent(event: String, pdisp: Any): Unit = js.native
  
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  
  val document: IHTMLDocument2 = js.native
  
  val event: IHTMLEventObj = js.native
  
  /** @param language [language='JScript'] */
  def execScript(code: String): Any = js.native
  def execScript(code: String, language: String): Any = js.native
  
  val external: Any = js.native
  
  def focus(): Unit = js.native
  
  val frameElement: IHTMLFrameBase = js.native
  
  def frames(pvarIndex: Any): Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  
  /** @param bstrPseudoElt [bstrPseudoElt=''] */
  def getComputedStyle(varArgIn: IHTMLDOMNode): IHTMLCSSStyleDeclaration = js.native
  def getComputedStyle(varArgIn: IHTMLDOMNode, bstrPseudoElt: String): IHTMLCSSStyleDeclaration = js.native
  
  def getSelection(): IHTMLSelection = js.native
  
  val history: IOmHistory = js.native
  
  val innerHeight: Double = js.native
  
  val innerWidth: Double = js.native
  
  def item(pvarIndex: Any): Any = js.native
  
  val length: Double = js.native
  
  val localStorage: IHTMLStorage = js.native
  
  val location: IHTMLLocation = js.native
  
  val maxConnectionsPerServer: Double = js.native
  
  def moveBy(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  def msWriteProfilerMark(bstrProfilerMarkName: String): Unit = js.native
  
  var name: String = js.native
  
  def navigate(url: String): Unit = js.native
  
  val navigator: IOmNavigator = js.native
  
  var offscreenBuffering: Any = js.native
  
  var onabort: Any = js.native
  
  var onafterprint: Any = js.native
  
  var onbeforeprint: Any = js.native
  
  var onbeforeunload: Any = js.native
  
  var onblur: Any = js.native
  
  var oncanplay: Any = js.native
  
  var oncanplaythrough: Any = js.native
  
  var onchange: Any = js.native
  
  var onclick: Any = js.native
  
  var oncontextmenu: Any = js.native
  
  var ondblclick: Any = js.native
  
  var ondrag: Any = js.native
  
  var ondragend: Any = js.native
  
  var ondragenter: Any = js.native
  
  var ondragleave: Any = js.native
  
  var ondragover: Any = js.native
  
  var ondragstart: Any = js.native
  
  var ondrop: Any = js.native
  
  var ondurationchange: Any = js.native
  
  var onemptied: Any = js.native
  
  var onended: Any = js.native
  
  var onerror: Any = js.native
  
  var onfocus: Any = js.native
  
  var onfocusin: Any = js.native
  
  var onfocusout: Any = js.native
  
  var onhashchange: Any = js.native
  
  var onhelp: Any = js.native
  
  var oninput: Any = js.native
  
  var onkeydown: Any = js.native
  
  var onkeypress: Any = js.native
  
  var onkeyup: Any = js.native
  
  var onload: Any = js.native
  
  var onloadeddata: Any = js.native
  
  var onloadedmetadata: Any = js.native
  
  var onloadstart: Any = js.native
  
  var onmessage: Any = js.native
  
  var onmousedown: Any = js.native
  
  var onmouseenter: Any = js.native
  
  var onmouseleave: Any = js.native
  
  var onmousemove: Any = js.native
  
  var onmouseout: Any = js.native
  
  var onmouseover: Any = js.native
  
  var onmouseup: Any = js.native
  
  var onmousewheel: Any = js.native
  
  var onmsgesturechange: Any = js.native
  
  var onmsgesturedoubletap: Any = js.native
  
  var onmsgestureend: Any = js.native
  
  var onmsgesturehold: Any = js.native
  
  var onmsgesturestart: Any = js.native
  
  var onmsgesturetap: Any = js.native
  
  var onmsinertiastart: Any = js.native
  
  var onmspointercancel: Any = js.native
  
  var onmspointerdown: Any = js.native
  
  var onmspointerhover: Any = js.native
  
  var onmspointermove: Any = js.native
  
  var onmspointerout: Any = js.native
  
  var onmspointerover: Any = js.native
  
  var onmspointerup: Any = js.native
  
  var onoffline: Any = js.native
  
  var ononline: Any = js.native
  
  var onpause: Any = js.native
  
  var onplay: Any = js.native
  
  var onplaying: Any = js.native
  
  var onpopstate: Any = js.native
  
  var onprogress: Any = js.native
  
  var onratechange: Any = js.native
  
  var onreadystatechange: Any = js.native
  
  var onreset: Any = js.native
  
  var onresize: Any = js.native
  
  var onscroll: Any = js.native
  
  var onseeked: Any = js.native
  
  var onseeking: Any = js.native
  
  var onselect: Any = js.native
  
  var onstalled: Any = js.native
  
  var onstorage: Any = js.native
  
  var onsubmit: Any = js.native
  
  var onsuspend: Any = js.native
  
  var ontimeupdate: Any = js.native
  
  var onunload: Any = js.native
  
  var onvolumechange: Any = js.native
  
  var onwaiting: Any = js.native
  
  /**
    * @param url [url='']
    * @param name [name='']
    * @param features [features='']
    * @param replace [replace=false]
    */
  def open(): IHTMLWindow2 = js.native
  def open(url: String): IHTMLWindow2 = js.native
  def open(url: String, name: String): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: String): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: Unit, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String, name: Unit, features: String): IHTMLWindow2 = js.native
  def open(url: String, name: Unit, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String, name: Unit, features: Unit, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: Unit, name: String): IHTMLWindow2 = js.native
  def open(url: Unit, name: String, features: String): IHTMLWindow2 = js.native
  def open(url: Unit, name: String, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: Unit, name: String, features: Unit, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: Unit, name: Unit, features: String): IHTMLWindow2 = js.native
  def open(url: Unit, name: Unit, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: Unit, name: Unit, features: Unit, replace: Boolean): IHTMLWindow2 = js.native
  
  var opener: Any = js.native
  
  val outerHeight: Double = js.native
  
  val outerWidth: Double = js.native
  
  val pageXOffset: Double = js.native
  
  val pageYOffset: Double = js.native
  
  def parent(pvarIndex: Any): Any = js.native
  @JSName("parent")
  val parent_Original: IHTMLWindow2 = js.native
  
  var performance: Any = js.native
  
  def postMessage(msg: String): Unit = js.native
  def postMessage(msg: String, targetOrigin: Any): Unit = js.native
  
  def print(): Unit = js.native
  
  /**
    * @param message [message='']
    * @param defstr [defstr='undefined']
    */
  def prompt(): Any = js.native
  def prompt(message: String): Any = js.native
  def prompt(message: String, defstr: String): Any = js.native
  def prompt(message: Unit, defstr: String): Any = js.native
  
  def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  def resizeTo(x: Double, y: Double): Unit = js.native
  
  val screen: IHTMLScreen = js.native
  
  val screenLeft: Double = js.native
  
  val screenTop: Double = js.native
  
  val screenX: Double = js.native
  
  val screenY: Double = js.native
  
  def scroll(x: Double, y: Double): Unit = js.native
  
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def self(pvarIndex: Any): Any = js.native
  @JSName("self")
  val self_Original: IHTMLWindow2 = js.native
  
  val sessionStorage: IHTMLStorage = js.native
  
  def setInterval(expression: Any, msec: Double): Double = js.native
  def setInterval(expression: Any, msec: Double, language: Any): Double = js.native
  
  def setTimeout(expression: Any, msec: Double): Double = js.native
  def setTimeout(expression: Any, msec: Double, language: Any): Double = js.native
  
  /** @param features [features=''] */
  def showHelp(helpURL: String, helpArg: Any): Unit = js.native
  def showHelp(helpURL: String, helpArg: Any, features: String): Unit = js.native
  
  def showModalDialog(dialog: String): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Any): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Any, varOptions: Any): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Unit, varOptions: Any): Any = js.native
  
  /** @param url [url=''] */
  def showModelessDialog(): IHTMLWindow2 = js.native
  def showModelessDialog(url: String): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: Any, options: Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: Unit, options: Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: Unit, varArgIn: Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: Unit, varArgIn: Any, options: Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: Unit, varArgIn: Unit, options: Any): IHTMLWindow2 = js.native
  
  var status: String = js.native
  
  val styleMedia: IHTMLStyleMedia = js.native
  
  def toStaticHTML(bstrHTML: String): String = js.native
  
  def top(pvarIndex: Any): Any = js.native
  @JSName("top")
  val top_Original: IHTMLWindow2 = js.native
  
  def window(pvarIndex: Any): Any = js.native
  @JSName("window")
  val window_Original: IHTMLWindow2 = js.native
}
