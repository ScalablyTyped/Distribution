package typings.amazonConnectStreams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expiry extends js.Object {
  val expiry: String
  val participantToken: String
}

object Expiry {
  @scala.inline
  def apply(expiry: String, participantToken: String): Expiry = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], participantToken = participantToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiry]
  }
}

