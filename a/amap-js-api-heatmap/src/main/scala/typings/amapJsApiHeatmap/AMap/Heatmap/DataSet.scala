package typings.amapJsApiHeatmap.AMap.Heatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSet extends js.Object {
  /**
    * 坐标数据集
    */
  var data: js.Array[Data]
  /**
    * 权重的最大值
    */
  var max: js.UndefOr[Double] = js.undefined
}

object DataSet {
  @scala.inline
  def apply(data: js.Array[Data], max: js.UndefOr[Double] = js.undefined): DataSet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
}

