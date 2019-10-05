package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeAnnotationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSPropertySignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeAnnotationKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var key: ExpressionKind
  var optional: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.TSPropertySignature
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSPropertySignature")
@js.native
object TSPropertySignature extends TopLevel[Type[TSPropertySignature]]

