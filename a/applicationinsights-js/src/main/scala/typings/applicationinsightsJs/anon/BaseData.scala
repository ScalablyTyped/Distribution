package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseData extends js.Object {
  var baseData: FieldType
  var baseType: FieldType
}

object BaseData {
  @scala.inline
  def apply(baseData: FieldType, baseType: FieldType): BaseData = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseData]
  }
}

