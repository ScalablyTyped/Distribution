package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternal extends js.Object {
  /**
    * The SDK agent version.
    */
  var agentVersion: String
  /**
    * The SDK version used to create this telemetry item.
    */
  var sdkVersion: String
}

object IInternal {
  @scala.inline
  def apply(agentVersion: String, sdkVersion: String): IInternal = {
    val __obj = js.Dynamic.literal(agentVersion = agentVersion.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IInternal]
  }
}

