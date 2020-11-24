package typings.amapJsApi.AMap.Polyline

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[ExtraData]
  extends typings.amapJsApi.AMap.PathOverlay.Options[ExtraData] {
  
  /**
    * 描边的宽度
    */
  var borderWeight: js.UndefOr[Double] = js.native
  
  /**
    * 方向箭头颜色
    */
  var dirColor: js.UndefOr[String] = js.native
  
  /**
    * 是否绘制成大地线
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  /**
    * 线条是否带描边
    */
  var isOutline: js.UndefOr[Boolean] = js.native
  
  /**
    * 线条描边颜色
    */
  var outlineColor: js.UndefOr[String] = js.native
  
  // internal
  /**
    * 折线的节点数组
    */
  var path: js.UndefOr[js.Array[LocationValue]] = js.native
  
  /**
    * 是否延路径显示方向箭头
    */
  var showDir: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
    
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
    def setBorderWeight(value: Double): Self = this.set("borderWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWeight: Self = this.set("borderWeight", js.undefined)
    
    @scala.inline
    def setDirColor(value: String): Self = this.set("dirColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirColor: Self = this.set("dirColor", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    
    @scala.inline
    def setIsOutline(value: Boolean): Self = this.set("isOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutline: Self = this.set("isOutline", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: LocationValue*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LocationValue]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setShowDir(value: Boolean): Self = this.set("showDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDir: Self = this.set("showDir", js.undefined)
  }
}
