package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUser extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The time at which the AppInstanceUser was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the AppInstanceUser was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metadata of the AppInstanceUser.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The name of the AppInstanceUser.
    */
  var Name: js.UndefOr[UserName] = js.undefined
}
object AppInstanceUser {
  
  inline def apply(): AppInstanceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUser]
  }
  
  extension [Self <: AppInstanceUser](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
