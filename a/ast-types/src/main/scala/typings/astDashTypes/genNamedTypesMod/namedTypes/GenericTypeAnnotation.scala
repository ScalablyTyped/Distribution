package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FlowKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.QualifiedTypeIdentifierKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait GenericTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var id: IdentifierKind | QualifiedTypeIdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.GenericTypeAnnotation
  var typeParameters: TypeParameterInstantiationKind | Null
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.GenericTypeAnnotation")
@js.native
object GenericTypeAnnotation extends TopLevel[Type[GenericTypeAnnotation]]

