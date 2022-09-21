package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementAttribute extends StObject {
  
  /**
    * A supported AWS IAM SAML PrincipalTag attribute that is matched to the associated value when a user identity federates into an Amazon AppStream 2.0 SAML application. The following are valid values:   roles   department    organization    groups    title    costCenter    userType    
    */
  var Name: String
  
  /**
    * A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon AppStream 2.0 SAML application. 
    */
  var Value: String
}
object EntitlementAttribute {
  
  inline def apply(Name: String, Value: String): EntitlementAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitlementAttribute]
  }
  
  extension [Self <: EntitlementAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
