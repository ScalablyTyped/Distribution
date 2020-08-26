package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMat extends js.Object {
  var Align: WdOMathVertAlignType = js.native
  val Application: typings.activexWord.Word.Application = js.native
  var ColGap: Double = js.native
  var ColGapRule: WdOMathSpacingRule = js.native
  var ColSpacing: Double = js.native
  val Cols: OMathMatCols = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var PlcHoldHidden: Boolean = js.native
  var RowSpacing: Double = js.native
  var RowSpacingRule: WdOMathSpacingRule = js.native
  val Rows: OMathMatRows = js.native
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat = js.native
  def Cell(Row: Double, Col: Double): OMath = js.native
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
  @scala.inline
  implicit class OMathMatOps[Self <: OMathMat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: WdOMathVertAlignType): Self = this.set("Align", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCell(value: (Double, Double) => OMath): Self = this.set("Cell", js.Any.fromFunction2(value))
    @scala.inline
    def setColGap(value: Double): Self = this.set("ColGap", value.asInstanceOf[js.Any])
    @scala.inline
    def setColGapRule(value: WdOMathSpacingRule): Self = this.set("ColGapRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setColSpacing(value: Double): Self = this.set("ColSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCols(value: OMathMatCols): Self = this.set("Cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlcHoldHidden(value: Boolean): Self = this.set("PlcHoldHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSpacing(value: Double): Self = this.set("RowSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSpacingRule(value: WdOMathSpacingRule): Self = this.set("RowSpacingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: OMathMatRows): Self = this.set("Rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathMat_typekey(value: OMathMat): Self = this.set("Word.OMathMat_typekey", value.asInstanceOf[js.Any])
  }
  
}

