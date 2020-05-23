package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathMat extends js.Object {
  var Align: WdOMathVertAlignType
  val Application: typings.activexWord.Word.Application
  var ColGap: Double
  var ColGapRule: WdOMathSpacingRule
  var ColSpacing: Double
  val Cols: OMathMatCols
  val Creator: Double
  val Parent: js.Any
  var PlcHoldHidden: Boolean
  var RowSpacing: Double
  var RowSpacingRule: WdOMathSpacingRule
  val Rows: OMathMatRows
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat
  def Cell(Row: Double, Col: Double): OMath
}

object OMathMat {
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Cell: (Double, Double) => OMath,
    ColGap: Double,
    ColGapRule: WdOMathSpacingRule,
    ColSpacing: Double,
    Cols: OMathMatCols,
    Creator: Double,
    Parent: js.Any,
    PlcHoldHidden: Boolean,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    Rows: OMathMatRows,
    WordDotOMathMat_typekey: OMathMat
  ): OMathMat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Cell = js.Any.fromFunction2(Cell), ColGap = ColGap.asInstanceOf[js.Any], ColGapRule = ColGapRule.asInstanceOf[js.Any], ColSpacing = ColSpacing.asInstanceOf[js.Any], Cols = Cols.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlcHoldHidden = PlcHoldHidden.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMat_typekey")(WordDotOMathMat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMat]
  }
}

