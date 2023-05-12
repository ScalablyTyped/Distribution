package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsColormapName extends StObject {
  
  /**
    * colormap to visualize vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var NDVI: String
  
  /**
    * A colormap to visualize vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var NDVI2: String
  
  /**
    * A colormap to visualize vegetation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var NDVI3: String
  
  /**
    * A color map that gradually changes from cyan to purple to black.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var elevation: String
  
  /**
    * A color map that gradually changes from black to white.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var gray: String
  
  /**
    * A colormap to visualize a hillshade product.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var hillshade: String
  
  /**
    * A random colormap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#colormapName)
    */
  var random: String
}
object rasterFunctionConstantsColormapName {
  
  inline def apply(
    NDVI: String,
    NDVI2: String,
    NDVI3: String,
    elevation: String,
    gray: String,
    hillshade: String,
    random: String
  ): rasterFunctionConstantsColormapName = {
    val __obj = js.Dynamic.literal(NDVI = NDVI.asInstanceOf[js.Any], NDVI2 = NDVI2.asInstanceOf[js.Any], NDVI3 = NDVI3.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], hillshade = hillshade.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsColormapName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsColormapName] (val x: Self) extends AnyVal {
    
    inline def setElevation(value: String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setGray(value: String): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
    
    inline def setHillshade(value: String): Self = StObject.set(x, "hillshade", value.asInstanceOf[js.Any])
    
    inline def setNDVI(value: String): Self = StObject.set(x, "NDVI", value.asInstanceOf[js.Any])
    
    inline def setNDVI2(value: String): Self = StObject.set(x, "NDVI2", value.asInstanceOf[js.Any])
    
    inline def setNDVI3(value: String): Self = StObject.set(x, "NDVI3", value.asInstanceOf[js.Any])
    
    inline def setRandom(value: String): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
  }
}
