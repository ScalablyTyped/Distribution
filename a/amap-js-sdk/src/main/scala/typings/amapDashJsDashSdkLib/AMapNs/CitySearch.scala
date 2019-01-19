package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.CitySearch")
@js.native
class CitySearch () extends EventBindable {
  def getCityByIp(
    ip: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | CitySearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLocalCity(
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | CitySearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

