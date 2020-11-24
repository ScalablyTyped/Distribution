package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Speech extends js.Object {
  
  var Direction: XlSpeakDirection = js.native
  
  @JSName("Excel.Speech_typekey")
  var ExcelDotSpeech_typekey: Speech = js.native
  
  def Speak(Text: String): Unit = js.native
  def Speak(
    Text: String,
    SpeakAsync: js.UndefOr[scala.Nothing],
    SpeakXML: js.UndefOr[scala.Nothing],
    Purge: Boolean
  ): Unit = js.native
  def Speak(Text: String, SpeakAsync: js.UndefOr[scala.Nothing], SpeakXML: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: js.UndefOr[scala.Nothing], SpeakXML: Boolean, Purge: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: js.UndefOr[scala.Nothing], Purge: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean, Purge: Boolean): Unit = js.native
  
  var SpeakCellOnEnter: Boolean = js.native
}
