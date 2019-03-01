package typings
package applicationinsightsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Metrics extends js.Object {
  var metrics: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
}

object Anon_Metrics {
  @scala.inline
  def apply(
    metrics: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  ): Anon_Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("ver")(ver)
    __obj.asInstanceOf[Anon_Metrics]
  }
}

