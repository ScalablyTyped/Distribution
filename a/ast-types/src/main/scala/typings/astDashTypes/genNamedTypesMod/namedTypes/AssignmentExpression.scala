package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.AmpersandEqualssign
import typings.astDashTypes.astDashTypesStrings.AsteriskEqualssign
import typings.astDashTypes.astDashTypesStrings.Equalssign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.LessthansignLessthansignEqualssign
import typings.astDashTypes.astDashTypesStrings.PercentsignEqualssign
import typings.astDashTypes.astDashTypesStrings.PlussignEqualssign
import typings.astDashTypes.astDashTypesStrings.SlashEqualssign
import typings.astDashTypes.astDashTypesStrings.VerticallineEqualssign
import typings.astDashTypes.astDashTypesStrings.`-Equalssign`
import typings.astDashTypes.astDashTypesStrings.`^Equalssign`
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.MemberExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AssignmentExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: PatternKind | MemberExpressionKind
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.AssignmentExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
@js.native
object AssignmentExpression extends TopLevel[Type[AssignmentExpression]]

