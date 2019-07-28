package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicAccessBlockOutput extends js.Object {
  /**
    * The PublicAccessBlock configuration currently in effect for this Amazon S3 bucket.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.PublicAccessBlockConfiguration] = js.undefined
}

object GetPublicAccessBlockOutput {
  @scala.inline
  def apply(PublicAccessBlockConfiguration: PublicAccessBlockConfiguration = null): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    if (PublicAccessBlockConfiguration != null) __obj.updateDynamic("PublicAccessBlockConfiguration")(PublicAccessBlockConfiguration)
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
}

