package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSThisTypeKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation[P]} */ trait TSTypePredicate
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind {
  var parameterName: IdentifierKind | TSThisTypeKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypePredicate
  var typeAnnotation: TSTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypePredicate")
@js.native
object TSTypePredicate extends TopLevel[Type[TSTypePredicate]]

