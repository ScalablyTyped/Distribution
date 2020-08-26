package typings.activexDiskquota.anon

import typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PUser extends js.Object {
  val pUser: DIDiskQuotaUser = js.native
}

object PUser {
  @scala.inline
  def apply(pUser: DIDiskQuotaUser): PUser = {
    val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[PUser]
  }
  @scala.inline
  implicit class PUserOps[Self <: PUser] (val x: Self) extends AnyVal {
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
    def setPUser(value: DIDiskQuotaUser): Self = this.set("pUser", value.asInstanceOf[js.Any])
  }
  
}

