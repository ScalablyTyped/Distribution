package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains information related to a send protocol.
  *
  * It can contain any string values (server names, user names, passwords, ...).
  */
trait SendInfo extends js.Object {
  /** the protocol to which the info is related (i.e. "NNTP", "SMTP", "VIM"). */
  var ProtocolType: java.lang.String
  /** the value. */
  var Value: java.lang.String
}

object SendInfo {
  @scala.inline
  def apply(ProtocolType: java.lang.String, Value: java.lang.String): SendInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ProtocolType")(ProtocolType)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[SendInfo]
  }
}

