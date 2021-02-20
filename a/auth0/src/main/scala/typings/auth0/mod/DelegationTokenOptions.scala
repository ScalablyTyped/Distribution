package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelegationTokenOptions extends StObject {
  
  var api_type: String = js.native
  
  var grant_type: String = js.native
  
  var id_token: String = js.native
  
  var scope: String = js.native
  
  var target: String = js.native
}
object DelegationTokenOptions {
  
  @scala.inline
  def apply(api_type: String, grant_type: String, id_token: String, scope: String, target: String): DelegationTokenOptions = {
    val __obj = js.Dynamic.literal(api_type = api_type.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationTokenOptions]
  }
  
  @scala.inline
  implicit class DelegationTokenOptionsMutableBuilder[Self <: DelegationTokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_type(value: String): Self = StObject.set(x, "api_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
