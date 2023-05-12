package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rasterFunctionConstantsLocalConditionalOperation extends StObject {
  
  /**
    * Performs a conditional If, Then, Else operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localConditionalOperation)
    */
  var conditional: Double
  
  /**
    * Set Null sets identified cell locations to NoData based on a specified criteria.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-rasterFunctionConstants.html#localConditionalOperation)
    */
  var setNull: Double
}
object rasterFunctionConstantsLocalConditionalOperation {
  
  inline def apply(conditional: Double, setNull: Double): rasterFunctionConstantsLocalConditionalOperation = {
    val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], setNull = setNull.asInstanceOf[js.Any])
    __obj.asInstanceOf[rasterFunctionConstantsLocalConditionalOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: rasterFunctionConstantsLocalConditionalOperation] (val x: Self) extends AnyVal {
    
    inline def setConditional(value: Double): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
    
    inline def setSetNull(value: Double): Self = StObject.set(x, "setNull", value.asInstanceOf[js.Any])
  }
}
