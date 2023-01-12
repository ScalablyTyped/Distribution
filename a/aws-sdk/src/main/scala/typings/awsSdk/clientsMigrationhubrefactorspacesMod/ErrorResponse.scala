package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse extends StObject {
  
  /**
    * The Amazon Web Services account ID of the resource owner. 
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.AccountId] = js.undefined
  
  /**
    * Additional details about the error. 
    */
  var AdditionalDetails: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.AdditionalDetails] = js.undefined
  
  /**
    * The error code associated with the error. 
    */
  var Code: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The message associated with the error. 
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The ID of the resource. 
    */
  var ResourceIdentifier: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ResourceIdentifier] = js.undefined
  
  /**
    * The type of resource. 
    */
  var ResourceType: js.UndefOr[ErrorResourceType] = js.undefined
}
object ErrorResponse {
  
  inline def apply(): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAdditionalDetails(value: AdditionalDetails): Self = StObject.set(x, "AdditionalDetails", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDetailsUndefined: Self = StObject.set(x, "AdditionalDetails", js.undefined)
    
    inline def setCode(value: ErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
    
    inline def setResourceType(value: ErrorResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
