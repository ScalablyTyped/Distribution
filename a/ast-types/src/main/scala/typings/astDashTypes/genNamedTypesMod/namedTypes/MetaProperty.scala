package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MetaProperty
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var meta: IdentifierKind
  var property: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.MetaProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.MetaProperty")
@js.native
object MetaProperty extends TopLevel[Type[MetaProperty]]

