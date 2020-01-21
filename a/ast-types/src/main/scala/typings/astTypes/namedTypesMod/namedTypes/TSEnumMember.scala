package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSEnumMember
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var id: IdentifierKind | StringLiteralKind
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.TSEnumMember
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSEnumMember")
@js.native
object TSEnumMember extends TopLevel[Type[TSEnumMember]]

