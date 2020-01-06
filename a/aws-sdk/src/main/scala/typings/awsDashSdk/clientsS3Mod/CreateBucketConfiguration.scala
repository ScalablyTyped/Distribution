package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketConfiguration extends js.Object {
  /**
    * Specifies the Region where the bucket will be created. If you don't specify a Region, the bucket is created in the US East (N. Virginia) Region (us-east-1).
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.native
}

object CreateBucketConfiguration {
  @scala.inline
  def apply(LocationConstraint: BucketLocationConstraint = null): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
}

