package typings.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyFormat extends js.Object {
           // for positive values, eg. "$ 1.00"
  var neg: js.UndefOr[String] = js.native
  var pos: String = js.native
          // for negative values, eg. "$ (1.00)"
  var zero: js.UndefOr[String] = js.native
}

object CurrencyFormat {
  @scala.inline
  def apply(pos: String): CurrencyFormat = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormat]
  }
  @scala.inline
  implicit class CurrencyFormatOps[Self <: CurrencyFormat] (val x: Self) extends AnyVal {
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
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeg(value: String): Self = this.set("neg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeg: Self = this.set("neg", js.undefined)
    @scala.inline
    def setZero(value: String): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

