package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriberRequest extends StObject {
  
  /**
    * The external ID of the Security Lake account.
    */
  var externalId: js.UndefOr[SafeString] = js.undefined
  
  /**
    * A value created by Security Lake that uniquely identifies your subscription. 
    */
  var id: String
  
  /**
    * The supported Amazon Web Services from which logs and events are collected. For the list of supported Amazon Web Services, see the Amazon Security Lake User Guide.
    */
  var sourceTypes: SourceTypeList
  
  /**
    * The description of the Security Lake account subscriber.
    */
  var subscriberDescription: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of the Security Lake account subscriber. 
    */
  var subscriberName: js.UndefOr[UpdateSubscriberRequestSubscriberNameString] = js.undefined
}
object UpdateSubscriberRequest {
  
  inline def apply(id: String, sourceTypes: SourceTypeList): UpdateSubscriberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceTypes = sourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubscriberRequest] (val x: Self) extends AnyVal {
    
    inline def setExternalId(value: SafeString): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSourceTypes(value: SourceTypeList): Self = StObject.set(x, "sourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSourceTypesVarargs(value: SourceType*): Self = StObject.set(x, "sourceTypes", js.Array(value*))
    
    inline def setSubscriberDescription(value: DescriptionString): Self = StObject.set(x, "subscriberDescription", value.asInstanceOf[js.Any])
    
    inline def setSubscriberDescriptionUndefined: Self = StObject.set(x, "subscriberDescription", js.undefined)
    
    inline def setSubscriberName(value: UpdateSubscriberRequestSubscriberNameString): Self = StObject.set(x, "subscriberName", value.asInstanceOf[js.Any])
    
    inline def setSubscriberNameUndefined: Self = StObject.set(x, "subscriberName", js.undefined)
  }
}
