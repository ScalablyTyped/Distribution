package typings.amapJsApiHeatmap.AMap.Heatmap

import org.scalablytyped.runtime.StringDictionary
import typings.amapJsApiHeatmap.anon.DrawGridLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var `3d`: js.UndefOr[DrawGridLine] = js.native
  var blur: js.UndefOr[Double] = js.native
  /**
    * 热力图的渐变区间
    */
  var gradient: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * 热力图透明度数组，取值范围[0,1]，0表示完全透明，1表示不透明
    * 默认：[0,1]
    */
  var opacity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /**
    * 热力图中单个点的半径，默认：30，单位：pixel
    */
  var radius: js.UndefOr[Double] = js.native
  var radiusUnit: js.UndefOr[String] = js.native
  var rejectMapMask: js.UndefOr[Boolean] = js.native
  var renderOnZooming: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * 支持的缩放级别范围，取值范围[3-18]
    * 默认：[3,18]
    */
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
    def set3d(value: DrawGridLine): Self = this.set("3d", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3d: Self = this.set("3d", js.undefined)
    @scala.inline
    def setBlur(value: Double): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setGradient(value: StringDictionary[String]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    @scala.inline
    def setOpacity(value: js.Tuple2[Double, Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRadiusUnit(value: String): Self = this.set("radiusUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusUnit: Self = this.set("radiusUnit", js.undefined)
    @scala.inline
    def setRejectMapMask(value: Boolean): Self = this.set("rejectMapMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectMapMask: Self = this.set("rejectMapMask", js.undefined)
    @scala.inline
    def setRenderOnZooming(value: Boolean): Self = this.set("renderOnZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderOnZooming: Self = this.set("renderOnZooming", js.undefined)
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

