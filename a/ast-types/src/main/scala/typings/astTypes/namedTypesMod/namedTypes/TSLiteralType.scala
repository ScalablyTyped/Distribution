package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.BooleanLiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.kindsMod.UnaryExpressionKind
import typings.astTypes.typesMod.Type
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
  var `type`: typings.astTypes.astTypesStrings.TSLiteralType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSLiteralType")
@js.native
object TSLiteralType extends TopLevel[Type[TSLiteralType]]

