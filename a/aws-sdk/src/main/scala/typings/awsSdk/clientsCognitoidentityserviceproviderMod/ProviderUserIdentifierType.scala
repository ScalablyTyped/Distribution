package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderUserIdentifierType extends StObject {
  
  /**
    * The name of the provider attribute to link to, such as NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.undefined
  
  /**
    * The value of the provider attribute to link to, such as xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.undefined
  
  /**
    * The name of the provider, such as Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
}
object ProviderUserIdentifierType {
  
  inline def apply(): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderUserIdentifierType] (val x: Self) extends AnyVal {
    
    inline def setProviderAttributeName(value: StringType): Self = StObject.set(x, "ProviderAttributeName", value.asInstanceOf[js.Any])
    
    inline def setProviderAttributeNameUndefined: Self = StObject.set(x, "ProviderAttributeName", js.undefined)
    
    inline def setProviderAttributeValue(value: StringType): Self = StObject.set(x, "ProviderAttributeValue", value.asInstanceOf[js.Any])
    
    inline def setProviderAttributeValueUndefined: Self = StObject.set(x, "ProviderAttributeValue", js.undefined)
    
    inline def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
