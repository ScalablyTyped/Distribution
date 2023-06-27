package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphApplyEditsOptions extends StObject {
  
  /**
  		 * If `true`, deleting an entity will automatically delete all relationships connected to that entity.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#options)
  		 */
  var cascadeDelete: Boolean
  
  /**
  		 * Custom [quantization parameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-InputQuantizationParameters.html) for input geometry that compresses geometry for transfer to the server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphApplyEdits.html#options)
  		 */
  var inputQuantizationParameters: InputQuantizationParameters
}
object GraphApplyEditsOptions {
  
  inline def apply(cascadeDelete: Boolean, inputQuantizationParameters: InputQuantizationParameters): GraphApplyEditsOptions = {
    val __obj = js.Dynamic.literal(cascadeDelete = cascadeDelete.asInstanceOf[js.Any], inputQuantizationParameters = inputQuantizationParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphApplyEditsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphApplyEditsOptions] (val x: Self) extends AnyVal {
    
    inline def setCascadeDelete(value: Boolean): Self = StObject.set(x, "cascadeDelete", value.asInstanceOf[js.Any])
    
    inline def setInputQuantizationParameters(value: InputQuantizationParameters): Self = StObject.set(x, "inputQuantizationParameters", value.asInstanceOf[js.Any])
  }
}
