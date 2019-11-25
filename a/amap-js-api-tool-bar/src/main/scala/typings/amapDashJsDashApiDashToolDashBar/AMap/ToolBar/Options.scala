package typings.amapDashJsDashApiDashToolDashBar.AMap.ToolBar

import typings.amapDashJsDashApi.AMap.Marker
import typings.amapDashJsDashApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 是否自动定位，即地图初始化加载完成后，是否自动定位的用户所在地，仅在支持HTML5的浏览器中有效
    */
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  /**
    * 方向键盘是否可见
    */
  var direction: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否使用精简模式
    */
  var liteStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否显示定位按钮
    */
  var locate: js.UndefOr[Boolean] = js.undefined
  /**
    * 自定义定位图标，值为Marker对象
    */
  var locationMarker: js.UndefOr[Marker[_]] = js.undefined
  /**
    * 定位失败后，是否开启IP定位
    */
  var noIpLocate: js.UndefOr[Boolean] = js.undefined
  /**
    * 相对于地图容器左上角的偏移量
    */
  var offset: js.UndefOr[Pixel] = js.undefined
  /**
    * 控件停靠位置
    * LT:左上角;
    * RT:右上角;
    * LB:左下角;
    * RB:右下角;
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * 标尺键盘是否可见
    */
  var ruler: js.UndefOr[Boolean] = js.undefined
  // internal
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * 是否使用高德定位sdk用来辅助优化定位效果
    */
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoPosition: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Boolean] = js.undefined,
    liteStyle: js.UndefOr[Boolean] = js.undefined,
    locate: js.UndefOr[Boolean] = js.undefined,
    locationMarker: Marker[_] = null,
    noIpLocate: js.UndefOr[Boolean] = js.undefined,
    offset: Pixel = null,
    position: Position = null,
    ruler: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(liteStyle)) __obj.updateDynamic("liteStyle")(liteStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(locate)) __obj.updateDynamic("locate")(locate.asInstanceOf[js.Any])
    if (locationMarker != null) __obj.updateDynamic("locationMarker")(locationMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(noIpLocate)) __obj.updateDynamic("noIpLocate")(noIpLocate.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ruler)) __obj.updateDynamic("ruler")(ruler.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

