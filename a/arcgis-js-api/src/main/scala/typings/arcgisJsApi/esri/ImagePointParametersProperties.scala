package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ExtentPropertiestypeexten
import typings.arcgisJsApi.anon.PointPropertiestypepoint
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePointParametersProperties extends StObject {
  
  /**
    * Input geometry to determine a a point location or a centroid of a given area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointPropertiestypepoint | ExtentPropertiestypeexten | PolygonPropertiestypepoly] = js.undefined
  
  /**
    * When `true`, this method calculates the z-value for the returned point geometry.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html#is3D)
    */
  var is3D: js.UndefOr[Boolean] = js.undefined
}
object ImagePointParametersProperties {
  
  inline def apply(): ImagePointParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePointParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePointParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: PointPropertiestypepoint | ExtentPropertiestypeexten | PolygonPropertiestypepoly): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setIs3D(value: Boolean): Self = StObject.set(x, "is3D", value.asInstanceOf[js.Any])
    
    inline def setIs3DUndefined: Self = StObject.set(x, "is3D", js.undefined)
  }
}
