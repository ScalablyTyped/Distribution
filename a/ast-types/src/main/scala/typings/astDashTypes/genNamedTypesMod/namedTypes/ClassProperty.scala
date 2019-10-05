package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`private`
import typings.astDashTypes.astDashTypesStrings.`protected`
import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.astDashTypesStrings.public
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import typings.astDashTypes.genKindsMod.VarianceKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassProperty
  extends ASTNode
     with ClassPropertyKind
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassProperty
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var value: ExpressionKind | Null
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassProperty")
@js.native
object ClassProperty extends TopLevel[Type[ClassProperty]]

