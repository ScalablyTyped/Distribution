package typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadata extends js.Object {
  var deps: js.Array[R3DependencyMetadata] | Null
  var imports: js.Array[Expression]
  var name: String
  var providers: Expression | Null
  var `type`: Expression
}

object R3InjectorMetadata {
  @scala.inline
  def apply(
    imports: js.Array[Expression],
    name: String,
    `type`: Expression,
    deps: js.Array[R3DependencyMetadata] = null,
    providers: Expression = null
  ): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[R3InjectorMetadata]
  }
}

