package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReferenceProperties extends StObject {
  
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
  implicit class SpatialReferencePropertiesMutableBuilder[Self <: SpatialReferenceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageCoordinateSystem(value: js.Any): Self = StObject.set(x, "imageCoordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageCoordinateSystemUndefined: Self = StObject.set(x, "imageCoordinateSystem", js.undefined)
    
    @scala.inline
    def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    @scala.inline
    def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
