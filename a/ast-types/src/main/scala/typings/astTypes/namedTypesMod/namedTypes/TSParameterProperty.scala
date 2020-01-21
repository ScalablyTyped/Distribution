package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.public
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSParameterProperty
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var parameter: IdentifierKind | AssignmentPatternKind
  var readonly: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.TSParameterProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSParameterProperty")
@js.native
object TSParameterProperty extends TopLevel[Type[TSParameterProperty]]

