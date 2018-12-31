package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLTxtRange")
@js.native
class IHTMLTxtRange protected () extends js.Object {
  var `MSHTML.IHTMLTxtRange_typekey`: IHTMLTxtRange = js.native
  val htmlText: java.lang.String = js.native
  var text: java.lang.String = js.native
  /** @param start [start=true] */
  def collapse(): scala.Unit = js.native
  def collapse(start: scala.Boolean): scala.Unit = js.native
  def compareEndPoints(how: java.lang.String, sourceRange: IHTMLTxtRange): scala.Double = js.native
  def duplicate(): IHTMLTxtRange = js.native
  /** @param showUI [showUI=false] */
  def execCommand(cmdID: java.lang.String): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(cmdID: java.lang.String, showUI: scala.Boolean, value: js.Any): scala.Boolean = js.native
  def execCommandShowHelp(cmdID: java.lang.String): scala.Boolean = js.native
  def expand(Unit: java.lang.String): scala.Boolean = js.native
  /**
    * @param Count [Count=1073741823]
    * @param flags [flags=0]
    */
  def findText(String: java.lang.String): scala.Boolean = js.native
  def findText(String: java.lang.String, Count: scala.Double): scala.Boolean = js.native
  def findText(String: java.lang.String, Count: scala.Double, flags: scala.Double): scala.Boolean = js.native
  def getBookmark(): java.lang.String = js.native
  def inRange(range: IHTMLTxtRange): scala.Boolean = js.native
  def isEqual(range: IHTMLTxtRange): scala.Boolean = js.native
  /** @param Count [Count=1] */
  def move(Unit: java.lang.String): scala.Double = js.native
  def move(Unit: java.lang.String, Count: scala.Double): scala.Double = js.native
  /** @param Count [Count=1] */
  def moveEnd(Unit: java.lang.String): scala.Double = js.native
  def moveEnd(Unit: java.lang.String, Count: scala.Double): scala.Double = js.native
  /** @param Count [Count=1] */
  def moveStart(Unit: java.lang.String): scala.Double = js.native
  def moveStart(Unit: java.lang.String, Count: scala.Double): scala.Double = js.native
  def moveToBookmark(Bookmark: java.lang.String): scala.Boolean = js.native
  def moveToElementText(element: IHTMLElement): scala.Unit = js.native
  def moveToPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def parentElement(): IHTMLElement = js.native
  def pasteHTML(html: java.lang.String): scala.Unit = js.native
  def queryCommandEnabled(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandIndeterm(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandState(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandSupported(cmdID: java.lang.String): scala.Boolean = js.native
  def queryCommandText(cmdID: java.lang.String): java.lang.String = js.native
  def queryCommandValue(cmdID: java.lang.String): js.Any = js.native
  /** @param fStart [fStart=true] */
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(fStart: scala.Boolean): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def setEndPoint(how: java.lang.String, sourceRange: IHTMLTxtRange): scala.Unit = js.native
}

