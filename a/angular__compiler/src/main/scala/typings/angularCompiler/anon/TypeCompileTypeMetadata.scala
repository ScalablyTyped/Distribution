package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeCompileTypeMetadata extends js.Object {
  var `type`: CompileTypeMetadata
}

object TypeCompileTypeMetadata {
  @scala.inline
  def apply(`type`: CompileTypeMetadata): TypeCompileTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCompileTypeMetadata]
  }
}

