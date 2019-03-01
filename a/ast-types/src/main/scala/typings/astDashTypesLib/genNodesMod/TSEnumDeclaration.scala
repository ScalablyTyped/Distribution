package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSEnumDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var const: scala.Boolean
  var declare: scala.Boolean
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var initializer: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    const: scala.Boolean,
    declare: scala.Boolean,
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumDeclaration,
    initializer: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("const")(const)
    __obj.updateDynamic("declare")(declare)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("members")(members)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

