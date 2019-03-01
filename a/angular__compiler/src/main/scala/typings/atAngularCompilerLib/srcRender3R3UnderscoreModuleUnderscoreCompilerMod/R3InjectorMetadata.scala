package typings
package atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadata extends js.Object {
  var deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  var imports: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var name: java.lang.String
  var providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3InjectorMetadata {
  @scala.inline
  def apply(
    imports: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    name: java.lang.String,
    providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null
  ): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("imports")(imports)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("providers")(providers)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3InjectorMetadata]
  }
}

