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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SpreadElement
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.SpreadElement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SpreadElement")
@js.native
object SpreadElement extends TopLevel[Type[SpreadElement]]

