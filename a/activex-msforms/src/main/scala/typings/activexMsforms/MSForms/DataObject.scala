package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends StObject {
  
  def Clear(): Unit = js.native
  
  def GetFormat(Format: Any): Boolean = js.native
  
  def GetFromClipboard(): Unit = js.native
  
  def GetText(): String = js.native
  def GetText(Format: Any): String = js.native
  
  /* private */ @JSName("MSForms.DataObject_typekey")
  var MSFormsDotDataObject_typekey: DataObject = js.native
  
  def PutInClipboard(): Unit = js.native
  
  def SetText(Text: String): Unit = js.native
  def SetText(Text: String, Format: Any): Unit = js.native
  
  def StartDrag(): fmDropEffect = js.native
  def StartDrag(OKEffect: Any): fmDropEffect = js.native
}
