package typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloorDetails extends js.Object {
  /**
    * 各楼层索引
    */
  var floor_indexs: js.Array[Double]
  /**
    * 各楼层名字
    */
  var floor_names: js.Array[String]
  /**
    * 各楼层英文
    */
  var floor_nonas: js.Array[String]
}

object FloorDetails {
  @scala.inline
  def apply(floor_indexs: js.Array[Double], floor_names: js.Array[String], floor_nonas: js.Array[String]): FloorDetails = {
    val __obj = js.Dynamic.literal(floor_indexs = floor_indexs.asInstanceOf[js.Any], floor_names = floor_names.asInstanceOf[js.Any], floor_nonas = floor_nonas.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FloorDetails]
  }
}

