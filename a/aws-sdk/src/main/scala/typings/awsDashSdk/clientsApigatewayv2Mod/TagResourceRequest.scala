package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * AWS resource arn 
    */
  var ResourceArn: __string
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters..
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.Tags] = js.undefined
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: Tags = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagResourceRequest]
  }
}

