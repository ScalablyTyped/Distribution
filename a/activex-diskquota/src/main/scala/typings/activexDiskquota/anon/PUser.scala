package typings.activexDiskquota.anon

import typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PUser extends js.Object {
  val pUser: DIDiskQuotaUser
}

object PUser {
  @scala.inline
  def apply(pUser: DIDiskQuotaUser): PUser = {
    val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[PUser]
  }
}

