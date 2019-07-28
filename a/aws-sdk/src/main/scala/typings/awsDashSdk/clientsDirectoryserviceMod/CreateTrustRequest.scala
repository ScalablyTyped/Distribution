package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrustRequest extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
  /**
    * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
    */
  var RemoteDomainName: typings.awsDashSdk.clientsDirectoryserviceMod.RemoteDomainName
  /**
    * Optional parameter to enable selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SelectiveAuth] = js.undefined
  /**
    * The direction of the trust relationship.
    */
  var TrustDirection: typings.awsDashSdk.clientsDirectoryserviceMod.TrustDirection
  /**
    * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
    */
  var TrustPassword: typings.awsDashSdk.clientsDirectoryserviceMod.TrustPassword
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TrustType] = js.undefined
}

object CreateTrustRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    RemoteDomainName: RemoteDomainName,
    TrustDirection: TrustDirection,
    TrustPassword: TrustPassword,
    ConditionalForwarderIpAddrs: DnsIpAddrs = null,
    SelectiveAuth: SelectiveAuth = null,
    TrustType: TrustType = null
  ): CreateTrustRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, RemoteDomainName = RemoteDomainName, TrustDirection = TrustDirection.asInstanceOf[js.Any], TrustPassword = TrustPassword)
    if (ConditionalForwarderIpAddrs != null) __obj.updateDynamic("ConditionalForwarderIpAddrs")(ConditionalForwarderIpAddrs)
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    if (TrustType != null) __obj.updateDynamic("TrustType")(TrustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustRequest]
  }
}

