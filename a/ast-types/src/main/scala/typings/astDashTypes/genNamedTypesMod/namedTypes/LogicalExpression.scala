package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.AmpersandAmpersand
import typings.astDashTypes.astDashTypesStrings.QuestionmarkQuestionmark
import typings.astDashTypes.astDashTypesStrings.VerticallineVerticalline
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait LogicalExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: ExpressionKind
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.LogicalExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.LogicalExpression")
@js.native
object LogicalExpression extends TopLevel[Type[LogicalExpression]]

