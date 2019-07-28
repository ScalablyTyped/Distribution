package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsConfigChange extends js.Object {
  /**
    * An array that contains one DnsRecord object for each Route 53 record that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList
}

object DnsConfigChange {
  @scala.inline
  def apply(DnsRecords: DnsRecordList): DnsConfigChange = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords)
  
    __obj.asInstanceOf[DnsConfigChange]
  }
}

