package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.BooleanLiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.NumericLiteralKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genKindsMod.TemplateLiteralKind
import typings.astDashTypes.genKindsMod.UnaryExpressionKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSLiteralType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSLiteralType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSLiteralType")
@js.native
object TSLiteralType extends TopLevel[Type[TSLiteralType]]

