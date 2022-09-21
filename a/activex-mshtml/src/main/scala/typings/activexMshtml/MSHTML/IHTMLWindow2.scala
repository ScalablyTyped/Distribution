package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLWindow2 extends StObject {
  
  def apply(pvarIndex: Any): Any = js.native
  
  def Image(): IHTMLImgElement = js.native
  def Image(width: Any): IHTMLImgElement = js.native
  def Image(width: Any, height: Any): IHTMLImgElement = js.native
  def Image(width: Unit, height: Any): IHTMLImgElement = js.native
  @JSName("Image")
  val Image_Original: HTMLImageElementFactory = js.native
  
  def Option(): IHTMLOptionElement = js.native
  def Option(text: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Any, defaultSelected: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Any, defaultSelected: Any, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Any, defaultSelected: Unit, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Unit, defaultSelected: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Unit, defaultSelected: Any, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Any, value: Unit, defaultSelected: Unit, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Any, defaultSelected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Any, defaultSelected: Any, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Any, defaultSelected: Unit, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Unit, defaultSelected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Unit, defaultSelected: Any, selected: Any): IHTMLOptionElement = js.native
  def Option(text: Unit, value: Unit, defaultSelected: Unit, selected: Any): IHTMLOptionElement = js.native
  @JSName("Option")
  val Option_Original: HTMLOptionElementFactory = js.native
  
  /** @param message [message=''] */
  def alert(): Unit = js.native
  def alert(message: String): Unit = js.native
  
  def blur(): Unit = js.native
  
  def clearInterval(timerID: Double): Unit = js.native
  
  def clearTimeout(timerID: Double): Unit = js.native
  
  val clientInformation: IOmNavigator = js.native
  
  def close(): Unit = js.native
  
  val closed: Boolean = js.native
  
  /** @param message [message=''] */
  def confirm(): Boolean = js.native
  def confirm(message: String): Boolean = js.native
  
  var defaultStatus: String = js.native
  
  val document: IHTMLDocument2 = js.native
  
  val event: IHTMLEventObj = js.native
  
  /** @param language [language='JScript'] */
  def execScript(code: String): Any = js.native
  def execScript(code: String, language: String): Any = js.native
  
  val external: Any = js.native
  
  def focus(): Unit = js.native
  
  def frames(pvarIndex: Any): Any = js.native
  @JSName("frames")
  val frames_Original: FramesCollection = js.native
  
  val history: IOmHistory = js.native
  
  def item(pvarIndex: Any): Any = js.native
  
  val length: Double = js.native
  
  val location: IHTMLLocation = js.native
  
  def moveBy(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  var name: String = js.native
  
  def navigate(url: String): Unit = js.native
  
  val navigator: IOmNavigator = js.native
  
  var offscreenBuffering: Any = js.native
  
  var onbeforeunload: Any = js.native
  
  var onblur: Any = js.native
  
  var onerror: Any = js.native
  
  var onfocus: Any = js.native
  
  var onhelp: Any = js.native
  
  var onload: Any = js.native
  
  var onresize: Any = js.native
  
  var onscroll: Any = js.native
  
  var onunload: Any = js.native
  
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
  
  def parent(pvarIndex: Any): Any = js.native
  @JSName("parent")
  val parent_Original: IHTMLWindow2 = js.native
  
  /**
    * @param message [message='']
    * @param defstr [defstr='undefined']
    */
  def prompt(): Any = js.native
  def prompt(message: String): Any = js.native
  def prompt(message: String, defstr: String): Any = js.native
  def prompt(message: Unit, defstr: String): Any = js.native
  
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  def resizeTo(x: Double, y: Double): Unit = js.native
  
  val screen: IHTMLScreen = js.native
  
  def scroll(x: Double, y: Double): Unit = js.native
  
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def self(pvarIndex: Any): Any = js.native
  @JSName("self")
  val self_Original: IHTMLWindow2 = js.native
  
  def setInterval(expression: String, msec: Double): Double = js.native
  def setInterval(expression: String, msec: Double, language: Any): Double = js.native
  
  def setTimeout(expression: String, msec: Double): Double = js.native
  def setTimeout(expression: String, msec: Double, language: Any): Double = js.native
  
  /** @param features [features=''] */
  def showHelp(helpURL: String, helpArg: Any): Unit = js.native
  def showHelp(helpURL: String, helpArg: Any, features: String): Unit = js.native
  
  def showModalDialog(dialog: String): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Any): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Any, varOptions: Any): Any = js.native
  def showModalDialog(dialog: String, varArgIn: Unit, varOptions: Any): Any = js.native
  
  var status: String = js.native
  
  def top(pvarIndex: Any): Any = js.native
  @JSName("top")
  val top_Original: IHTMLWindow2 = js.native
  
  def window(pvarIndex: Any): Any = js.native
  @JSName("window")
  val window_Original: IHTMLWindow2 = js.native
}
