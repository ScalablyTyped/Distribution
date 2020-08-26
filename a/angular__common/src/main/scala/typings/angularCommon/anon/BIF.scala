package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BIF extends js.Object {
  var BIF: js.Array[String] = js.native
}

object BIF {
  @scala.inline
  def apply(BIF: js.Array[String]): BIF = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIF]
  }
  @scala.inline
  implicit class BIFOps[Self <: BIF] (val x: Self) extends AnyVal {
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
    def setBIFVarargs(value: String*): Self = this.set("BIF", js.Array(value :_*))
    @scala.inline
    def setBIF(value: js.Array[String]): Self = this.set("BIF", value.asInstanceOf[js.Any])
  }
  
}

