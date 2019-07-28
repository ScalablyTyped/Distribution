package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketEncryptionOutput extends js.Object {
  /**
    * 
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ServerSideEncryptionConfiguration] = js.undefined
}

object GetBucketEncryptionOutput {
  @scala.inline
  def apply(ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration = null): GetBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal()
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration)
    __obj.asInstanceOf[GetBucketEncryptionOutput]
  }
}

