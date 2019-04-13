package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePublicAccessBlockRequest extends js.Object {
  /**
    * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to remove.
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

