package typings.applicationinsightsJs.Microsoft.Telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[TDomain] extends Base {
  var baseData: TDomain = js.native
}

object Data {
  @scala.inline
  def apply[TDomain](baseData: TDomain, baseType: String): Data[TDomain] = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TDomain]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], TDomain] (val x: Self with Data[TDomain]) extends AnyVal {
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
    def setBaseData(value: TDomain): Self = this.set("baseData", value.asInstanceOf[js.Any])
  }
  
}

