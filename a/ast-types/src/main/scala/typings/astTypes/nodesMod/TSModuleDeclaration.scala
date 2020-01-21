package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSModuleBlockKind
import typings.astTypes.kindsMod.TSModuleDeclarationKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSModuleDeclaration extends ASTNode {
  var body: TSModuleBlockKind | TSModuleDeclarationKind | Null
  var declare: Boolean
  var global: Boolean
  var id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astTypes.astTypesStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    declare: Boolean,
    global: Boolean,
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSModuleDeclaration,
    body: TSModuleBlockKind | TSModuleDeclarationKind = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

