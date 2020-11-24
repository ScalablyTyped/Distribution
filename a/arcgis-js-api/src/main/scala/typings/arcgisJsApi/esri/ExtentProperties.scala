package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentProperties extends GeometryProperties {
  
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    */
  var mmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    */
  var mmin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    */
  var xmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    */
  var xmin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    */
  var ymax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    */
  var ymin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    */
  var zmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    */
  var zmin: js.UndefOr[Double] = js.native
}
object ExtentProperties {
  
  @scala.inline
  def apply(): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentProperties]
  }
  
  @scala.inline
  implicit class ExtentPropertiesOps[Self <: ExtentProperties] (val x: Self) extends AnyVal {
    
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
    def setMmax(value: Double): Self = this.set("mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmax: Self = this.set("mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = this.set("mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMmin: Self = this.set("mmin", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmax: Self = this.set("xmax", js.undefined)
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmin: Self = this.set("xmin", js.undefined)
    
    @scala.inline
    def setYmax(value: Double): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmax: Self = this.set("ymax", js.undefined)
    
    @scala.inline
    def setYmin(value: Double): Self = this.set("ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmin: Self = this.set("ymin", js.undefined)
    
    @scala.inline
    def setZmax(value: Double): Self = this.set("zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZmax: Self = this.set("zmax", js.undefined)
    
    @scala.inline
    def setZmin(value: Double): Self = this.set("zmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZmin: Self = this.set("zmin", js.undefined)
  }
}
