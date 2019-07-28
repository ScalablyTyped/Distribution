package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreStrings.body
import typings.atAngularCore.atAngularCoreStrings.component
import typings.atAngularCore.atAngularCoreStrings.document
import typings.atAngularCore.atAngularCoreStrings.window
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
    val __obj = js.Dynamic.literal(eventName = eventName)
    __obj.updateDynamic("type")(`type`)
    if (propName != null) __obj.updateDynamic("propName")(propName)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

