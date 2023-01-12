package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiMappingRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: Id
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  
  /**
    * The domain name.
    */
  var DomainName: string
  
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128
}
object CreateApiMappingRequest {
  
  inline def apply(ApiId: Id, DomainName: string, Stage: StringWithLengthBetween1And128): CreateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApiMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
  }
}
