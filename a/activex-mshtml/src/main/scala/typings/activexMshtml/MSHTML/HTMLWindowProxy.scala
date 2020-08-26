package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLWindowProxy extends js.Object {
  val applicationCache: typings.activexMshtml.MSHTML.applicationCache = js.native
  val clientInformation: IOmNavigator = js.native
  val clipboardData: IHTMLDataTransfer = js.native
  val closed: Boolean = js.native
  val constructor: js.Any = js.native
  var defaultStatus: String = js.native
  val document: IHTMLDocument2 = js.native
  val event: IHTMLEventObj = js.native
  val external: js.Any = js.native
  val frameElement: IHTMLFrameBase = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  val history: IOmHistory = js.native
  val innerHeight: Double = js.native
  val innerWidth: Double = js.native
  val length: Double = js.native
  val localStorage: IHTMLStorage = js.native
  val location: IHTMLLocation = js.native
  val maxConnectionsPerServer: Double = js.native
  var name: String = js.native
  val navigator: IOmNavigator = js.native
  var offscreenBuffering: js.Any = js.native
  var onabort: js.Any = js.native
  var onafterprint: js.Any = js.native
  var onbeforeprint: js.Any = js.native
  var onbeforeunload: js.Any = js.native
  var onblur: js.Any = js.native
  var oncanplay: js.Any = js.native
  var oncanplaythrough: js.Any = js.native
  var onchange: js.Any = js.native
  var onclick: js.Any = js.native
  var oncontextmenu: js.Any = js.native
  var ondblclick: js.Any = js.native
  var ondrag: js.Any = js.native
  var ondragend: js.Any = js.native
  var ondragenter: js.Any = js.native
  var ondragleave: js.Any = js.native
  var ondragover: js.Any = js.native
  var ondragstart: js.Any = js.native
  var ondrop: js.Any = js.native
  var ondurationchange: js.Any = js.native
  var onemptied: js.Any = js.native
  var onended: js.Any = js.native
  var onerror: js.Any = js.native
  var onfocus: js.Any = js.native
  var onfocusin: js.Any = js.native
  var onfocusout: js.Any = js.native
  var onhashchange: js.Any = js.native
  var onhelp: js.Any = js.native
  var oninput: js.Any = js.native
  var onkeydown: js.Any = js.native
  var onkeypress: js.Any = js.native
  var onkeyup: js.Any = js.native
  var onload: js.Any = js.native
  var onloadeddata: js.Any = js.native
  var onloadedmetadata: js.Any = js.native
  var onloadstart: js.Any = js.native
  var onmessage: js.Any = js.native
  var onmousedown: js.Any = js.native
  var onmouseenter: js.Any = js.native
  var onmouseleave: js.Any = js.native
  var onmousemove: js.Any = js.native
  var onmouseout: js.Any = js.native
  var onmouseover: js.Any = js.native
  var onmouseup: js.Any = js.native
  var onmousewheel: js.Any = js.native
  var onmsgesturechange: js.Any = js.native
  var onmsgesturedoubletap: js.Any = js.native
  var onmsgestureend: js.Any = js.native
  var onmsgesturehold: js.Any = js.native
  var onmsgesturestart: js.Any = js.native
  var onmsgesturetap: js.Any = js.native
  var onmsinertiastart: js.Any = js.native
  var onmspointercancel: js.Any = js.native
  var onmspointerdown: js.Any = js.native
  var onmspointerhover: js.Any = js.native
  var onmspointermove: js.Any = js.native
  var onmspointerout: js.Any = js.native
  var onmspointerover: js.Any = js.native
  var onmspointerup: js.Any = js.native
  var onoffline: js.Any = js.native
  var ononline: js.Any = js.native
  var onpause: js.Any = js.native
  var onplay: js.Any = js.native
  var onplaying: js.Any = js.native
  var onpopstate: js.Any = js.native
  var onprogress: js.Any = js.native
  var onratechange: js.Any = js.native
  var onreadystatechange: js.Any = js.native
  var onreset: js.Any = js.native
  var onresize: js.Any = js.native
  var onscroll: js.Any = js.native
  var onseeked: js.Any = js.native
  var onseeking: js.Any = js.native
  var onselect: js.Any = js.native
  var onstalled: js.Any = js.native
  var onstorage: js.Any = js.native
  var onsubmit: js.Any = js.native
  var onsuspend: js.Any = js.native
  var ontimeupdate: js.Any = js.native
  var onunload: js.Any = js.native
  var onvolumechange: js.Any = js.native
  var onwaiting: js.Any = js.native
  var opener: js.Any = js.native
  val outerHeight: Double = js.native
  val outerWidth: Double = js.native
  val pageXOffset: Double = js.native
  val pageYOffset: Double = js.native
  @JSName("parent")
  val parent_Original: IHTMLWindow2 = js.native
  var performance: js.Any = js.native
  val screen: IHTMLScreen = js.native
  val screenLeft: Double = js.native
  val screenTop: Double = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  @JSName("self")
  val self_Original: IHTMLWindow2 = js.native
  val sessionStorage: IHTMLStorage = js.native
  var status: String = js.native
  val styleMedia: IHTMLStyleMedia = js.native
  @JSName("top")
  val top_Original: IHTMLWindow2 = js.native
  @JSName("window")
  val window_Original: IHTMLWindow2 = js.native
  def apply(pvarIndex: js.Any): js.Any = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  /** @param message [message=''] */
  def alert(): Unit = js.native
  def alert(message: String): Unit = js.native
  def attachEvent(event: String, pdisp: js.Any): Boolean = js.native
  def blur(): Unit = js.native
  def clearInterval(timerID: Double): Unit = js.native
  def clearTimeout(timerID: Double): Unit = js.native
  def close(): Unit = js.native
  /** @param message [message=''] */
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  def createPopup(): js.Any = js.native
  def createPopup(varArgIn: js.Any): js.Any = js.native
  def detachEvent(event: String, pdisp: js.Any): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  /** @param language [language='JScript'] */
  def execScript(code: String): js.Any = js.native
  def execScript(code: String, language: String): js.Any = js.native
  def focus(): Unit = js.native
  def frames(pvarIndex: js.Any): js.Any = js.native
  /** @param bstrPseudoElt [bstrPseudoElt=''] */
  def getComputedStyle(varArgIn: IHTMLDOMNode): IHTMLCSSStyleDeclaration = js.native
  def getComputedStyle(varArgIn: IHTMLDOMNode, bstrPseudoElt: String): IHTMLCSSStyleDeclaration = js.native
  def getSelection(): IHTMLSelection = js.native
  def item(pvarIndex: js.Any): js.Any = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def msWriteProfilerMark(bstrProfilerMarkName: String): Unit = js.native
  def navigate(url: String): Unit = js.native
  /**
    * @param url [url='']
    * @param name [name='']
    * @param features [features='']
    * @param replace [replace=false]
    */
  def open(): IHTMLWindow2 = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): IHTMLWindow2 = js.native
  def open(url: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], features: String): IHTMLWindow2 = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    features: String,
    replace: Boolean
  ): IHTMLWindow2 = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String): IHTMLWindow2 = js.native
  def open(
    url: js.UndefOr[scala.Nothing],
    name: String,
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): IHTMLWindow2 = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String, features: String): IHTMLWindow2 = js.native
  def open(url: js.UndefOr[scala.Nothing], name: String, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String): IHTMLWindow2 = js.native
  def open(
    url: String,
    name: js.UndefOr[scala.Nothing],
    features: js.UndefOr[scala.Nothing],
    replace: Boolean
  ): IHTMLWindow2 = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: String): IHTMLWindow2 = js.native
  def open(url: String, name: js.UndefOr[scala.Nothing], features: String, replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String, name: String): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: js.UndefOr[scala.Nothing], replace: Boolean): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: String): IHTMLWindow2 = js.native
  def open(url: String, name: String, features: String, replace: Boolean): IHTMLWindow2 = js.native
  def parent(pvarIndex: js.Any): js.Any = js.native
  def postMessage(msg: String): Unit = js.native
  def postMessage(msg: String, targetOrigin: js.Any): Unit = js.native
  def print(): Unit = js.native
  /**
    * @param message [message='']
    * @param defstr [defstr='undefined']
    */
  def prompt(): js.Any = js.native
  def prompt(message: js.UndefOr[scala.Nothing], defstr: String): js.Any = js.native
  def prompt(message: String): js.Any = js.native
  def prompt(message: String, defstr: String): js.Any = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def resizeBy(x: Double, y: Double): Unit = js.native
  def resizeTo(x: Double, y: Double): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def self(pvarIndex: js.Any): js.Any = js.native
  def setInterval(expression: js.Any, msec: Double): Double = js.native
  def setInterval(expression: js.Any, msec: Double, language: js.Any): Double = js.native
  def setTimeout(expression: js.Any, msec: Double): Double = js.native
  def setTimeout(expression: js.Any, msec: Double, language: js.Any): Double = js.native
  /** @param features [features=''] */
  def showHelp(helpURL: String, helpArg: js.Any): Unit = js.native
  def showHelp(helpURL: String, helpArg: js.Any, features: String): Unit = js.native
  def showModalDialog(dialog: String): js.Any = js.native
  def showModalDialog(dialog: String, varArgIn: js.UndefOr[scala.Nothing], varOptions: js.Any): js.Any = js.native
  def showModalDialog(dialog: String, varArgIn: js.Any): js.Any = js.native
  def showModalDialog(dialog: String, varArgIn: js.Any, varOptions: js.Any): js.Any = js.native
  /** @param url [url=''] */
  def showModelessDialog(): IHTMLWindow2 = js.native
  def showModelessDialog(url: js.UndefOr[scala.Nothing], varArgIn: js.UndefOr[scala.Nothing], options: js.Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: js.UndefOr[scala.Nothing], varArgIn: js.Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: js.UndefOr[scala.Nothing], varArgIn: js.Any, options: js.Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: String): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: js.UndefOr[scala.Nothing], options: js.Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: js.Any): IHTMLWindow2 = js.native
  def showModelessDialog(url: String, varArgIn: js.Any, options: js.Any): IHTMLWindow2 = js.native
  def toStaticHTML(bstrHTML: String): String = js.native
  def top(pvarIndex: js.Any): js.Any = js.native
  def window(pvarIndex: js.Any): js.Any = js.native
}

