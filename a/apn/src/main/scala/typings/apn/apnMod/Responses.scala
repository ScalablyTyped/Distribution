package typings.apn.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responses extends js.Object {
  var failed: js.Array[ResponseFailure]
  var sent: js.Array[ResponseSent]
}

object Responses {
  @scala.inline
  def apply(failed: js.Array[ResponseFailure], sent: js.Array[ResponseSent]): Responses = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Responses]
  }
}

