package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPublicAccessBlockRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsDashSdk.clientsS3controlMod.AccountId
  /**
    * 
    */
  var PublicAccessBlockConfiguration: typings.awsDashSdk.clientsS3controlMod.PublicAccessBlockConfiguration
}

object PutPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, PublicAccessBlockConfiguration = PublicAccessBlockConfiguration)
  
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
}

