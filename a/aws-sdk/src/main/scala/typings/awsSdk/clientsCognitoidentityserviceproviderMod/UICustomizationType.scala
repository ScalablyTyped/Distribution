package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UICustomizationType extends StObject {
  
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.undefined
  
  /**
    * The CSS version number.
    */
  var CSSVersion: js.UndefOr[CSSVersionType] = js.undefined
  
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  
  /**
    * The creation date for the UI customization.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The logo image for the UI customization.
    */
  var ImageUrl: js.UndefOr[ImageUrlType] = js.undefined
  
  /**
    * The last-modified date for the UI customization.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object UICustomizationType {
  
  inline def apply(): UICustomizationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UICustomizationType]
  }
  
  extension [Self <: UICustomizationType](x: Self) {
    
    inline def setCSS(value: CSSType): Self = StObject.set(x, "CSS", value.asInstanceOf[js.Any])
    
    inline def setCSSUndefined: Self = StObject.set(x, "CSS", js.undefined)
    
    inline def setCSSVersion(value: CSSVersionType): Self = StObject.set(x, "CSSVersion", value.asInstanceOf[js.Any])
    
    inline def setCSSVersionUndefined: Self = StObject.set(x, "CSSVersion", js.undefined)
    
    inline def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setImageUrl(value: ImageUrlType): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
