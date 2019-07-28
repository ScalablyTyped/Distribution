package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketWebsiteConfig extends js.Object {
   // default page, e.g.: index.html
  var error: js.UndefOr[String] = js.undefined
  var index: String
}

object PutBucketWebsiteConfig {
  @scala.inline
  def apply(index: String, error: String = null): PutBucketWebsiteConfig = {
    val __obj = js.Dynamic.literal(index = index)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[PutBucketWebsiteConfig]
  }
}

