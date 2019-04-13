package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var arn: js.UndefOr[ResourceArn] = js.undefined
  var attributes: js.UndefOr[Attributes] = js.undefined
  var feature: js.UndefOr[Feature] = js.undefined
  var name: js.UndefOr[ResourceName] = js.undefined
  var `type`: js.UndefOr[ResourceType] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    arn: ResourceArn = null,
    attributes: Attributes = null,
    feature: Feature = null,
    name: ResourceName = null,
    `type`: ResourceType = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Resource]
  }
}

