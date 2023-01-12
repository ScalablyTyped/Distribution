package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the AppInstance request.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The user ID of the AppInstance.
    */
  var AppInstanceUserId: UserId
  
  /**
    * The token assigned to the user requesting an AppInstance.
    */
  var ClientRequestToken: typings.awsSdk.clientsChimeMod.ClientRequestToken
  
  /**
    * The request's metadata. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimeMod.Metadata] = js.undefined
  
  /**
    * The user's name.
    */
  var Name: UserName
  
  /**
    * Tags assigned to the AppInstanceUser.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAppInstanceUserRequest {
  
  inline def apply(
    AppInstanceArn: ChimeArn,
    AppInstanceUserId: UserId,
    ClientRequestToken: ClientRequestToken,
    Name: UserName
  ): CreateAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceUserId = AppInstanceUserId.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserId(value: UserId): Self = StObject.set(x, "AppInstanceUserId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
