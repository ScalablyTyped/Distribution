package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleConfiguration extends js.Object {
  /**
    * A lifecycle rule for individual objects in an Amazon S3 bucket.
    */
  var Rules: LifecycleRules
}

object BucketLifecycleConfiguration {
  @scala.inline
  def apply(Rules: LifecycleRules): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules)
  
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
}

