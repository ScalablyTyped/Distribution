package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicAccessBlockRequest extends js.Object {
  /**
    * 
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
}

object GetPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
  
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
}

