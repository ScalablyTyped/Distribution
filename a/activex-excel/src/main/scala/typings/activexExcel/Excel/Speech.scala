package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Speech extends StObject {
  
  var Direction: XlSpeakDirection = js.native
  
  @JSName("Excel.Speech_typekey")
  var ExcelDotSpeech_typekey: Speech = js.native
  
  def Speak(Text: String): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Boolean, Purge: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Boolean, SpeakXML: Unit, Purge: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Unit, SpeakXML: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Unit, SpeakXML: Boolean, Purge: Boolean): Unit = js.native
  def Speak(Text: String, SpeakAsync: Unit, SpeakXML: Unit, Purge: Boolean): Unit = js.native
  
  var SpeakCellOnEnter: Boolean = js.native
}
