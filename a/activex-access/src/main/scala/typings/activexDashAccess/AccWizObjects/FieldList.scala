package typings.activexDashAccess.AccWizObjects

import typings.activexDashStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field List Control */
@JSGlobal("AccWizObjects.FieldList")
@js.native
class FieldList protected () extends js.Object {
  var `AccWizObjects.FieldList_typekey`: FieldList = js.native
  val FieldListCount: Double = js.native
  var HScrollPos: Double = js.native
  val JoinLineCount: Double = js.native
  var PersistentHighlight: Boolean = js.native
  var Picture: IPictureDisp = js.native
  var PictureCols: Double = js.native
  var PictureRows: Double = js.native
  var ScrollBars: Double = js.native
  var SelectedFieldListIndex: Double = js.native
  var VScrollPos: Double = js.native
  def AddFieldList(
    bstrCaption: String,
    nLeft: Double,
    nTop: Double,
    nWidth: Double,
    nHeight: Double,
    nMultiSelectType: Double,
    cCols: Double,
    fShowPictures: Boolean
  ): Unit = js.native
  def AddJoinLine(
    IFieldList: Double,
    iField: Double,
    iForeignFieldList: Double,
    iForeignField: Double,
    lAttribs: Double
  ): Unit = js.native
  def DeleteFieldList(IFieldList: Double): Unit = js.native
  def DeleteJoinLine(IJoinLine: Double): Unit = js.native
  def FieldLists(IFieldList: Double): js.Any = js.native
  def JoinLines(IJoinLine: Double): js.Any = js.native
  def SetCursor(nCursorID: Double): Unit = js.native
}

