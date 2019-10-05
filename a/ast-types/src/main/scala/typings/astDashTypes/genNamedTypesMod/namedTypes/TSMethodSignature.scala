package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeParametersKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSMethodSignature
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeAnnotationKind
     with TSHasOptionalTypeParametersKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: ExpressionKind
  var optional: js.UndefOr[Boolean] = js.undefined
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.TSMethodSignature
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSMethodSignature")
@js.native
object TSMethodSignature extends TopLevel[Type[TSMethodSignature]]

