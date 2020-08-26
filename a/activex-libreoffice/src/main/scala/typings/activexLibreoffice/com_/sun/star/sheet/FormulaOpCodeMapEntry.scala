package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a mapping from a formula name (function name, operator, ...) to the OpCode used by the formula compiler. */
@js.native
trait FormulaOpCodeMapEntry extends js.Object {
  /** The function name, or operator. */
  var Name: String = js.native
  /** The corresponding mapping. */
  var Token: FormulaToken = js.native
}

object FormulaOpCodeMapEntry {
  @scala.inline
  def apply(Name: String, Token: FormulaToken): FormulaOpCodeMapEntry = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaOpCodeMapEntry]
  }
  @scala.inline
  implicit class FormulaOpCodeMapEntryOps[Self <: FormulaOpCodeMapEntry] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: FormulaToken): Self = this.set("Token", value.asInstanceOf[js.Any])
  }
  
}

