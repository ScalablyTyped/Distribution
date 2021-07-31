package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUser extends StObject {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The time at which the app instance user was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which the app instance user was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The metadata of the app instance user.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
  /**
    * The name of the app instance user.
    */
  var Name: js.UndefOr[UserName] = js.undefined
}
object AppInstanceUser {
  
  @scala.inline
  def apply(): AppInstanceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUser]
  }
  
  @scala.inline
  implicit class AppInstanceUserMutableBuilder[Self <: AppInstanceUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
