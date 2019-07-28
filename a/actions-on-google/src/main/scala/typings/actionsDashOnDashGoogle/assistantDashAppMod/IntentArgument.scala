package typings.actionsDashOnDashGoogle.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentArgument extends js.Object {
  /** Name of the argument. */
  var name: String
  /** Text value of the argument. */
  var textValue: String
}

object IntentArgument {
  @scala.inline
  def apply(name: String, textValue: String): IntentArgument = {
    val __obj = js.Dynamic.literal(name = name, textValue = textValue)
  
    __obj.asInstanceOf[IntentArgument]
  }
}

