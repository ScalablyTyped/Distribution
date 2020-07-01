package typings.amazonConnectStreams.global.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.Endpoint")
@js.native
class Endpoint ()
  extends typings.amazonConnectStreams.connect.Endpoint {
  /* CompleteClass */
  override val agentLogin: String = js.native
  /* CompleteClass */
  override val endpointARN: String = js.native
  /* CompleteClass */
  override val endpointId: String = js.native
  /* CompleteClass */
  override val name: String = js.native
  /* CompleteClass */
  override val phoneNumber: String = js.native
  /* CompleteClass */
  override val queue: String = js.native
  /* CompleteClass */
  override val `type`: typings.amazonConnectStreams.connect.EndpointType = js.native
}

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

