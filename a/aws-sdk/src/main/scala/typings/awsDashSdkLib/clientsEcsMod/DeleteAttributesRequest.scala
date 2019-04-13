package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAttributesRequest extends js.Object {
  /**
    * The attributes to delete from your resource. You can specify up to 10 attributes per request. For custom attributes, specify the attribute name and target ID, but do not specify the value. If you specify the target ID using the short form, you must also specify the target type.
    */
  var attributes: Attributes
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to delete attributes. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
}

object DeleteAttributesRequest {
  @scala.inline
  def apply(attributes: Attributes, cluster: String = null): DeleteAttributesRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    __obj.asInstanceOf[DeleteAttributesRequest]
  }
}

