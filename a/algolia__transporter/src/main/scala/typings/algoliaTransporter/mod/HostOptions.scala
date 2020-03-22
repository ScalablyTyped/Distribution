package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostOptions extends js.Object {
  /**
    * The type of host. Defaults to `Any`.
    */
  val accept: js.UndefOr[CallType] = js.undefined
  /**
    * The protocol. Defaults to `https`.
    */
  val protocol: js.UndefOr[String] = js.undefined
  /**
    * The url of the server, without the protocol.
    */
  val url: String
}

object HostOptions {
  @scala.inline
  def apply(url: String, accept: CallType = null, protocol: String = null): HostOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostOptions]
  }
}

