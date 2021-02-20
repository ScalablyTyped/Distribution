package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppInstanceRequest extends StObject {
  
  /**
    * The ClientRequestToken of the app instance.
    */
  var ClientRequestToken: typings.awsSdk.chimeMod.ClientRequestToken = js.native
  
  /**
    * The metadata of the app instance. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The name of the app instance.
    */
  var Name: NonEmptyResourceName = js.native
}
object CreateAppInstanceRequest {
  
  @scala.inline
  def apply(ClientRequestToken: ClientRequestToken, Name: NonEmptyResourceName): CreateAppInstanceRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateAppInstanceRequestMutableBuilder[Self <: CreateAppInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
