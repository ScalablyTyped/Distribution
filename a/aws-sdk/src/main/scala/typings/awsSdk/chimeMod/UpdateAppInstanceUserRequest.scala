package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: ChimeArn
  
  /**
    * The metadata of the app instance user.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
  /**
    * The name of the app instance user.
    */
  var Name: UserName
}
object UpdateAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn, Name: UserName): UpdateAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class UpdateAppInstanceUserRequestMutableBuilder[Self <: UpdateAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
