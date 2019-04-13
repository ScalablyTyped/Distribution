package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationS3Response extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
    */
  var LocationArn: js.UndefOr[LocationArn] = js.undefined
}

object CreateLocationS3Response {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationS3Response = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    __obj.asInstanceOf[CreateLocationS3Response]
  }
}

