package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentProperties
  extends StObject
     with GeometryProperties {
  
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    */
  var mmax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    */
  var mmin: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    */
  var xmax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    */
  var xmin: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    */
  var ymax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    */
  var ymin: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    */
  var zmax: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    */
  var zmin: js.UndefOr[Double] = js.undefined
}
object ExtentProperties {
  
  inline def apply(): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentProperties]
  }
  
  extension [Self <: ExtentProperties](x: Self) {
    
    inline def setMmax(value: Double): Self = StObject.set(x, "mmax", value.asInstanceOf[js.Any])
    
    inline def setMmaxUndefined: Self = StObject.set(x, "mmax", js.undefined)
    
    inline def setMmin(value: Double): Self = StObject.set(x, "mmin", value.asInstanceOf[js.Any])
    
    inline def setMminUndefined: Self = StObject.set(x, "mmin", js.undefined)
    
    inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    inline def setXmaxUndefined: Self = StObject.set(x, "xmax", js.undefined)
    
    inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    inline def setXminUndefined: Self = StObject.set(x, "xmin", js.undefined)
    
    inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    inline def setYmaxUndefined: Self = StObject.set(x, "ymax", js.undefined)
    
    inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    
    inline def setYminUndefined: Self = StObject.set(x, "ymin", js.undefined)
    
    inline def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    inline def setZmaxUndefined: Self = StObject.set(x, "zmax", js.undefined)
    
    inline def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
    
    inline def setZminUndefined: Self = StObject.set(x, "zmin", js.undefined)
  }
}
