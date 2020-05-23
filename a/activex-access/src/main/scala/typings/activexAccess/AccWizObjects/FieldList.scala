package typings.activexAccess.AccWizObjects

import typings.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field List Control */
trait FieldList extends js.Object {
  @JSName("AccWizObjects.FieldList_typekey")
  var AccWizObjectsDotFieldList_typekey: FieldList
  val FieldListCount: Double
  var HScrollPos: Double
  val JoinLineCount: Double
  var PersistentHighlight: Boolean
  var Picture: IPictureDisp
  var PictureCols: Double
  var PictureRows: Double
  var ScrollBars: Double
  var SelectedFieldListIndex: Double
  var VScrollPos: Double
  def AddFieldList(
    bstrCaption: String,
    nLeft: Double,
    nTop: Double,
    nWidth: Double,
    nHeight: Double,
    nMultiSelectType: Double,
    cCols: Double,
    fShowPictures: Boolean
  ): Unit
  def AddJoinLine(
    IFieldList: Double,
    iField: Double,
    iForeignFieldList: Double,
    iForeignField: Double,
    lAttribs: Double
  ): Unit
  def DeleteFieldList(IFieldList: Double): Unit
  def DeleteJoinLine(IJoinLine: Double): Unit
  def FieldLists(IFieldList: Double): js.Any
  def JoinLines(IJoinLine: Double): js.Any
  def SetCursor(nCursorID: Double): Unit
}

object FieldList {
  @scala.inline
  def apply(
    AccWizObjectsDotFieldList_typekey: FieldList,
    AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit,
    AddJoinLine: (Double, Double, Double, Double, Double) => Unit,
    DeleteFieldList: Double => Unit,
    DeleteJoinLine: Double => Unit,
    FieldListCount: Double,
    FieldLists: Double => js.Any,
    HScrollPos: Double,
    JoinLineCount: Double,
    JoinLines: Double => js.Any,
    PersistentHighlight: Boolean,
    Picture: IPictureDisp,
    PictureCols: Double,
    PictureRows: Double,
    ScrollBars: Double,
    SelectedFieldListIndex: Double,
    SetCursor: Double => Unit,
    VScrollPos: Double
  ): FieldList = {
    val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8(AddFieldList), AddJoinLine = js.Any.fromFunction5(AddJoinLine), DeleteFieldList = js.Any.fromFunction1(DeleteFieldList), DeleteJoinLine = js.Any.fromFunction1(DeleteJoinLine), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1(SetCursor), VScrollPos = VScrollPos.asInstanceOf[js.Any])
    __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldList]
  }
}

