package typings.argparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: Boolean
}

object AnonRequired {
  @scala.inline
  def apply(required: Boolean): AnonRequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequired]
  }
}

