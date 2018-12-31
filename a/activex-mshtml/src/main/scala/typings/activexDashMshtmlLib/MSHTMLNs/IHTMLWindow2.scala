package typings
package activexDashMshtmlLib.MSHTMLNs

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
  val closed: scala.Boolean = js.native
  var defaultStatus: java.lang.String = js.native
  val document: IHTMLDocument2 = js.native
  val event: IHTMLEventObj = js.native
  val external: js.Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  val history: IOmHistory = js.native
  val length: scala.Double = js.native
  val location: IHTMLLocation = js.native
  var name: java.lang.String = js.native
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
  var status: java.lang.String = js.native
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
  def alert(): scala.Unit = js.native
  def alert(message: java.lang.String): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def clearInterval(timerID: scala.Double): scala.Unit = js.native
  def clearTimeout(timerID: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  /** @param message [message=''] */
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  /** @param language [language='JScript'] */
  def execScript(code: java.lang.String): js.Any = js.native
  def execScript(code: java.lang.String, language: java.lang.String): js.Any = js.native
  def focus(): scala.Unit = js.native
  def frames(pvarIndex: js.Any): js.Any = js.native
  def item(pvarIndex: js.Any): js.Any = js.native
  def moveBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def navigate(url: java.lang.String): scala.Unit = js.native
  /**
    * @param url [url='']
    * @param name [name='']
    * @param features [features='']
    * @param replace [replace=false]
    */
  def open(): IHTMLWindow2 = js.native
  def open(url: java.lang.String): IHTMLWindow2 = js.native
  def open(url: java.lang.String, name: java.lang.String): IHTMLWindow2 = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): IHTMLWindow2 = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String, replace: scala.Boolean): IHTMLWindow2 = js.native
  def parent(pvarIndex: js.Any): js.Any = js.native
  /**
    * @param message [message='']
    * @param defstr [defstr='undefined']
    */
  def prompt(): js.Any = js.native
  def prompt(message: java.lang.String): js.Any = js.native
  def prompt(message: java.lang.String, defstr: java.lang.String): js.Any = js.native
  def resizeBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resizeTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def self(pvarIndex: js.Any): js.Any = js.native
  def setInterval(expression: java.lang.String, msec: scala.Double): scala.Double = js.native
  def setInterval(expression: java.lang.String, msec: scala.Double, language: js.Any): scala.Double = js.native
  def setTimeout(expression: java.lang.String, msec: scala.Double): scala.Double = js.native
  def setTimeout(expression: java.lang.String, msec: scala.Double, language: js.Any): scala.Double = js.native
  /** @param features [features=''] */
  def showHelp(helpURL: java.lang.String, helpArg: js.Any): scala.Unit = js.native
  def showHelp(helpURL: java.lang.String, helpArg: js.Any, features: java.lang.String): scala.Unit = js.native
  def showModalDialog(dialog: java.lang.String): js.Any = js.native
  def showModalDialog(dialog: java.lang.String, varArgIn: js.Any): js.Any = js.native
  def showModalDialog(dialog: java.lang.String, varArgIn: js.Any, varOptions: js.Any): js.Any = js.native
  def top(pvarIndex: js.Any): js.Any = js.native
  def window(pvarIndex: js.Any): js.Any = js.native
}

