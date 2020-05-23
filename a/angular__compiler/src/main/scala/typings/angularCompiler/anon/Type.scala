package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: CompileIdentifierMetadata
}

object Type {
  @scala.inline
  def apply(`type`: CompileIdentifierMetadata): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

