package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Speech")
@js.native
class Speech protected () extends js.Object {
  var Direction: XlSpeakDirection = js.native
  var `Excel.Speech_typekey`: Speech = js.native
  var SpeakCellOnEnter: scala.Boolean = js.native
  def Speak(Text: java.lang.String): scala.Unit = js.native
  def Speak(Text: java.lang.String, SpeakAsync: scala.Boolean): scala.Unit = js.native
  def Speak(Text: java.lang.String, SpeakAsync: scala.Boolean, SpeakXML: scala.Boolean): scala.Unit = js.native
  def Speak(Text: java.lang.String, SpeakAsync: scala.Boolean, SpeakXML: scala.Boolean, Purge: scala.Boolean): scala.Unit = js.native
}

