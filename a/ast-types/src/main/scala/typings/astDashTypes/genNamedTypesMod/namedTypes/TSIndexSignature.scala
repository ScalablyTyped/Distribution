package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSIndexSignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeAnnotationKind {
  var parameters: js.Array[IdentifierKind]
  var readonly: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.TSIndexSignature
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSIndexSignature")
@js.native
object TSIndexSignature extends TopLevel[Type[TSIndexSignature]]

