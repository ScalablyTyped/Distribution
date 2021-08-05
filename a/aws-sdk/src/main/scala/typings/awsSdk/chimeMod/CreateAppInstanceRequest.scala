package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceRequest extends StObject {
  
  /**
    * The ClientRequestToken of the app instance.
    */
  var ClientRequestToken: typings.awsSdk.chimeMod.ClientRequestToken
  
  /**
    * The metadata of the app instance. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.undefined
  
  /**
    * The name of the app instance.
    */
  var Name: NonEmptyResourceName
}
object CreateAppInstanceRequest {
  
  inline def apply(ClientRequestToken: ClientRequestToken, Name: NonEmptyResourceName): CreateAppInstanceRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceRequest]
  }
  
  extension [Self <: CreateAppInstanceRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
