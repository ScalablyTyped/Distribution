package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainNameConfiguration extends js.Object {
  /**
    * A domain name for the API.
    */
  var ApiGatewayDomainName: js.UndefOr[string] = js.native
  /**
    * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
    */
  var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var CertificateUploadDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var DomainNameStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameStatus] = js.native
  /**
    * An optional text message containing detailed information about status of the domain name migration.
    */
  var DomainNameStatusMessage: js.UndefOr[string] = js.native
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.EndpointType] = js.native
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[string] = js.native
  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  var SecurityPolicy: js.UndefOr[typings.awsSdk.apigatewayv2Mod.SecurityPolicy] = js.native
}

object DomainNameConfiguration {
  @scala.inline
  def apply(
    ApiGatewayDomainName: string = null,
    CertificateArn: Arn = null,
    CertificateName: StringWithLengthBetween1And128 = null,
    CertificateUploadDate: timestampIso8601 = null,
    DomainNameStatus: DomainNameStatus = null,
    DomainNameStatusMessage: string = null,
    EndpointType: EndpointType = null,
    HostedZoneId: string = null,
    SecurityPolicy: SecurityPolicy = null
  ): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApiGatewayDomainName != null) __obj.updateDynamic("ApiGatewayDomainName")(ApiGatewayDomainName.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateName != null) __obj.updateDynamic("CertificateName")(CertificateName.asInstanceOf[js.Any])
    if (CertificateUploadDate != null) __obj.updateDynamic("CertificateUploadDate")(CertificateUploadDate.asInstanceOf[js.Any])
    if (DomainNameStatus != null) __obj.updateDynamic("DomainNameStatus")(DomainNameStatus.asInstanceOf[js.Any])
    if (DomainNameStatusMessage != null) __obj.updateDynamic("DomainNameStatusMessage")(DomainNameStatusMessage.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (SecurityPolicy != null) __obj.updateDynamic("SecurityPolicy")(SecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNameConfiguration]
  }
}

