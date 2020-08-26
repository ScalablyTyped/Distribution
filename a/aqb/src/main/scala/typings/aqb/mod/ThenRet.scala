package typings.aqb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThenRet extends js.Object {
  var else_ : TernaryOperation = js.native
  def `else`(y: js.Any): TernaryOperation = js.native
  def otherwise(y: js.Any): TernaryOperation = js.native
}

object ThenRet {
  @scala.inline
  def apply(
    `else`: js.Any => TernaryOperation,
    else_ : TernaryOperation,
    otherwise: js.Any => TernaryOperation
  ): ThenRet = {
    val __obj = js.Dynamic.literal(else_ = else_.asInstanceOf[js.Any], otherwise = js.Any.fromFunction1(otherwise))
    __obj.updateDynamic("else")(js.Any.fromFunction1(`else`))
    __obj.asInstanceOf[ThenRet]
  }
  @scala.inline
  implicit class ThenRetOps[Self <: ThenRet] (val x: Self) extends AnyVal {
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
    def setElse(value: js.Any => TernaryOperation): Self = this.set("else", js.Any.fromFunction1(value))
    @scala.inline
    def setElse_(value: TernaryOperation): Self = this.set("else_", value.asInstanceOf[js.Any])
    @scala.inline
    def setOtherwise(value: js.Any => TernaryOperation): Self = this.set("otherwise", js.Any.fromFunction1(value))
  }
  
}

