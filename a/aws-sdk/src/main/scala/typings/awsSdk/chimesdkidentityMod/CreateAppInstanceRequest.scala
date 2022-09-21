package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceRequest extends StObject {
  
  /**
    * The ClientRequestToken of the AppInstance.
    */
  var ClientRequestToken: typings.awsSdk.chimesdkidentityMod.ClientRequestToken
  
  /**
    * The metadata of the AppInstance. Limited to a 1KB string in UTF-8.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimesdkidentityMod.Metadata] = js.undefined
  
  /**
    * The name of the AppInstance.
    */
  var Name: NonEmptyResourceName
  
  /**
    * Tags assigned to the AppInstanceUser.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
