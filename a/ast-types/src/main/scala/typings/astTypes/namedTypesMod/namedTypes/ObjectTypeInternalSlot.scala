package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeInternalSlot
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var id: IdentifierKind
  var method: Boolean
  var optional: Boolean
  var static: Boolean
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeInternalSlot
  var value: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeInternalSlot")
@js.native
object ObjectTypeInternalSlot extends TopLevel[Type[ObjectTypeInternalSlot]]

