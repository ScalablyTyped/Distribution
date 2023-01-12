package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputQuantizationParametersProperties extends StObject {
  
  /**
    * Origin of M-Values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#mFalseOrigin)
    */
  var mFalseOrigin: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of significant digits for M-Values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#mResolution)
    */
  var mResolution: js.UndefOr[Double] = js.undefined
  
  /**
    * False origin of x values of the quantization grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#xFalseOrigin)
    */
  var xFalseOrigin: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of significant digits for the x and y coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#xyResolution)
    */
  var xyResolution: js.UndefOr[Double] = js.undefined
  
  /**
    * False origin for y-values of the quantization grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#yFalseOrigin)
    */
  var yFalseOrigin: js.UndefOr[Double] = js.undefined
  
  /**
    * The false origin of the Z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#zFalseOrigin)
    */
  var zFalseOrigin: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of significant digits of the Z-Values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#zResolution)
    */
  var zResolution: js.UndefOr[Double] = js.undefined
}
object InputQuantizationParametersProperties {
  
  inline def apply(): InputQuantizationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuantizationParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputQuantizationParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setMFalseOrigin(value: Double): Self = StObject.set(x, "mFalseOrigin", value.asInstanceOf[js.Any])
    
    inline def setMFalseOriginUndefined: Self = StObject.set(x, "mFalseOrigin", js.undefined)
    
    inline def setMResolution(value: Double): Self = StObject.set(x, "mResolution", value.asInstanceOf[js.Any])
    
    inline def setMResolutionUndefined: Self = StObject.set(x, "mResolution", js.undefined)
    
    inline def setXFalseOrigin(value: Double): Self = StObject.set(x, "xFalseOrigin", value.asInstanceOf[js.Any])
    
    inline def setXFalseOriginUndefined: Self = StObject.set(x, "xFalseOrigin", js.undefined)
    
    inline def setXyResolution(value: Double): Self = StObject.set(x, "xyResolution", value.asInstanceOf[js.Any])
    
    inline def setXyResolutionUndefined: Self = StObject.set(x, "xyResolution", js.undefined)
    
    inline def setYFalseOrigin(value: Double): Self = StObject.set(x, "yFalseOrigin", value.asInstanceOf[js.Any])
    
    inline def setYFalseOriginUndefined: Self = StObject.set(x, "yFalseOrigin", js.undefined)
    
    inline def setZFalseOrigin(value: Double): Self = StObject.set(x, "zFalseOrigin", value.asInstanceOf[js.Any])
    
    inline def setZFalseOriginUndefined: Self = StObject.set(x, "zFalseOrigin", js.undefined)
    
    inline def setZResolution(value: Double): Self = StObject.set(x, "zResolution", value.asInstanceOf[js.Any])
    
    inline def setZResolutionUndefined: Self = StObject.set(x, "zResolution", js.undefined)
  }
}
