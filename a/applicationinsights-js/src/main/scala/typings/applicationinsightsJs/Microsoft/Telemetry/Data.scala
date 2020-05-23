package typings.applicationinsightsJs.Microsoft.Telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[TDomain] extends Base {
  var baseData: TDomain
}

object Data {
  @scala.inline
  def apply[TDomain](baseData: TDomain, baseType: String): Data[TDomain] = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TDomain]]
  }
}

