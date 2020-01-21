package typings.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.Any
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object AnonActive {
  @scala.inline
  def apply(
    attributes: js.Any,
    name: String,
    active: js.UndefOr[Boolean] = js.undefined,
    description: String = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

