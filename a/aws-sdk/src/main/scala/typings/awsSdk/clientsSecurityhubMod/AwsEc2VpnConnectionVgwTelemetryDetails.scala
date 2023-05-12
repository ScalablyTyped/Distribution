package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpnConnectionVgwTelemetryDetails extends StObject {
  
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ARN of the VPN tunnel endpoint certificate.
    */
  var CertificateArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time of the last change in status. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces, and date and time should be separated by T. For example, 2020-03-22T13:22:13.933Z.
    */
  var LastStatusChange: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the VPN tunnel. Valid values are DOWN or UP.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpnConnectionVgwTelemetryDetails {
  
  inline def apply(): AwsEc2VpnConnectionVgwTelemetryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpnConnectionVgwTelemetryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2VpnConnectionVgwTelemetryDetails] (val x: Self) extends AnyVal {
    
    inline def setAcceptedRouteCount(value: Integer): Self = StObject.set(x, "AcceptedRouteCount", value.asInstanceOf[js.Any])
    
    inline def setAcceptedRouteCountUndefined: Self = StObject.set(x, "AcceptedRouteCount", js.undefined)
    
    inline def setCertificateArn(value: NonEmptyString): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setLastStatusChange(value: NonEmptyString): Self = StObject.set(x, "LastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeUndefined: Self = StObject.set(x, "LastStatusChange", js.undefined)
    
    inline def setOutsideIpAddress(value: NonEmptyString): Self = StObject.set(x, "OutsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddressUndefined: Self = StObject.set(x, "OutsideIpAddress", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: NonEmptyString): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
