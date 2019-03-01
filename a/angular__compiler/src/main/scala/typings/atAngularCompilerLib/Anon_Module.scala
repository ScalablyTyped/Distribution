package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Module extends js.Object {
  var module: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
  var provider: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
}

object Anon_Module {
  @scala.inline
  def apply(
    module: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata,
    provider: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
  ): Anon_Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[Anon_Module]
  }
}

