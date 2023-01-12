package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelsResult extends StObject {
  
  /**
    * The array of models.
    */
  var models: js.UndefOr[modelList] = js.undefined
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetModelsResult {
  
  inline def apply(): GetModelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetModelsResult] (val x: Self) extends AnyVal {
    
    inline def setModels(value: modelList): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
