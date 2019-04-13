package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLocationOutput extends js.Object {
  /**
    * 
    */
  var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
}

object GetBucketLocationOutput {
  @scala.inline
  def apply(LocationConstraint: BucketLocationConstraint = null): GetBucketLocationOutput = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationOutput]
  }
}

