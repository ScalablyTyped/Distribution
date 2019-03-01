package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentArgument extends js.Object {
  /** Name of the argument. */
  var name: java.lang.String
  /** Text value of the argument. */
  var textValue: java.lang.String
}

object IntentArgument {
  @scala.inline
  def apply(name: java.lang.String, textValue: java.lang.String): IntentArgument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("textValue")(textValue)
    __obj.asInstanceOf[IntentArgument]
  }
}

