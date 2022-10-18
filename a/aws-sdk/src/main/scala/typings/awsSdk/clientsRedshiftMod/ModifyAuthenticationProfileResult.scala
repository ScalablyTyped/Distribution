package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAuthenticationProfileResult extends StObject {
  
  /**
    * The updated content of the authentication profile in JSON format.
    */
  var AuthenticationProfileContent: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the authentication profile that was replaced.
    */
  var AuthenticationProfileName: js.UndefOr[AuthenticationProfileNameString] = js.undefined
}
object ModifyAuthenticationProfileResult {
  
  inline def apply(): ModifyAuthenticationProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAuthenticationProfileResult]
  }
  
  extension [Self <: ModifyAuthenticationProfileResult](x: Self) {
    
    inline def setAuthenticationProfileContent(value: String): Self = StObject.set(x, "AuthenticationProfileContent", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileContentUndefined: Self = StObject.set(x, "AuthenticationProfileContent", js.undefined)
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileNameUndefined: Self = StObject.set(x, "AuthenticationProfileName", js.undefined)
  }
}
