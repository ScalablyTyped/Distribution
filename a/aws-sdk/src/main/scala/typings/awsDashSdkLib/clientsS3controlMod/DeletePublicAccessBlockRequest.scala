package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The account ID for the AWS account whose block public access configuration you want to delete.
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
}

object DeletePublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
  
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
}

