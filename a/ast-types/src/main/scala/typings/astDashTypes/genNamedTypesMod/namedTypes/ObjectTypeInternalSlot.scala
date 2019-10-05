package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
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
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeInternalSlot
  var value: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeInternalSlot")
@js.native
object ObjectTypeInternalSlot extends TopLevel[Type[ObjectTypeInternalSlot]]

