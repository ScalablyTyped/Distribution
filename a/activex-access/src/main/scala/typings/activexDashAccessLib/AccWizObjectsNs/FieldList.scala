package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field List Control */
@JSGlobal("AccWizObjects.FieldList")
@js.native
class FieldList protected () extends js.Object {
  var `AccWizObjects.FieldList_typekey`: FieldList = js.native
  val FieldListCount: scala.Double = js.native
  var HScrollPos: scala.Double = js.native
  val JoinLineCount: scala.Double = js.native
  var PersistentHighlight: scala.Boolean = js.native
  var Picture: activexDashStdoleLib.stdoleNs.IPictureDisp = js.native
  var PictureCols: scala.Double = js.native
  var PictureRows: scala.Double = js.native
  var ScrollBars: scala.Double = js.native
  var SelectedFieldListIndex: scala.Double = js.native
  var VScrollPos: scala.Double = js.native
  def AddFieldList(
    bstrCaption: java.lang.String,
    nLeft: scala.Double,
    nTop: scala.Double,
    nWidth: scala.Double,
    nHeight: scala.Double,
    nMultiSelectType: scala.Double,
    cCols: scala.Double,
    fShowPictures: scala.Boolean
  ): scala.Unit = js.native
  def AddJoinLine(
    IFieldList: scala.Double,
    iField: scala.Double,
    iForeignFieldList: scala.Double,
    iForeignField: scala.Double,
    lAttribs: scala.Double
  ): scala.Unit = js.native
  def DeleteFieldList(IFieldList: scala.Double): scala.Unit = js.native
  def DeleteJoinLine(IJoinLine: scala.Double): scala.Unit = js.native
  def FieldLists(IFieldList: scala.Double): js.Any = js.native
  def JoinLines(IJoinLine: scala.Double): js.Any = js.native
  def SetCursor(nCursorID: scala.Double): scala.Unit = js.native
}

