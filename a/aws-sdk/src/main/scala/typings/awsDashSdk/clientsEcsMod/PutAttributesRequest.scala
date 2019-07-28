package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAttributesRequest extends js.Object {
  /**
    * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can specify up to 10 attributes in a single call.
    */
  var attributes: Attributes
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply attributes. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
}

object PutAttributesRequest {
  @scala.inline
  def apply(attributes: Attributes, cluster: String = null): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[PutAttributesRequest]
  }
}

