package typings.amapJsApiIndoorMap.AMap.IndoorMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloorDetails extends js.Object {
  /**
    * 各楼层索引
    */
  var floor_indexs: js.Array[Double] = js.native
  /**
    * 各楼层名字
    */
  var floor_names: js.Array[String] = js.native
  /**
    * 各楼层英文
    */
  var floor_nonas: js.Array[String] = js.native
}

object FloorDetails {
  @scala.inline
  def apply(floor_indexs: js.Array[Double], floor_names: js.Array[String], floor_nonas: js.Array[String]): FloorDetails = {
    val __obj = js.Dynamic.literal(floor_indexs = floor_indexs.asInstanceOf[js.Any], floor_names = floor_names.asInstanceOf[js.Any], floor_nonas = floor_nonas.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloorDetails]
  }
  @scala.inline
  implicit class FloorDetailsOps[Self <: FloorDetails] (val x: Self) extends AnyVal {
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
    def setFloor_indexsVarargs(value: Double*): Self = this.set("floor_indexs", js.Array(value :_*))
    @scala.inline
    def setFloor_indexs(value: js.Array[Double]): Self = this.set("floor_indexs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloor_namesVarargs(value: String*): Self = this.set("floor_names", js.Array(value :_*))
    @scala.inline
    def setFloor_names(value: js.Array[String]): Self = this.set("floor_names", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloor_nonasVarargs(value: String*): Self = this.set("floor_nonas", js.Array(value :_*))
    @scala.inline
    def setFloor_nonas(value: js.Array[String]): Self = this.set("floor_nonas", value.asInstanceOf[js.Any])
  }
  
}

