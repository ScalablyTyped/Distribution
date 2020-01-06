package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointRequest extends js.Object {
  /**
    * The account ID for the account that owns the specified access point.
    */
  var AccountId: typings.awsDashSdk.clientsS3controlMod.AccountId = js.native
  /**
    * The name of the access point whose configuration information you want to retrieve.
    */
  var Name: AccessPointName = js.native
}

object GetAccessPointRequest {
  @scala.inline
  def apply(AccountId: AccountId, Name: AccessPointName): GetAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAccessPointRequest]
  }
}

