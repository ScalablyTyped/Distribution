package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSTypeAnnotation
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSTypeAnnotation
  var typeAnnotation: TSTypeKind | TSTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeAnnotation")
@js.native
object TSTypeAnnotation extends TopLevel[Type[TSTypeAnnotation]]

