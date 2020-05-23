package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[TDomain]
  extends typings.applicationinsightsJs.Microsoft.Telemetry.Data[TDomain]
     with ISerializable

object Data {
  @scala.inline
  def apply[TDomain](aiDataContract: js.Any, baseData: TDomain, baseType: String): Data[TDomain] = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TDomain]]
  }
}

