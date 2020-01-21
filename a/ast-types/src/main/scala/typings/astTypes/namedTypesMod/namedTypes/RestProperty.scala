package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait RestProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var argument: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.RestProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.RestProperty")
@js.native
object RestProperty extends TopLevel[Type[RestProperty]]

