package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var pure: Boolean
  var `type`: CompileTypeMetadata
}

object AnonName {
  @scala.inline
  def apply(name: String, pure: Boolean, `type`: CompileTypeMetadata): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

