package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNameConfiguration extends js.Object {
  /**
    * A domain name for the WebSocket API.
    */
  var ApiGatewayDomainName: js.UndefOr[__string] = js.undefined
  /**
    * An AWS-managed certificate that will be used by the edge-optimized endpoint for
    this domain name. AWS Certificate Manager is the only supported source.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  /**
    * The user-friendly name of the certificate that will be used by the edge-optimized
    endpoint for this domain name.
    */
  var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for
    this domain name was uploaded.
    */
  var CertificateUploadDate: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[EndpointType] = js.undefined
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[__string] = js.undefined
}

object DomainNameConfiguration {
  @scala.inline
  def apply(
    ApiGatewayDomainName: __string = null,
    CertificateArn: Arn = null,
    CertificateName: StringWithLengthBetween1And128 = null,
    CertificateUploadDate: __timestampIso8601 = null,
    EndpointType: EndpointType = null,
    HostedZoneId: __string = null
  ): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApiGatewayDomainName != null) __obj.updateDynamic("ApiGatewayDomainName")(ApiGatewayDomainName)
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateName != null) __obj.updateDynamic("CertificateName")(CertificateName)
    if (CertificateUploadDate != null) __obj.updateDynamic("CertificateUploadDate")(CertificateUploadDate)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    __obj.asInstanceOf[DomainNameConfiguration]
  }
}

