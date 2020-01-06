package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSEncryptionConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination Amazon S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var AWSKMSKeyARN: typings.awsDashSdk.clientsFirehoseMod.AWSKMSKeyARN = js.native
}

object KMSEncryptionConfig {
  @scala.inline
  def apply(AWSKMSKeyARN: AWSKMSKeyARN): KMSEncryptionConfig = {
    val __obj = js.Dynamic.literal(AWSKMSKeyARN = AWSKMSKeyARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KMSEncryptionConfig]
  }
}

