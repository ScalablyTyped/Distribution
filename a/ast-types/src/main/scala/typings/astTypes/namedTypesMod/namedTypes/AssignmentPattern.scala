package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait AssignmentPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var left: PatternKind
  var right: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.AssignmentPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentPattern")
@js.native
object AssignmentPattern extends TopLevel[Type[AssignmentPattern]]

