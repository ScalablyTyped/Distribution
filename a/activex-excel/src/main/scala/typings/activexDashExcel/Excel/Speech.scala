package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Speech")
@js.native
class Speech protected () extends js.Object {
  var Direction: XlSpeakDirection = js.native
  var `Excel.Speech_typekey`: Speech = js.native
  var SpeakCellOnEnter: Boolean = js.native
  def Speak(Text: String): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean, Purge: Boolean): Unit = js.native
}

