package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rev extends js.Object {
  var rev: Double
  var value: String
}

object Rev {
  @scala.inline
  def apply(rev: Double, value: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
}

