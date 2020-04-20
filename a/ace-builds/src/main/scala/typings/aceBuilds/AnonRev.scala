package typings.aceBuilds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRev extends js.Object {
  var rev: Double
  var value: String
}

object AnonRev {
  @scala.inline
  def apply(rev: Double, value: String): AnonRev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRev]
  }
}

