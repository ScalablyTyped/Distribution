package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplication extends StObject {
  
  /**
    * The AWS Region in which the SIP media application is created.
    */
  var AwsRegion: js.UndefOr[String] = js.native
  
  /**
    * The SIP media application creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * List of endpoints for SIP media application. Currently, only one endpoint per SIP media application is permitted.
    */
  var Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.native
  
  /**
    * The name of the SIP media application.
    */
  var Name: js.UndefOr[SipMediaApplicationName] = js.native
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The SIP media application updated timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}
object SipMediaApplication {
  
  @scala.inline
  def apply(): SipMediaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplication]
  }
  
  @scala.inline
  implicit class SipMediaApplicationMutableBuilder[Self <: SipMediaApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEndpoints(value: SipMediaApplicationEndpointList): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: SipMediaApplicationEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setName(value: SipMediaApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
