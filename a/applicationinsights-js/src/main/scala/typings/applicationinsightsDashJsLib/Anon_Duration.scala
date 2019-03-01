package typings
package applicationinsightsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var name: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var url: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    name: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    url: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("measurements")(measurements)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("ver")(ver)
    __obj.asInstanceOf[Anon_Duration]
  }
}

