package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAngleParametersProperties extends StObject {
  
  /**
    * Angle names to be computed.
    *
    * @default ["north","up"]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#angleNames)
    */
  var angleNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that defines the reference point of rotation to compute the angle direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#point)
    */
  var point: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The rasterId of a raster catalog in the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#rasterId)
    */
  var rasterId: js.UndefOr[Double] = js.undefined
  
  /**
    * The spatial reference used to compute the angles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}
object ImageAngleParametersProperties {
  
  inline def apply(): ImageAngleParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAngleParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAngleParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setAngleNames(value: js.Array[String]): Self = StObject.set(x, "angleNames", value.asInstanceOf[js.Any])
    
    inline def setAngleNamesUndefined: Self = StObject.set(x, "angleNames", js.undefined)
    
    inline def setAngleNamesVarargs(value: String*): Self = StObject.set(x, "angleNames", js.Array(value*))
    
    inline def setPoint(value: PointProperties): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setRasterId(value: Double): Self = StObject.set(x, "rasterId", value.asInstanceOf[js.Any])
    
    inline def setRasterIdUndefined: Self = StObject.set(x, "rasterId", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
