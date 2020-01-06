package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckDNSAvailabilityResultMessage extends js.Object {
  /**
    * Indicates if the specified CNAME is available:    true : The CNAME is available.    false : The CNAME is not available.  
    */
  var Available: js.UndefOr[CnameAvailability] = js.native
  /**
    * The fully qualified CNAME to reserve when CreateEnvironment is called with the provided prefix.
    */
  var FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.native
}

object CheckDNSAvailabilityResultMessage {
  @scala.inline
  def apply(Available: js.UndefOr[Boolean] = js.undefined, FullyQualifiedCNAME: DNSCname = null): CheckDNSAvailabilityResultMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Available)) __obj.updateDynamic("Available")(Available.asInstanceOf[js.Any])
    if (FullyQualifiedCNAME != null) __obj.updateDynamic("FullyQualifiedCNAME")(FullyQualifiedCNAME.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
  }
}

