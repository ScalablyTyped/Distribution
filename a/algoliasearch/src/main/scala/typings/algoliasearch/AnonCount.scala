package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: Double
  var highlighted: String
  var value: String
}

object AnonCount {
  @scala.inline
  def apply(count: Double, highlighted: String, value: String): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

