package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerClustererOptions extends js.Object {
  
  var averageCenter: js.UndefOr[Boolean] = js.native
  
  var gridSize: js.UndefOr[Double] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minClusterSize: js.UndefOr[Double] = js.native
  
  var renderCluserMarker: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.native
  
  var styles: js.UndefOr[js.Array[_]] = js.native
  
  var zoomOnClick: js.UndefOr[Boolean] = js.native
}
object MarkerClustererOptions {
  
  @scala.inline
  def apply(): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClustererOptions]
  }
  
  @scala.inline
  implicit class MarkerClustererOptionsOps[Self <: MarkerClustererOptions] (val x: Self) extends AnyVal {
    
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
    def setAverageCenter(value: Boolean): Self = this.set("averageCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageCenter: Self = this.set("averageCenter", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinClusterSize(value: Double): Self = this.set("minClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinClusterSize: Self = this.set("minClusterSize", js.undefined)
    
    @scala.inline
    def setRenderCluserMarker(value: /* obj */ js.Any => Unit): Self = this.set("renderCluserMarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderCluserMarker: Self = this.set("renderCluserMarker", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: js.Any*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[_]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setZoomOnClick(value: Boolean): Self = this.set("zoomOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnClick: Self = this.set("zoomOnClick", js.undefined)
  }
}
