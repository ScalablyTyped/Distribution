package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrustRequest extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.native
  /**
    * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
    */
  var RemoteDomainName: typings.awsDashSdk.clientsDirectoryserviceMod.RemoteDomainName = js.native
  /**
    * Optional parameter to enable selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SelectiveAuth] = js.native
  /**
    * The direction of the trust relationship.
    */
  var TrustDirection: typings.awsDashSdk.clientsDirectoryserviceMod.TrustDirection = js.native
  /**
    * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
    */
  var TrustPassword: typings.awsDashSdk.clientsDirectoryserviceMod.TrustPassword = js.native
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TrustType] = js.native
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
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any], TrustDirection = TrustDirection.asInstanceOf[js.Any], TrustPassword = TrustPassword.asInstanceOf[js.Any])
    if (ConditionalForwarderIpAddrs != null) __obj.updateDynamic("ConditionalForwarderIpAddrs")(ConditionalForwarderIpAddrs.asInstanceOf[js.Any])
    if (SelectiveAuth != null) __obj.updateDynamic("SelectiveAuth")(SelectiveAuth.asInstanceOf[js.Any])
    if (TrustType != null) __obj.updateDynamic("TrustType")(TrustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustRequest]
  }
}

