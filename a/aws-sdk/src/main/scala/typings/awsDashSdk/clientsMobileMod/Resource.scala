package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  var arn: js.UndefOr[ResourceArn] = js.native
  var attributes: js.UndefOr[Attributes] = js.native
  var feature: js.UndefOr[Feature] = js.native
  var name: js.UndefOr[ResourceName] = js.native
  var `type`: js.UndefOr[ResourceType] = js.native
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
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

