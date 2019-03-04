package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var pure: scala.Boolean
  var `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
}

object Anon_Name {
  @scala.inline
  def apply(
    name: java.lang.String,
    pure: scala.Boolean,
    `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
  ): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, pure = pure)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Name]
  }
}

