package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * The Account ID for the Amazon Web Services account whose Public Access Block configuration you want to set.
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
  /**
    * The Public Access Block configuration that you want to apply to this Amazon Web Services account.
    */
  var PublicAccessBlockConfiguration: awsDashSdkLib.clientsS3controlMod.PublicAccessBlockConfiguration
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, PublicAccessBlockConfiguration = PublicAccessBlockConfiguration)
  
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
}

