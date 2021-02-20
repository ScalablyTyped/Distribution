package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Claims extends StObject {
  
  var claims: StringDictionary[String | Double | Boolean | js.Array[String]] = js.native
  
  var scopes: js.Array[String] = js.native
}
object Claims {
  
  @scala.inline
  def apply(claims: StringDictionary[String | Double | Boolean | js.Array[String]], scopes: js.Array[String]): Claims = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Claims]
  }
  
  @scala.inline
  implicit class ClaimsMutableBuilder[Self <: Claims] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaims(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
