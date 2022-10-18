package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolDescriptionType extends StObject {
  
  /**
    * The date the user pool description was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID in a user pool description.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The Lambda configuration information in a user pool description.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  
  /**
    * The date the user pool description was last modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name in a user pool description.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.undefined
  
  /**
    * The user pool status in a user pool description.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
}
object UserPoolDescriptionType {
  
  inline def apply(): UserPoolDescriptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDescriptionType]
  }
  
  extension [Self <: UserPoolDescriptionType](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setId(value: UserPoolIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: UserPoolNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
