package typings.amapJsApi

import typings.amapJsApi.AMap.MassMarks.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[I] extends js.Object {
  /**
    * 目标点的数据
    */
  var data: Data
  /**
    * 事件触发目标
    */
  var target: I
}

object AnonData {
  @scala.inline
  def apply[I](data: Data, target: I): AnonData[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData[I]]
  }
}

