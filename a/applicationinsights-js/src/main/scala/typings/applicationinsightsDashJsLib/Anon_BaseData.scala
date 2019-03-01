package typings
package applicationinsightsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseData extends js.Object {
  var baseData: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var baseType: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
}

object Anon_BaseData {
  @scala.inline
  def apply(
    baseData: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    baseType: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  ): Anon_BaseData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseData")(baseData)
    __obj.updateDynamic("baseType")(baseType)
    __obj.asInstanceOf[Anon_BaseData]
  }
}

