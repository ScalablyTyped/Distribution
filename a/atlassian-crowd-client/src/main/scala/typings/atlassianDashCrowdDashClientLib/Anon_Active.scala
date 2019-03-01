package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.Any
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Anon_Active {
  @scala.inline
  def apply(
    attributes: js.Any,
    name: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Active]
  }
}

