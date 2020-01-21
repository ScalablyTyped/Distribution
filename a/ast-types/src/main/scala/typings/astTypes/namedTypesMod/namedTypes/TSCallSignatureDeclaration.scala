package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TSHasOptionalTypeAnnotationKind
import typings.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSCallSignatureDeclaration
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeAnnotationKind
     with TSHasOptionalTypeParametersKind {
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typings.astTypes.astTypesStrings.TSCallSignatureDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSCallSignatureDeclaration")
@js.native
object TSCallSignatureDeclaration extends TopLevel[Type[TSCallSignatureDeclaration]]

