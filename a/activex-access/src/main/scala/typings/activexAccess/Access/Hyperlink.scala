package typings.activexAccess.Access

import typings.activexOffice.Office.MsoExtraInfoMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlink extends StObject {
  
  /* private */ @JSName("Access.Hyperlink_typekey")
  var AccessDotHyperlink_typekey: Hyperlink = js.native
  
  def AddToFavorites(): Unit = js.native
  
  var Address: String = js.native
  
  def CreateNewDocument(FileName: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  
  var EmailSubject: String = js.native
  
  /**
    * @param NewWindow [NewWindow=false]
    * @param AddHistory [AddHistory=true]
    * @param Method [Method=0]
    * @param HeaderInfo [HeaderInfo='']
    */
  def Follow(): Unit = js.native
  def Follow(NewWindow: Boolean): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: Any, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: Unit, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: Unit, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: Unit,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Unit, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Unit, ExtraInfo: Any, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Unit, ExtraInfo: Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Unit,
    ExtraInfo: Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Unit, ExtraInfo: Unit, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Unit, ExtraInfo: Unit, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Unit,
    ExtraInfo: Unit,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean, ExtraInfo: Any, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean, ExtraInfo: Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Unit,
    AddHistory: Boolean,
    ExtraInfo: Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean, ExtraInfo: Unit, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Boolean, ExtraInfo: Unit, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Unit,
    AddHistory: Boolean,
    ExtraInfo: Unit,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Any, Method: MsoExtraInfoMethod, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: Unit, HeaderInfo: String): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(NewWindow: Unit, AddHistory: Unit, ExtraInfo: Unit, Method: MsoExtraInfoMethod, HeaderInfo: String): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var ScreenTip: String = js.native
  
  var SubAddress: String = js.native
  
  var TextToDisplay: String = js.native
}
