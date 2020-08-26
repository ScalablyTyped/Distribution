package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.Endpoint")
@js.native
class Endpoint ()
  extends typings.amazonConnectStreams.connect.Endpoint

/* static members */
@JSGlobal("connect.Endpoint")
@js.native
object Endpoint extends js.Object {
  /**
    * Creates an endpoint from a E.164 phone number.
    *
    * @param phoneNumber The E.164 endpoint phone number.
    */
  def byPhoneNumber(phoneNumber: String): typings.amazonConnectStreams.connect.Endpoint = js.native
}

