package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReferenceProperties extends js.Object {
  
  /**
    * An [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) defines the spatial reference used to display the image in its original coordinates without distortion, map transformations or ortho-rectification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#imageCoordinateSystem)
    */
  var imageCoordinateSystem: js.UndefOr[js.Any] = js.native
  
  /**
    * The well-known ID of a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: js.UndefOr[Double] = js.native
  
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: js.UndefOr[String] = js.native
}
object SpatialReferenceProperties {
  
  @scala.inline
  def apply(): SpatialReferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceProperties]
  }
  
  @scala.inline
  implicit class SpatialReferencePropertiesOps[Self <: SpatialReferenceProperties] (val x: Self) extends AnyVal {
    
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
    def setImageCoordinateSystem(value: js.Any): Self = this.set("imageCoordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageCoordinateSystem: Self = this.set("imageCoordinateSystem", js.undefined)
    
    @scala.inline
    def setWkid(value: Double): Self = this.set("wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkid: Self = this.set("wkid", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = this.set("wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWkt: Self = this.set("wkt", js.undefined)
  }
}
