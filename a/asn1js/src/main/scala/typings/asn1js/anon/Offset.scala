package typings.asn1js.anon

import typings.asn1js.mod.LocalBaseBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offset extends js.Object {
  var offset: Double = js.native
  var result: LocalBaseBlock = js.native
}

object Offset {
  @scala.inline
  def apply(offset: Double, result: LocalBaseBlock): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: LocalBaseBlock): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

