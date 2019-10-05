package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Decorator
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var expression: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.Decorator
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Decorator")
@js.native
object Decorator extends TopLevel[Type[Decorator]]

