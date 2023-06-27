package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputQuantizationParameters
  extends StObject
     with Accessor {
  
  /**
  		 * Origin of M-Values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#mFalseOrigin)
  		 */
  var mFalseOrigin: Double = js.native
  
  /**
  		 * Number of significant digits for M-Values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#mResolution)
  		 */
  var mResolution: Double = js.native
  
  /**
  		 * False origin of x values of the quantization grid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#xFalseOrigin)
  		 */
  var xFalseOrigin: Double = js.native
  
  /**
  		 * Number of significant digits for the x and y coordinates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#xyResolution)
  		 */
  var xyResolution: Double = js.native
  
  /**
  		 * False origin for y-values of the quantization grid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#yFalseOrigin)
  		 */
  var yFalseOrigin: Double = js.native
  
  /**
  		 * The false origin of the Z-values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#zFalseOrigin)
  		 */
  var zFalseOrigin: Double = js.native
  
  /**
  		 * Number of significant digits of the Z-Values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html#zResolution)
  		 */
  var zResolution: Double = js.native
}
