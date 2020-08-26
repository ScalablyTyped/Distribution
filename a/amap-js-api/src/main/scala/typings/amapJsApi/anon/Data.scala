package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[I] extends js.Object {
  /**
    * 目标点的数据
    */
  var data: typings.amapJsApi.AMap.MassMarks.Data = js.native
  /**
    * 事件触发目标
    */
  var target: I = js.native
}

object Data {
  @scala.inline
  def apply[I](data: typings.amapJsApi.AMap.MassMarks.Data, target: I): Data[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[I]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], I] (val x: Self with Data[I]) extends AnyVal {
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
    def setData(value: typings.amapJsApi.AMap.MassMarks.Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: I): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

