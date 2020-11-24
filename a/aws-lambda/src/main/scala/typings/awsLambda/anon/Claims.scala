package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Claims extends js.Object {
  
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
  implicit class ClaimsOps[Self <: Claims] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClaims(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
}
