package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPUser extends js.Object {
  val pUser: DIDiskQuotaUser
}

object AnonPUser {
  @scala.inline
  def apply(pUser: DIDiskQuotaUser): AnonPUser = {
    val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPUser]
  }
}

