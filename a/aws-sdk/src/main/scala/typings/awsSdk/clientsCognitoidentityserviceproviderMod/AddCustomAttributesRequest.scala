package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomAttributesRequest extends StObject {
  
  /**
    * An array of custom attributes, such as Mutable and Name.
    */
  var CustomAttributes: CustomAttributesListType
  
  /**
    * The user pool ID for the user pool where you want to add custom attributes.
    */
  var UserPoolId: UserPoolIdType
}
object AddCustomAttributesRequest {
  
  inline def apply(CustomAttributes: CustomAttributesListType, UserPoolId: UserPoolIdType): AddCustomAttributesRequest = {
    val __obj = js.Dynamic.literal(CustomAttributes = CustomAttributes.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomAttributesRequest]
  }
  
  extension [Self <: AddCustomAttributesRequest](x: Self) {
    
    inline def setCustomAttributes(value: CustomAttributesListType): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "CustomAttributes", js.Array(value*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
