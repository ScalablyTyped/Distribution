package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeSpreadProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var argument: FlowTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeSpreadProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeSpreadProperty")
@js.native
object ObjectTypeSpreadProperty extends TopLevel[Type[ObjectTypeSpreadProperty]]

