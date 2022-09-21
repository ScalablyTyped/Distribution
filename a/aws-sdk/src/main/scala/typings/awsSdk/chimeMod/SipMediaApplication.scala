package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipMediaApplication extends StObject {
  
  /**
    * The AWS Region in which the SIP media application is created.
    */
  var AwsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The SIP media application creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
    */
  var Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined
  
  /**
    * The name of the SIP media application.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.undefined
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The SIP media application updated timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object SipMediaApplication {
  
  inline def apply(): SipMediaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplication]
  }
  
  extension [Self <: SipMediaApplication](x: Self) {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEndpoints(value: SipMediaApplicationEndpointList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setName(value: SipMediaApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
