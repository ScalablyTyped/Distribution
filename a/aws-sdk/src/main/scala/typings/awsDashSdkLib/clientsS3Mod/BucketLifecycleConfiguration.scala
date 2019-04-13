package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleConfiguration extends js.Object {
  /**
    * 
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

