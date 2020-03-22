package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3InjectorMetadata extends js.Object {
  var deps: js.Array[R3DependencyMetadata] | Null
  var imports: js.Array[Expression]
  var internalType: Expression
  var name: String
  var providers: Expression | Null
  var `type`: R3Reference
}

object R3InjectorMetadata {
  @scala.inline
  def apply(
    imports: js.Array[Expression],
    internalType: Expression,
    name: String,
    `type`: R3Reference,
    deps: js.Array[R3DependencyMetadata] = null,
    providers: Expression = null
  ): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadata]
  }
}

