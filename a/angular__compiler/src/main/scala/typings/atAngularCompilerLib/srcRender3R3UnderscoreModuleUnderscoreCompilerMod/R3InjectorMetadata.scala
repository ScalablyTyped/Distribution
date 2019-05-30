package typings
package atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadata extends js.Object {
  var deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  var imports: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  var name: java.lang.String
  var providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3InjectorMetadata {
  @scala.inline
  def apply(
    imports: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    name: java.lang.String,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null,
    providers: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null
  ): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[R3InjectorMetadata]
  }
}

