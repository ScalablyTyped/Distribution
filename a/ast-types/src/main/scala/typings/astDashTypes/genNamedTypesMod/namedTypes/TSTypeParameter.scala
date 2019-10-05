package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Identifier[P]} */ trait TSTypeParameter
  extends ASTNode
     with ExpressionKind
     with IdentifierKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var constraint: js.UndefOr[TSTypeKind] = js.undefined
  var default: js.UndefOr[TSTypeKind] = js.undefined
  var name: String
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeParameter
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeParameter")
@js.native
object TSTypeParameter extends TopLevel[Type[TSTypeParameter]]

