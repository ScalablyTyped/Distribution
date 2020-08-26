package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a single token within a formula. */
@js.native
trait FormulaToken extends js.Object {
  /**
    * is additional data in the token, depending on the OpCode.
    * @see com.sun.star.sheet.NamedRange.TokenIndex
    * @see com.sun.star.sheet.DatabaseRange.TokenIndex
    */
  var Data: js.Any = js.native
  /**
    * is the OpCode of the token.
    * @see com.sun.star.sheet.XFormulaOpCodeMapper
    */
  var OpCode: Double = js.native
}

object FormulaToken {
  @scala.inline
  def apply(Data: js.Any, OpCode: Double): FormulaToken = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], OpCode = OpCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaToken]
  }
  @scala.inline
  implicit class FormulaTokenOps[Self <: FormulaToken] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpCode(value: Double): Self = this.set("OpCode", value.asInstanceOf[js.Any])
  }
  
}

