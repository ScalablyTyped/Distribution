package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternal extends js.Object {
  /**
    * The SDK agent version.
    */
  var agentVersion: java.lang.String
  /**
    * The SDK version used to create this telemetry item.
    */
  var sdkVersion: java.lang.String
}

object IInternal {
  @scala.inline
  def apply(agentVersion: java.lang.String, sdkVersion: java.lang.String): IInternal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agentVersion")(agentVersion)
    __obj.updateDynamic("sdkVersion")(sdkVersion)
    __obj.asInstanceOf[IInternal]
  }
}

