package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSNonNullExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var expression: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSNonNullExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSNonNullExpression")
@js.native
object TSNonNullExpression extends TopLevel[Type[TSNonNullExpression]]

