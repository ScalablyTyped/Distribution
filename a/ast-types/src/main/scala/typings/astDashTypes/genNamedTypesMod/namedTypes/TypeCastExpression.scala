package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TypeCastExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var expression: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeCastExpression
  var typeAnnotation: TypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeCastExpression")
@js.native
object TypeCastExpression extends TopLevel[Type[TypeCastExpression]]

