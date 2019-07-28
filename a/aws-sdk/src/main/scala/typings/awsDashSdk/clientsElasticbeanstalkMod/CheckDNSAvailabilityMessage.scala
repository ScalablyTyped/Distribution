package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckDNSAvailabilityMessage extends js.Object {
  /**
    * The prefix used when this CNAME is reserved.
    */
  var CNAMEPrefix: DNSCnamePrefix
}

object CheckDNSAvailabilityMessage {
  @scala.inline
  def apply(CNAMEPrefix: DNSCnamePrefix): CheckDNSAvailabilityMessage = {
    val __obj = js.Dynamic.literal(CNAMEPrefix = CNAMEPrefix)
  
    __obj.asInstanceOf[CheckDNSAvailabilityMessage]
  }
}

