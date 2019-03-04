package typings
package atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3FactoryMetadata because Already inherited */ trait R3ExpressionFactoryMetadata extends R3ConstructorFactoryMetadata {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3ExpressionFactoryMetadata {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    injectFn: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    name: java.lang.String,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[R3DependencyMetadata] = null
  ): R3ExpressionFactoryMetadata = {
    val __obj = js.Dynamic.literal(expression = expression, injectFn = injectFn, name = name)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3ExpressionFactoryMetadata]
  }
}

