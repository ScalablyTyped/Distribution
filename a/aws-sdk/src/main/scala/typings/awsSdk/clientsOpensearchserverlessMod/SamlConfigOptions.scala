package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlConfigOptions extends StObject {
  
  /**
    * The group attribute for this SAML integration.
    */
  var groupAttribute: js.UndefOr[samlGroupAttribute] = js.undefined
  
  /**
    * The XML IdP metadata file generated from your identity provider.
    */
  var metadata: samlMetadata
  
  /**
    * The session timeout, in minutes. Default is 60 minutes (12 hours).
    */
  var sessionTimeout: js.UndefOr[SamlConfigOptionsSessionTimeoutInteger] = js.undefined
  
  /**
    * A user attribute for this SAML integration.
    */
  var userAttribute: js.UndefOr[samlUserAttribute] = js.undefined
}
object SamlConfigOptions {
  
  inline def apply(metadata: samlMetadata): SamlConfigOptions = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamlConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setGroupAttribute(value: samlGroupAttribute): Self = StObject.set(x, "groupAttribute", value.asInstanceOf[js.Any])
    
    inline def setGroupAttributeUndefined: Self = StObject.set(x, "groupAttribute", js.undefined)
    
    inline def setMetadata(value: samlMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeout(value: SamlConfigOptionsSessionTimeoutInteger): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setUserAttribute(value: samlUserAttribute): Self = StObject.set(x, "userAttribute", value.asInstanceOf[js.Any])
    
    inline def setUserAttributeUndefined: Self = StObject.set(x, "userAttribute", js.undefined)
  }
}
