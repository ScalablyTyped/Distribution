package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainSummary extends js.Object {
  /**
    * Indicates whether the domain is automatically renewed upon expiration.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain that the summary information applies to.
    */
  var DomainName: awsDashSdkLib.clientsRoute53domainsMod.DomainName
  /**
    * Expiration date of the domain in Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[Timestamp] = js.undefined
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.undefined
}

object DomainSummary {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AutoRenew: js.UndefOr[Boolean] = js.undefined,
    Expiry: Timestamp = null,
    TransferLock: js.UndefOr[Boolean] = js.undefined
  ): DomainSummary = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(AutoRenew)) __obj.updateDynamic("AutoRenew")(AutoRenew)
    if (Expiry != null) __obj.updateDynamic("Expiry")(Expiry)
    if (!js.isUndefined(TransferLock)) __obj.updateDynamic("TransferLock")(TransferLock)
    __obj.asInstanceOf[DomainSummary]
  }
}

