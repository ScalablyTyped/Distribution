package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyVpnTunnelOptionsSpecification extends js.Object {
  /**
    * The number of seconds after which a DPD timeout occurs. Constraints: A value between 0 and 30. Default: 30 
    */
  var DPDTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The IKE versions that are permitted for the VPN tunnel. Valid values: ikev1 | ikev2 
    */
  var IKEVersions: js.UndefOr[IKEVersionsRequestList] = js.undefined
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: 2 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList] = js.undefined
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList] = js.undefined
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList] = js.undefined
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds. Constraints: A value between 900 and 28,800. Default: 28800 
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: 2 | 5 | 14 | 15 | 16 | 17 | 18 | 22 | 23 | 24 
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList] = js.undefined
  /**
    * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: AES128 | AES256 
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList] = js.undefined
  /**
    * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE negotiations. Valid values: SHA1 | SHA2-256 
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList] = js.undefined
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds. Constraints: A value between 900 and 3,600. The value must be less than the value for Phase1LifetimeSeconds. Default: 3600 
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway. Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_). Must be between 8 and 64 characters in length and cannot start with zero (0).
    */
  var PreSharedKey: js.UndefOr[String] = js.undefined
  /**
    * The percentage of the rekey window (determined by RekeyMarginTimeSeconds) during which the rekey time is randomly selected. Constraints: A value between 0 and 100. Default: 100 
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.undefined
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey. The exact time of the rekey is randomly selected based on the value for RekeyFuzzPercentage. Constraints: A value between 60 and half of Phase2LifetimeSeconds. Default: 540 
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The number of packets in an IKE replay window. Constraints: A value between 64 and 2048. Default: 1024 
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.undefined
  /**
    * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN connections that use the same virtual private gateway.  Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The following CIDR blocks are reserved and cannot be used:    169.254.0.0/30     169.254.1.0/30     169.254.2.0/30     169.254.3.0/30     169.254.4.0/30     169.254.5.0/30     169.254.169.252/30   
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.undefined
}

object ModifyVpnTunnelOptionsSpecification {
  @scala.inline
  def apply(
    DPDTimeoutSeconds: Int | scala.Double = null,
    IKEVersions: IKEVersionsRequestList = null,
    Phase1DHGroupNumbers: Phase1DHGroupNumbersRequestList = null,
    Phase1EncryptionAlgorithms: Phase1EncryptionAlgorithmsRequestList = null,
    Phase1IntegrityAlgorithms: Phase1IntegrityAlgorithmsRequestList = null,
    Phase1LifetimeSeconds: Int | scala.Double = null,
    Phase2DHGroupNumbers: Phase2DHGroupNumbersRequestList = null,
    Phase2EncryptionAlgorithms: Phase2EncryptionAlgorithmsRequestList = null,
    Phase2IntegrityAlgorithms: Phase2IntegrityAlgorithmsRequestList = null,
    Phase2LifetimeSeconds: Int | scala.Double = null,
    PreSharedKey: String = null,
    RekeyFuzzPercentage: Int | scala.Double = null,
    RekeyMarginTimeSeconds: Int | scala.Double = null,
    ReplayWindowSize: Int | scala.Double = null,
    TunnelInsideCidr: String = null
  ): ModifyVpnTunnelOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    if (DPDTimeoutSeconds != null) __obj.updateDynamic("DPDTimeoutSeconds")(DPDTimeoutSeconds.asInstanceOf[js.Any])
    if (IKEVersions != null) __obj.updateDynamic("IKEVersions")(IKEVersions)
    if (Phase1DHGroupNumbers != null) __obj.updateDynamic("Phase1DHGroupNumbers")(Phase1DHGroupNumbers)
    if (Phase1EncryptionAlgorithms != null) __obj.updateDynamic("Phase1EncryptionAlgorithms")(Phase1EncryptionAlgorithms)
    if (Phase1IntegrityAlgorithms != null) __obj.updateDynamic("Phase1IntegrityAlgorithms")(Phase1IntegrityAlgorithms)
    if (Phase1LifetimeSeconds != null) __obj.updateDynamic("Phase1LifetimeSeconds")(Phase1LifetimeSeconds.asInstanceOf[js.Any])
    if (Phase2DHGroupNumbers != null) __obj.updateDynamic("Phase2DHGroupNumbers")(Phase2DHGroupNumbers)
    if (Phase2EncryptionAlgorithms != null) __obj.updateDynamic("Phase2EncryptionAlgorithms")(Phase2EncryptionAlgorithms)
    if (Phase2IntegrityAlgorithms != null) __obj.updateDynamic("Phase2IntegrityAlgorithms")(Phase2IntegrityAlgorithms)
    if (Phase2LifetimeSeconds != null) __obj.updateDynamic("Phase2LifetimeSeconds")(Phase2LifetimeSeconds.asInstanceOf[js.Any])
    if (PreSharedKey != null) __obj.updateDynamic("PreSharedKey")(PreSharedKey)
    if (RekeyFuzzPercentage != null) __obj.updateDynamic("RekeyFuzzPercentage")(RekeyFuzzPercentage.asInstanceOf[js.Any])
    if (RekeyMarginTimeSeconds != null) __obj.updateDynamic("RekeyMarginTimeSeconds")(RekeyMarginTimeSeconds.asInstanceOf[js.Any])
    if (ReplayWindowSize != null) __obj.updateDynamic("ReplayWindowSize")(ReplayWindowSize.asInstanceOf[js.Any])
    if (TunnelInsideCidr != null) __obj.updateDynamic("TunnelInsideCidr")(TunnelInsideCidr)
    __obj.asInstanceOf[ModifyVpnTunnelOptionsSpecification]
  }
}

