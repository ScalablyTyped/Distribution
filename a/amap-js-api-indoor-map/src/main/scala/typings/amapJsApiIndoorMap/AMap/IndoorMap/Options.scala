package typings.amapJsApiIndoorMap.AMap.IndoorMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  /**
    * 是否持续显示
    */
  var alaysShow: js.UndefOr[Boolean] = js.native
  var autoLoadBuildingsInTile: js.UndefOr[Boolean] = js.native
  /**
    * 鼠标悬停到店铺面时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.native
  var disableHoverMarker: js.UndefOr[Boolean] = js.native
  var disableIconRender: js.UndefOr[Boolean] = js.native
  var disableLabelRender: js.UndefOr[Boolean] = js.native
  var featurezIndex: js.UndefOr[Double] = js.native
  /**
    * 是否隐藏楼层切换控件
    */
  var hideFloorBar: js.UndefOr[Boolean] = js.native
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.native
  // internal
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.native
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlaysShow(value: Boolean): Self = this.set("alaysShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlaysShow: Self = this.set("alaysShow", js.undefined)
    @scala.inline
    def setAutoLoadBuildingsInTile(value: Boolean): Self = this.set("autoLoadBuildingsInTile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLoadBuildingsInTile: Self = this.set("autoLoadBuildingsInTile", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDisableHoverMarker(value: Boolean): Self = this.set("disableHoverMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHoverMarker: Self = this.set("disableHoverMarker", js.undefined)
    @scala.inline
    def setDisableIconRender(value: Boolean): Self = this.set("disableIconRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIconRender: Self = this.set("disableIconRender", js.undefined)
    @scala.inline
    def setDisableLabelRender(value: Boolean): Self = this.set("disableLabelRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLabelRender: Self = this.set("disableLabelRender", js.undefined)
    @scala.inline
    def setFeaturezIndex(value: Double): Self = this.set("featurezIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturezIndex: Self = this.set("featurezIndex", js.undefined)
    @scala.inline
    def setHideFloorBar(value: Boolean): Self = this.set("hideFloorBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFloorBar: Self = this.set("hideFloorBar", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
  
}

