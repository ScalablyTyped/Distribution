package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialReferenceProperties extends StObject {
  
  /**
    * An [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) defines the spatial reference used to display the image in its original coordinates without distortion, map transformations or ortho-rectification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#imageCoordinateSystem)
    */
  var imageCoordinateSystem: js.UndefOr[Any] = js.undefined
  
  /**
    * The well-known ID of a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: js.UndefOr[Double] = js.undefined
  
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: js.UndefOr[String] = js.undefined
}
object SpatialReferenceProperties {
  
  inline def apply(): SpatialReferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpatialReferenceProperties]
  }
  
  extension [Self <: SpatialReferenceProperties](x: Self) {
    
    inline def setImageCoordinateSystem(value: Any): Self = StObject.set(x, "imageCoordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setImageCoordinateSystemUndefined: Self = StObject.set(x, "imageCoordinateSystem", js.undefined)
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    inline def setWkidUndefined: Self = StObject.set(x, "wkid", js.undefined)
    
    inline def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
    
    inline def setWktUndefined: Self = StObject.set(x, "wkt", js.undefined)
  }
}
