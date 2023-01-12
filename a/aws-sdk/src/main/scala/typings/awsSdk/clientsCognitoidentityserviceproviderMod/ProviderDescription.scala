package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderDescription extends StObject {
  
  /**
    * The date the provider was added to the user pool.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The IdP name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  
  /**
    * The IdP type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
}
object ProviderDescription {
  
  inline def apply(): ProviderDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    inline def setProviderType(value: IdentityProviderTypeType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
  }
}
