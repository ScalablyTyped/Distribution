package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.CitySearch")
@js.native
class CitySearch () extends EventBindable {
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
  ): Unit = js.native
  def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit = js.native
}

