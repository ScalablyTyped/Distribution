package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHandshakeResponse extends js.Object {
  /**
    * A structure that contains information about the specified handshake.
    */
  var Handshake: js.UndefOr[Handshake] = js.undefined
}

object DescribeHandshakeResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): DescribeHandshakeResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[DescribeHandshakeResponse]
  }
}

