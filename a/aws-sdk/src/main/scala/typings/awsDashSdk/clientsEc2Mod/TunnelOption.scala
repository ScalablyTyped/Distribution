package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TunnelOption extends js.Object {
  /**
    * The number of seconds after which a DPD timeout occurs.
    */
  var DpdTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The IKE versions that are permitted for the VPN tunnel.
    */
  var IkeVersions: js.UndefOr[IKEVersionsList] = js.undefined
  /**
    * The external IP address of the VPN tunnel.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.undefined
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersList] = js.undefined
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsList] = js.undefined
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 1 IKE negotiations.
    */
  var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsList] = js.undefined
  /**
    * The lifetime for phase 1 of the IKE negotiation, in seconds.
    */
  var Phase1LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The permitted Diffie-Hellman group numbers for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersList] = js.undefined
  /**
    * The permitted encryption algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsList] = js.undefined
  /**
    * The permitted integrity algorithms for the VPN tunnel for phase 2 IKE negotiations.
    */
  var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsList] = js.undefined
  /**
    * The lifetime for phase 2 of the IKE negotiation, in seconds.
    */
  var Phase2LifetimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and the customer gateway.
    */
  var PreSharedKey: js.UndefOr[String] = js.undefined
  /**
    * The percentage of the rekey window determined by RekeyMarginTimeSeconds during which the rekey time is randomly selected.
    */
  var RekeyFuzzPercentage: js.UndefOr[Integer] = js.undefined
  /**
    * The margin time, in seconds, before the phase 2 lifetime expires, during which the AWS side of the VPN connection performs an IKE rekey.
    */
  var RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.undefined
  /**
    * The number of packets in an IKE replay window.
    */
  var ReplayWindowSize: js.UndefOr[Integer] = js.undefined
  /**
    * The range of inside IP addresses for the tunnel.
    */
  var TunnelInsideCidr: js.UndefOr[String] = js.undefined
}

object TunnelOption {
  @scala.inline
  def apply(
    DpdTimeoutSeconds: js.UndefOr[Integer] = js.undefined,
    IkeVersions: IKEVersionsList = null,
    OutsideIpAddress: String = null,
    Phase1DHGroupNumbers: Phase1DHGroupNumbersList = null,
    Phase1EncryptionAlgorithms: Phase1EncryptionAlgorithmsList = null,
    Phase1IntegrityAlgorithms: Phase1IntegrityAlgorithmsList = null,
    Phase1LifetimeSeconds: js.UndefOr[Integer] = js.undefined,
    Phase2DHGroupNumbers: Phase2DHGroupNumbersList = null,
    Phase2EncryptionAlgorithms: Phase2EncryptionAlgorithmsList = null,
    Phase2IntegrityAlgorithms: Phase2IntegrityAlgorithmsList = null,
    Phase2LifetimeSeconds: js.UndefOr[Integer] = js.undefined,
    PreSharedKey: String = null,
    RekeyFuzzPercentage: js.UndefOr[Integer] = js.undefined,
    RekeyMarginTimeSeconds: js.UndefOr[Integer] = js.undefined,
    ReplayWindowSize: js.UndefOr[Integer] = js.undefined,
    TunnelInsideCidr: String = null
  ): TunnelOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DpdTimeoutSeconds)) __obj.updateDynamic("DpdTimeoutSeconds")(DpdTimeoutSeconds)
    if (IkeVersions != null) __obj.updateDynamic("IkeVersions")(IkeVersions)
    if (OutsideIpAddress != null) __obj.updateDynamic("OutsideIpAddress")(OutsideIpAddress)
    if (Phase1DHGroupNumbers != null) __obj.updateDynamic("Phase1DHGroupNumbers")(Phase1DHGroupNumbers)
    if (Phase1EncryptionAlgorithms != null) __obj.updateDynamic("Phase1EncryptionAlgorithms")(Phase1EncryptionAlgorithms)
    if (Phase1IntegrityAlgorithms != null) __obj.updateDynamic("Phase1IntegrityAlgorithms")(Phase1IntegrityAlgorithms)
    if (!js.isUndefined(Phase1LifetimeSeconds)) __obj.updateDynamic("Phase1LifetimeSeconds")(Phase1LifetimeSeconds)
    if (Phase2DHGroupNumbers != null) __obj.updateDynamic("Phase2DHGroupNumbers")(Phase2DHGroupNumbers)
    if (Phase2EncryptionAlgorithms != null) __obj.updateDynamic("Phase2EncryptionAlgorithms")(Phase2EncryptionAlgorithms)
    if (Phase2IntegrityAlgorithms != null) __obj.updateDynamic("Phase2IntegrityAlgorithms")(Phase2IntegrityAlgorithms)
    if (!js.isUndefined(Phase2LifetimeSeconds)) __obj.updateDynamic("Phase2LifetimeSeconds")(Phase2LifetimeSeconds)
    if (PreSharedKey != null) __obj.updateDynamic("PreSharedKey")(PreSharedKey)
    if (!js.isUndefined(RekeyFuzzPercentage)) __obj.updateDynamic("RekeyFuzzPercentage")(RekeyFuzzPercentage)
    if (!js.isUndefined(RekeyMarginTimeSeconds)) __obj.updateDynamic("RekeyMarginTimeSeconds")(RekeyMarginTimeSeconds)
    if (!js.isUndefined(ReplayWindowSize)) __obj.updateDynamic("ReplayWindowSize")(ReplayWindowSize)
    if (TunnelInsideCidr != null) __obj.updateDynamic("TunnelInsideCidr")(TunnelInsideCidr)
    __obj.asInstanceOf[TunnelOption]
  }
}

