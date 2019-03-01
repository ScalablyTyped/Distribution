package typings
package applicationinsightsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measurements extends js.Object {
  var measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var name: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
}

object Anon_Measurements {
  @scala.inline
  def apply(
    measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    name: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  ): Anon_Measurements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("measurements")(measurements)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("ver")(ver)
    __obj.asInstanceOf[Anon_Measurements]
  }
}

