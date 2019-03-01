package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityCitylimit extends js.Object {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var citylimit: js.UndefOr[scala.Boolean] = js.undefined
  var datatype: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CityCitylimit {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    citylimit: js.UndefOr[scala.Boolean] = js.undefined,
    datatype: java.lang.String = null,
    input: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_CityCitylimit = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (!js.isUndefined(citylimit)) __obj.updateDynamic("citylimit")(citylimit)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (input != null) __obj.updateDynamic("input")(input)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_CityCitylimit]
  }
}

