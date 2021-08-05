package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyIds extends StObject {
  
  /**
    * A list of all the ApiKey identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * A list of warning messages.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}
object ApiKeyIds {
  
  inline def apply(): ApiKeyIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyIds]
  }
  
  extension [Self <: ApiKeyIds](x: Self) {
    
    inline def setIds(value: ListOfString): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    inline def setWarnings(value: ListOfString): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
