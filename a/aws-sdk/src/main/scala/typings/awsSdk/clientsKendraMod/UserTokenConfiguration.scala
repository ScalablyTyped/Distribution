package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTokenConfiguration extends StObject {
  
  /**
    * Information about the JSON token type configuration.
    */
  var JsonTokenTypeConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.JsonTokenTypeConfiguration] = js.undefined
  
  /**
    * Information about the JWT token type configuration.
    */
  var JwtTokenTypeConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.JwtTokenTypeConfiguration] = js.undefined
}
object UserTokenConfiguration {
  
  inline def apply(): UserTokenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTokenConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserTokenConfiguration] (val x: Self) extends AnyVal {
    
    inline def setJsonTokenTypeConfiguration(value: JsonTokenTypeConfiguration): Self = StObject.set(x, "JsonTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJsonTokenTypeConfigurationUndefined: Self = StObject.set(x, "JsonTokenTypeConfiguration", js.undefined)
    
    inline def setJwtTokenTypeConfiguration(value: JwtTokenTypeConfiguration): Self = StObject.set(x, "JwtTokenTypeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJwtTokenTypeConfigurationUndefined: Self = StObject.set(x, "JwtTokenTypeConfiguration", js.undefined)
  }
}
