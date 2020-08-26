package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MohClass extends js.Object {
  var bridgeId: String = js.native
  var mohClass: js.UndefOr[String] = js.native
}

object MohClass {
  @scala.inline
  def apply(bridgeId: String): MohClass = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MohClass]
  }
  @scala.inline
  implicit class MohClassOps[Self <: MohClass] (val x: Self) extends AnyVal {
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
    def setBridgeId(value: String): Self = this.set("bridgeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMohClass(value: String): Self = this.set("mohClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMohClass: Self = this.set("mohClass", js.undefined)
  }
  
}

