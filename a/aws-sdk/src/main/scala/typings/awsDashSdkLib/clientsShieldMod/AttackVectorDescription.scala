package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttackVectorDescription extends js.Object {
  /**
    * The attack type. Valid values:   UDP_TRAFFIC   UDP_FRAGMENT   GENERIC_UDP_REFLECTION   DNS_REFLECTION   NTP_REFLECTION   CHARGEN_REFLECTION   SSDP_REFLECTION   PORT_MAPPER   RIP_REFLECTION   SNMP_REFLECTION   MSSQL_REFLECTION   NET_BIOS_REFLECTION   SYN_FLOOD   ACK_FLOOD   REQUEST_FLOOD  
    */
  var VectorType: String
}

object AttackVectorDescription {
  @scala.inline
  def apply(VectorType: String): AttackVectorDescription = {
    val __obj = js.Dynamic.literal(VectorType = VectorType)
  
    __obj.asInstanceOf[AttackVectorDescription]
  }
}

