package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleConfiguration extends js.Object {
  /**
    * A lifecycle rule for individual objects in an Amazon S3 bucket.
    */
  var Rules: LifecycleRules = js.native
}

object BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: LifecycleRules): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
}

