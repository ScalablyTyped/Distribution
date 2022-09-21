package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Claims extends StObject {
  
  var claims: StringDictionary[String | Double | Boolean | js.Array[String]]
  
  var scopes: js.Array[String]
}
object Claims {
  
  inline def apply(claims: StringDictionary[String | Double | Boolean | js.Array[String]], scopes: js.Array[String]): Claims = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claims]
  }
  
  extension [Self <: Claims](x: Self) {
    
    inline def setClaims(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
