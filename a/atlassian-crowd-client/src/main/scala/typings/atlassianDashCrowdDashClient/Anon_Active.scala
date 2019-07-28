package typings.atlassianDashCrowdDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.Any
  var description: js.UndefOr[String] = js.undefined
  var name: String
}

object Anon_Active {
  @scala.inline
  def apply(
    attributes: js.Any,
    name: String,
    active: js.UndefOr[Boolean] = js.undefined,
    description: String = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Active]
  }
}

