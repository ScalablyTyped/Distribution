package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationRequest extends StObject {
  
  /**
    * The AWS Region assigned to the SIP media application.
    */
  var AwsRegion: String
  
  /**
    * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported.
    */
  var Endpoints: SipMediaApplicationEndpointList
  
  /**
    * The SIP media application name.
    */
  var Name: SipMediaApplicationName
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
  }
}
