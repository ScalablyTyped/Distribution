package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSModuleDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind | scala.Null
  var declare: scala.Boolean
  var global: scala.Boolean
  var id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleDeclaration
}

object TSModuleDeclaration {
  @scala.inline
  def apply(
    declare: scala.Boolean,
    global: scala.Boolean,
    id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleDeclaration,
    body: astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind = null
  ): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("declare")(declare)
    __obj.updateDynamic("global")(global)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration]
  }
}

