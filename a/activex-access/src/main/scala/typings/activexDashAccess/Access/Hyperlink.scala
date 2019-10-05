package typings.activexDashAccess.Access

import typings.activexDashOffice.Office.MsoExtraInfoMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var `Access.Hyperlink_typekey`: Hyperlink = js.native
  var Address: String = js.native
  var EmailSubject: String = js.native
  var ScreenTip: String = js.native
  var SubAddress: String = js.native
  var TextToDisplay: String = js.native
  def AddToFavorites(): Unit = js.native
  def CreateNewDocument(FileName: String, EditNow: Boolean, Overwrite: Boolean): Unit = js.native
  /**
    * @param NewWindow [NewWindow=false]
    * @param AddHistory [AddHistory=true]
    * @param Method [Method=0]
    * @param HeaderInfo [HeaderInfo='']
    */
  def Follow(): Unit = js.native
  def Follow(NewWindow: Boolean): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: js.Any): Unit = js.native
  def Follow(NewWindow: Boolean, AddHistory: Boolean, ExtraInfo: js.Any, Method: MsoExtraInfoMethod): Unit = js.native
  def Follow(
    NewWindow: Boolean,
    AddHistory: Boolean,
    ExtraInfo: js.Any,
    Method: MsoExtraInfoMethod,
    HeaderInfo: String
  ): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

