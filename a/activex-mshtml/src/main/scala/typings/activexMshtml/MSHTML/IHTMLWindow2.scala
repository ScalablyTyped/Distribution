package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLWindow2 extends js.Object {
  @JSName("Image")
  val Image_Original: HTMLImageElementFactory = js.native
  @JSName("Option")
  val Option_Original: HTMLOptionElementFactory = js.native
  val clientInformation: IOmNavigator = js.native
  val closed: Boolean = js.native
  var defaultStatus: String = js.native
  val document: IHTMLDocument2 = js.native
  val event: IHTMLEventObj = js.native
  val external: js.Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  val history: IOmHistory = js.native
  val length: Double = js.native
  val location: IHTMLLocation = js.native
  var name: String = js.native
  val navigator: IOmNavigator = js.native
  var offscreenBuffering: js.Any = js.native
  var onbeforeunload: js.Any = js.native
  var onblur: js.Any = js.native
  var onerror: js.Any = js.native
  var onfocus: js.Any = js.native
  var onhelp: js.Any = js.native
  var onload: js.Any = js.native
  var onresize: js.Any = js.native
  var onscroll: js.Any = js.native
  var onunload: js.Any = js.native
  var opener: js.Any = js.native
  @JSName("parent")
  val parent_Original: IHTMLWindow2 = js.native
  val screen: IHTMLScreen = js.native
  @JSName("self")
  val self_Original: IHTMLWindow2 = js.native
  var status: String = js.native
  @JSName("top")
  val top_Original: IHTMLWindow2 = js.native
  @JSName("window")
  val window_Original: IHTMLWindow2 = js.native
  def apply(pvarIndex: js.Any): js.Any = js.native
  def Image(): IHTMLImgElement = js.native
  def Image(width: js.Any): IHTMLImgElement = js.native
  def Image(width: js.Any, height: js.Any): IHTMLImgElement = js.native
  def Option(): IHTMLOptionElement = js.native
  def Option(text: js.Any): IHTMLOptionElement = js.native
  def Option(text: js.Any, value: js.Any): IHTMLOptionElement = js.native
  def Option(text: js.Any, value: js.Any, defaultSelected: js.Any): IHTMLOptionElement = js.native
  def Option(text: js.Any, value: js.Any, defaultSelected: js.Any, selected: js.Any): IHTMLOptionElement = js.native
  /** @param message [message=''] */
  def alert(): Unit = js.native
  def alert(message: String): Unit = js.native
  def blur(): Unit = js.native
  def clearInterval(timerID: Double): Unit = js.native
  def clearTimeout(timerID: Double): Unit = js.native
  def close(): Unit = js.native
  /** @param message [message=''] */
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  /** @param language [language='JScript'] */
  def execScript(code: String): js.Any = js.native
  def execScript(code: String, language: String): js.Any = js.native
  def focus(): Unit = js.native
  def frames(pvarIndex: js.Any): js.Any = js.native
  def item(pvarIndex: js.Any): js.Any = js.native
  def moveBy(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def navigate(url: String): Unit = js.native
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
  def parent(pvarIndex: js.Any): js.Any = js.native
  /**
    * @param message [message='']
    * @param defstr [defstr='undefined']
    */
  def prompt(): js.Any = js.native
  def prompt(message: String): js.Any = js.native
  def prompt(message: String, defstr: String): js.Any = js.native
  def resizeBy(x: Double, y: Double): Unit = js.native
  def resizeTo(x: Double, y: Double): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def self(pvarIndex: js.Any): js.Any = js.native
  def setInterval(expression: String, msec: Double): Double = js.native
  def setInterval(expression: String, msec: Double, language: js.Any): Double = js.native
  def setTimeout(expression: String, msec: Double): Double = js.native
  def setTimeout(expression: String, msec: Double, language: js.Any): Double = js.native
  /** @param features [features=''] */
  def showHelp(helpURL: String, helpArg: js.Any): Unit = js.native
  def showHelp(helpURL: String, helpArg: js.Any, features: String): Unit = js.native
  def showModalDialog(dialog: String): js.Any = js.native
  def showModalDialog(dialog: String, varArgIn: js.Any): js.Any = js.native
  def showModalDialog(dialog: String, varArgIn: js.Any, varOptions: js.Any): js.Any = js.native
  def top(pvarIndex: js.Any): js.Any = js.native
  def window(pvarIndex: js.Any): js.Any = js.native
}

