package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ComprehensionBlockKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait GeneratorExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var filter: ExpressionKind | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.GeneratorExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.GeneratorExpression")
@js.native
object GeneratorExpression extends TopLevel[Type[GeneratorExpression]]

