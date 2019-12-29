package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLTxtRange")
@js.native
class IHTMLTxtRange protected () extends js.Object {
  @JSName("MSHTML.IHTMLTxtRange_typekey")
  var MSHTMLDotIHTMLTxtRange_typekey: IHTMLTxtRange = js.native
  val htmlText: String = js.native
  var text: String = js.native
  /** @param start [start=true] */
  def collapse(): Unit = js.native
  def collapse(start: Boolean): Unit = js.native
  def compareEndPoints(how: String, sourceRange: IHTMLTxtRange): Double = js.native
  def duplicate(): IHTMLTxtRange = js.native
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: String): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean): Boolean = js.native
  def execCommand(cmdID: String, showUI: Boolean, value: js.Any): Boolean = js.native
  def execCommandShowHelp(cmdID: String): Boolean = js.native
  def expand(Unit: String): Boolean = js.native
  /**
    * @param Count [Count=1073741823]
    * @param flags [flags=0]
    */
  def findText(String: String): Boolean = js.native
  def findText(String: String, Count: Double): Boolean = js.native
  def findText(String: String, Count: Double, flags: Double): Boolean = js.native
  def getBookmark(): String = js.native
  def inRange(range: IHTMLTxtRange): Boolean = js.native
  def isEqual(range: IHTMLTxtRange): Boolean = js.native
  /** @param Count [Count=1] */
  def move(Unit: String): Double = js.native
  def move(Unit: String, Count: Double): Double = js.native
  /** @param Count [Count=1] */
  def moveEnd(Unit: String): Double = js.native
  def moveEnd(Unit: String, Count: Double): Double = js.native
  /** @param Count [Count=1] */
  def moveStart(Unit: String): Double = js.native
  def moveStart(Unit: String, Count: Double): Double = js.native
  def moveToBookmark(Bookmark: String): Boolean = js.native
  def moveToElementText(element: IHTMLElement): Unit = js.native
  def moveToPoint(x: Double, y: Double): Unit = js.native
  def parentElement(): IHTMLElement = js.native
  def pasteHTML(html: String): Unit = js.native
  def queryCommandEnabled(cmdID: String): Boolean = js.native
  def queryCommandIndeterm(cmdID: String): Boolean = js.native
  def queryCommandState(cmdID: String): Boolean = js.native
  def queryCommandSupported(cmdID: String): Boolean = js.native
  def queryCommandText(cmdID: String): String = js.native
  def queryCommandValue(cmdID: String): js.Any = js.native
  /** @param fStart [fStart=true] */
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(fStart: Boolean): Unit = js.native
  def select(): Unit = js.native
  def setEndPoint(how: String, sourceRange: IHTMLTxtRange): Unit = js.native
}

