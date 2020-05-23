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
    *     是否可见
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
    heightFactor: js.UndefOr[Double] = js.undefined,
    map: Map = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heightFactor)) __obj.updateDynamic("heightFactor")(heightFactor.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

