package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDef extends js.Object {
  var eventName: java.lang.String
  var propName: java.lang.String | scala.Null
  var target: atAngularCoreLib.atAngularCoreLibStrings.window | atAngularCoreLib.atAngularCoreLibStrings.document | atAngularCoreLib.atAngularCoreLibStrings.body | atAngularCoreLib.atAngularCoreLibStrings.component | scala.Null
  var `type`: OutputType
}

object OutputDef {
  @scala.inline
  def apply(
    eventName: java.lang.String,
    `type`: OutputType,
    propName: java.lang.String = null,
    target: atAngularCoreLib.atAngularCoreLibStrings.window | atAngularCoreLib.atAngularCoreLibStrings.document | atAngularCoreLib.atAngularCoreLibStrings.body | atAngularCoreLib.atAngularCoreLibStrings.component = null
  ): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName)
    __obj.updateDynamic("type")(`type`)
    if (propName != null) __obj.updateDynamic("propName")(propName)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
}

