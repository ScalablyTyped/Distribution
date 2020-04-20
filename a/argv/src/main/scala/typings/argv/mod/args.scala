package typings.argv.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait args extends js.Object {
  var options: StringDictionary[js.Any]
  var targets: js.Array[String]
}

object args {
  @scala.inline
  def apply(options: StringDictionary[js.Any], targets: js.Array[String]): args = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[args]
  }
}

