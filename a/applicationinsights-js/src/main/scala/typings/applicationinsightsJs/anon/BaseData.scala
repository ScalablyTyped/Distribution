package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseData extends js.Object {
  var baseData: FieldType = js.native
  var baseType: FieldType = js.native
}

object BaseData {
  @scala.inline
  def apply(baseData: FieldType, baseType: FieldType): BaseData = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseData]
  }
  @scala.inline
  implicit class BaseDataOps[Self <: BaseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseData(value: FieldType): Self = this.set("baseData", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseType(value: FieldType): Self = this.set("baseType", value.asInstanceOf[js.Any])
  }
  
}

