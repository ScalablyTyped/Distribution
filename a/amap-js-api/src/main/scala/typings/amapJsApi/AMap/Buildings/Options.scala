package typings.amapJsApi.AMap.Buildings

import typings.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  /**
    * 高度比例系数，可控制3D视图下的楼块高度
    */
  var heightFactor: js.UndefOr[Double] = js.undefined
  // inner
  var merge: js.UndefOr[Boolean] = js.undefined
  /**
    * 不透明度
    */
  var opacity: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  /**
    * 	是否可见
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * 层级
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * 可见级别范围
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    heightFactor: Int | Double = null,
    map: Map = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (heightFactor != null) __obj.updateDynamic("heightFactor")(heightFactor.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

