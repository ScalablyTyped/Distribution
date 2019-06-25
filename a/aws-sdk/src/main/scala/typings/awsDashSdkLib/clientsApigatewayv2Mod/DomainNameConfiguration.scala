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
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var DomainNameStatus: js.UndefOr[DomainNameStatus] = js.undefined
  /**
    * An optional text message containing detailed information about status of the domain name migration.
    */
  var DomainNameStatusMessage: js.UndefOr[__string] = js.undefined
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[EndpointType] = js.undefined
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[__string] = js.undefined
  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  var SecurityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
}

object DomainNameConfiguration {
  @scala.inline
  def apply(
    ApiGatewayDomainName: __string = null,
    CertificateArn: Arn = null,
    CertificateName: StringWithLengthBetween1And128 = null,
    CertificateUploadDate: __timestampIso8601 = null,
    DomainNameStatus: DomainNameStatus = null,
    DomainNameStatusMessage: __string = null,
    EndpointType: EndpointType = null,
    HostedZoneId: __string = null,
    SecurityPolicy: SecurityPolicy = null
  ): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApiGatewayDomainName != null) __obj.updateDynamic("ApiGatewayDomainName")(ApiGatewayDomainName)
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateName != null) __obj.updateDynamic("CertificateName")(CertificateName)
    if (CertificateUploadDate != null) __obj.updateDynamic("CertificateUploadDate")(CertificateUploadDate)
    if (DomainNameStatus != null) __obj.updateDynamic("DomainNameStatus")(DomainNameStatus.asInstanceOf[js.Any])
    if (DomainNameStatusMessage != null) __obj.updateDynamic("DomainNameStatusMessage")(DomainNameStatusMessage)
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    if (SecurityPolicy != null) __obj.updateDynamic("SecurityPolicy")(SecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameConfiguration]
  }
}

