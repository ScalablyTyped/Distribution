package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeCompileTypeMetadata extends js.Object {
  var `type`: CompileTypeMetadata
}

object AnonTypeCompileTypeMetadata {
  @scala.inline
  def apply(`type`: CompileTypeMetadata): AnonTypeCompileTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeCompileTypeMetadata]
  }
}

