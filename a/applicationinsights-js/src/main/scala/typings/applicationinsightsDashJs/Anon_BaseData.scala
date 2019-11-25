package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseData extends js.Object {
  var baseData: FieldType
  var baseType: FieldType
}

object Anon_BaseData {
  @scala.inline
  def apply(baseData: FieldType, baseType: FieldType): Anon_BaseData = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BaseData]
  }
}

