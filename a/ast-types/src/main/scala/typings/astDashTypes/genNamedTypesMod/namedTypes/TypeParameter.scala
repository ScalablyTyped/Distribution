package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.genKindsMod.FlowKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.VarianceKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait TypeParameter
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var bound: js.UndefOr[TypeAnnotationKind | Null] = js.undefined
  var name: String
  var `type`: typings.astDashTypes.astDashTypesStrings.TypeParameter
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TypeParameter")
@js.native
object TypeParameter extends TopLevel[Type[TypeParameter]]

