package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.body
import typings.angularCore.angularCoreStrings.component
import typings.angularCore.angularCoreStrings.document
import typings.angularCore.angularCoreStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: String
  var propName: String | Null
  var target: window | document | body | component | Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: String,
    `type`: OutputType,
    propName: String = null,
    target: window | document | body | component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

