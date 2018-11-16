package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.Hyperlink")
@js.native
class Hyperlink protected () extends js.Object {
  var `Access.Hyperlink_typekey`: Hyperlink = js.native
  var Address: java.lang.String = js.native
  var EmailSubject: java.lang.String = js.native
  var ScreenTip: java.lang.String = js.native
  var SubAddress: java.lang.String = js.native
  var TextToDisplay: java.lang.String = js.native
  def AddToFavorites(): scala.Unit = js.native
  def CreateNewDocument(FileName: java.lang.String, EditNow: scala.Boolean, Overwrite: scala.Boolean): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(NewWindow: scala.Boolean): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(NewWindow: scala.Boolean, AddHistory: scala.Boolean): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(NewWindow: scala.Boolean, AddHistory: scala.Boolean, ExtraInfo: js.Any): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: scala.Boolean,
    ExtraInfo: js.Any,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod
  ): scala.Unit = js.native
  /**
           * @param NewWindow [NewWindow=false]
           * @param AddHistory [AddHistory=true]
           * @param Method [Method=0]
           * @param HeaderInfo [HeaderInfo='']
           */
  def Follow(
    NewWindow: scala.Boolean,
    AddHistory: scala.Boolean,
    ExtraInfo: js.Any,
    Method: activexDashOfficeLib.OfficeNs.MsoExtraInfoMethod,
    HeaderInfo: java.lang.String
  ): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
}

