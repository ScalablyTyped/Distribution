package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeSpreadProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var argument: FlowTypeKind
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeSpreadProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeSpreadProperty")
@js.native
object ObjectTypeSpreadProperty extends TopLevel[Type[ObjectTypeSpreadProperty]]

