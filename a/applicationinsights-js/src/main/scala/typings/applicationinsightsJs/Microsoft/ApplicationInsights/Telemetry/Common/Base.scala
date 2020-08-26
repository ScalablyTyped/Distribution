package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends typings.applicationinsightsJs.Microsoft.Telemetry.Base
     with ISerializable

object Base {
  @scala.inline
  def apply(aiDataContract: js.Any, baseType: String): Base = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

