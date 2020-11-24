package typings.activexAccess.Access

import typings.activexOffice.Office.MsoExtraInfoMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlink extends js.Object {
  
  @JSName("Access.Hyperlink_typekey")
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
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: js.UndefOr[scala.Nothing], AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: js.Any): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: js.UndefOr[scala.Nothing], AddHistory: Boolean): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: js.UndefOr[scala.Nothing], AddHistory: Boolean, ExtraInfo: js.Any): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: js.UndefOr[scala.Nothing],
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: js.UndefOr[scala.Nothing], ExtraInfo: js.Any): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: js.UndefOr[scala.Nothing],
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod
  ): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.UndefOr[scala.Nothing],
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: js.Any): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: js.UndefOr[scala.Nothing],
    HeaderInfo: String
  ): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: js.Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var ScreenTip: String = js.native
  
  var SubAddress: String = js.native
  
  var TextToDisplay: String = js.native
}
