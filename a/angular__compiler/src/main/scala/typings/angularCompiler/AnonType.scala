package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: CompileIdentifierMetadata
}

object AnonType {
  @scala.inline
  def apply(`type`: CompileIdentifierMetadata): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

