package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrayExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]
  var `type`: typings.astDashTypes.astDashTypesStrings.ArrayExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ArrayExpression")
@js.native
object ArrayExpression extends TopLevel[Type[ArrayExpression]]

