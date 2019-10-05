package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.MassMarks.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[I] extends js.Object {
  /**
    * 目标点的数据
    */
  var data: Data
  /**
    * 事件触发目标
    */
  var target: I
}

object Anon_Data {
  @scala.inline
  def apply[I](data: Data, target: I): Anon_Data[I] = {
    val __obj = js.Dynamic.literal(data = data, target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data[I]]
  }
}

