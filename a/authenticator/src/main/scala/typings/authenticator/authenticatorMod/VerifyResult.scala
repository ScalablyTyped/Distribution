package typings.authenticator.authenticatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var delta: Double
}

object VerifyResult {
  @scala.inline
  def apply(delta: Double): VerifyResult = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyResult]
  }
}

