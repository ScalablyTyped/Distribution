package typings.activexWord.Word

import typings.activexOffice.Office.MsoHyperlinkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlink extends StObject {
  
  def AddToFavorites(): Unit = js.native
  
  var Address: String = js.native
  
  val AddressOld: String = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def CreateNewDocument(FileName: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var EmailSubject: String = js.native
  
  val ExtraInfoRequired: Boolean = js.native
  
  def Follow(): Unit = js.native
  def Follow(NewWindow: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Any, Method: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Any, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Any, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Unit, Method: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Unit, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Any, ExtraInfo: Unit, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Any, Method: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Any, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Any, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Unit, Method: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Unit, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Any, AddHistory: Unit, ExtraInfo: Unit, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Any, Method: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Any, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Any, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Unit, Method: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Unit, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Any, ExtraInfo: Unit, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: Unit, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: Any, HeaderInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: Unit, HeaderInfo: Any): Unit = js.native
  
  val Name: String = js.native
  
  val Parent: Any = js.native
  
  val Range: typings.activexWord.Word.Range = js.native
  
  var ScreenTip: String = js.native
  
  val Shape: typings.activexWord.Word.Shape = js.native
  
  var SubAddress: String = js.native
  
  val SubAddressOld: String = js.native
  
  var Target: String = js.native
  
  var TextToDisplay: String = js.native
  
  val Type: MsoHyperlinkType = js.native
  
  /* private */ @JSName("Word.Hyperlink_typekey")
  var WordDotHyperlink_typekey: Hyperlink = js.native
}
