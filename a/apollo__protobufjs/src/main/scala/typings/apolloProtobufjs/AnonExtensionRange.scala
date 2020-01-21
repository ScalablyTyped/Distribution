package typings.apolloProtobufjs

import typings.apolloProtobufjs.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtensionRange extends js.Object {
  var ExtensionRange: Type
  var ReservedRange: Type
}

object AnonExtensionRange {
  @scala.inline
  def apply(ExtensionRange: Type, ReservedRange: Type): AnonExtensionRange = {
    val __obj = js.Dynamic.literal(ExtensionRange = ExtensionRange.asInstanceOf[js.Any], ReservedRange = ReservedRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtensionRange]
  }
}

