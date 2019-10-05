package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`private`
import typings.astDashTypes.astDashTypesStrings.`protected`
import typings.astDashTypes.astDashTypesStrings.public
import typings.astDashTypes.genKindsMod.AssignmentPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
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
  var `type`: typings.astDashTypes.astDashTypesStrings.TSParameterProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSParameterProperty")
@js.native
object TSParameterProperty extends TopLevel[Type[TSParameterProperty]]

