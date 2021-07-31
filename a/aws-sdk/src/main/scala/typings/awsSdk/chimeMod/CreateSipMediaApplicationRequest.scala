package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationRequest extends StObject {
  
  /**
    * AWS Region assigned to the SIP media application.
    */
  var AwsRegion: String
  
  /**
    * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported.
    */
  var Endpoints: SipMediaApplicationEndpointList
  
  /**
    * The SIP media application name.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.undefined
}
object CreateSipMediaApplicationRequest {
  
  @scala.inline
  def apply(AwsRegion: String, Endpoints: SipMediaApplicationEndpointList): CreateSipMediaApplicationRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion.asInstanceOf[js.Any], Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationRequestMutableBuilder[Self <: CreateSipMediaApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoints(value: SipMediaApplicationEndpointList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setName(value: SipMediaApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
