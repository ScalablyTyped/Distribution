package typings.applicationinsightsJs

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseData extends js.Object {
  var baseData: FieldType
  var baseType: FieldType
}

object AnonBaseData {
  @scala.inline
  def apply(baseData: FieldType, baseType: FieldType): AnonBaseData = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBaseData]
  }
}

