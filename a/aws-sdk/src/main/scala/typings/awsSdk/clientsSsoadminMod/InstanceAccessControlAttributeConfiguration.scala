package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAccessControlAttributeConfiguration extends StObject {
  
  /**
    * Lists the attributes that are configured for ABAC in the specified IAM Identity Center instance.
    */
  var AccessControlAttributes: AccessControlAttributeList
}
object InstanceAccessControlAttributeConfiguration {
  
  inline def apply(AccessControlAttributes: AccessControlAttributeList): InstanceAccessControlAttributeConfiguration = {
    val __obj = js.Dynamic.literal(AccessControlAttributes = AccessControlAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAccessControlAttributeConfiguration]
  }
  
  extension [Self <: InstanceAccessControlAttributeConfiguration](x: Self) {
    
    inline def setAccessControlAttributes(value: AccessControlAttributeList): Self = StObject.set(x, "AccessControlAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccessControlAttributesVarargs(value: AccessControlAttribute*): Self = StObject.set(x, "AccessControlAttributes", js.Array(value*))
  }
}
