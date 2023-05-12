package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationRequest extends StObject {
  
  /**
    * The AWS Region assigned to the SIP media application.
    */
  var AwsRegion: String
  
  /**
    * List of endpoints (Lambda ARNs) specified for the SIP media application.
    */
  var Endpoints: SipMediaApplicationEndpointList
  
  /**
    * The SIP media application's name.
    */
  var Name: SipMediaApplicationName
  
  /**
    * The tags assigned to the SIP media application.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSipMediaApplicationRequest {
  
  inline def apply(AwsRegion: String, Endpoints: SipMediaApplicationEndpointList, Name: SipMediaApplicationName): CreateSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setEndpoints(value: SipMediaApplicationEndpointList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setName(value: SipMediaApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
