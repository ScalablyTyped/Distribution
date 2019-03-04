package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketWebsiteConfig extends js.Object {
   // default page, e.g.: index.html
  var error: js.UndefOr[java.lang.String] = js.undefined
  var index: java.lang.String
}

object PutBucketWebsiteConfig {
  @scala.inline
  def apply(index: java.lang.String, error: java.lang.String = null): PutBucketWebsiteConfig = {
    val __obj = js.Dynamic.literal(index = index)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[PutBucketWebsiteConfig]
  }
}

