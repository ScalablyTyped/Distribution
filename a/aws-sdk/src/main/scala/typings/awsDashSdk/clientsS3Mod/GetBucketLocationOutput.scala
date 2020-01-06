package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLocationOutput extends js.Object {
  /**
    * Specifies the Region where the bucket resides. For a list of all the Amazon S3 supported location constraints by Region, see Regions and Endpoints.
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}

object GetBucketLocationOutput {
  @scala.inline
  def apply(LocationConstraint: BucketLocationConstraint = null): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
}

