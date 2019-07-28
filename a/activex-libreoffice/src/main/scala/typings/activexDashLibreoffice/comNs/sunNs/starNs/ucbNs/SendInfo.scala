package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

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
  var ProtocolType: String
  /** the value. */
  var Value: String
}

object SendInfo {
  @scala.inline
  def apply(ProtocolType: String, Value: String): SendInfo = {
    val __obj = js.Dynamic.literal(ProtocolType = ProtocolType, Value = Value)
  
    __obj.asInstanceOf[SendInfo]
  }
}

