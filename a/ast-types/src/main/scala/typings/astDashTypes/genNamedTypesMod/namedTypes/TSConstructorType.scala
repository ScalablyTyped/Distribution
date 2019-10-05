package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeParametersKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSConstructorType
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeAnnotationKind
     with TSHasOptionalTypeParametersKind
     with TSTypeKind {
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSConstructorType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSConstructorType")
@js.native
object TSConstructorType extends TopLevel[Type[TSConstructorType]]

