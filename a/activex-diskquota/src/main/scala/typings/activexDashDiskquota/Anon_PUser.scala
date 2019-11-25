package typings.activexDashDiskquota

import typings.activexDashDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PUser extends js.Object {
  val pUser: DIDiskQuotaUser
}

object Anon_PUser {
  @scala.inline
  def apply(pUser: DIDiskQuotaUser): Anon_PUser = {
    val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PUser]
  }
}

