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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeAnnotation
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeAnnotation
  var typeAnnotation: FlowTypeKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeAnnotation")
@js.native
object TypeAnnotation extends TopLevel[Type[TypeAnnotation]]

