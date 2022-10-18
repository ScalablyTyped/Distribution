package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaybeStatementResource extends StObject {
  
  var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
}
object MaybeStatementResource {
  
  inline def apply(): MaybeStatementResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementResource]
  }
  
  extension [Self <: MaybeStatementResource](x: Self) {
    
    inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
