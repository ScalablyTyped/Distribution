package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathEqArray extends js.Object {
  var Align: WdOMathVertAlignType
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val E: OMathArgs
  var MaxDist: Boolean
  var ObjDist: Boolean
  val Parent: js.Any
  var RowSpacing: Double
  var RowSpacingRule: WdOMathSpacingRule
  @JSName("Word.OMathEqArray_typekey")
  var WordDotOMathEqArray_typekey: OMathEqArray
}

object OMathEqArray {
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Creator: Double,
    E: OMathArgs,
    MaxDist: Boolean,
    ObjDist: Boolean,
    Parent: js.Any,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    WordDotOMathEqArray_typekey: OMathEqArray
  ): OMathEqArray = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], MaxDist = MaxDist.asInstanceOf[js.Any], ObjDist = ObjDist.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathEqArray_typekey")(WordDotOMathEqArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathEqArray]
  }
}

