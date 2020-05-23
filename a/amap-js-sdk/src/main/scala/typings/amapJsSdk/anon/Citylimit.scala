package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Citylimit extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var citylimit: js.UndefOr[Boolean] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Citylimit {
  @scala.inline
  def apply(
    city: String = null,
    citylimit: js.UndefOr[Boolean] = js.undefined,
    datatype: String = null,
    input: String = null,
    `type`: String = null
  ): Citylimit = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit.get.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Citylimit]
  }
}

