package typings
package argvLib.argvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait args extends js.Object {
  var options: org.scalablytyped.runtime.StringDictionary[js.Any]
  var targets: js.Array[java.lang.String]
}

object args {
  @scala.inline
  def apply(options: org.scalablytyped.runtime.StringDictionary[js.Any], targets: js.Array[java.lang.String]): args = {
    val __obj = js.Dynamic.literal(options = options, targets = targets)
  
    __obj.asInstanceOf[args]
  }
}

