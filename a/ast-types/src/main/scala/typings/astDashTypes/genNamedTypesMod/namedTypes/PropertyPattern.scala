package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait PropertyPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var pattern: PatternKind
  var `type`: typings.astDashTypes.astDashTypesStrings.PropertyPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.PropertyPattern")
@js.native
object PropertyPattern extends TopLevel[Type[PropertyPattern]]

