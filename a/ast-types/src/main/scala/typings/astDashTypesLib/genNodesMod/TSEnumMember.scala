package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSEnumMember
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind
  var initializer: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumMember,
    initializer: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    __obj.asInstanceOf[TSEnumMember]
  }
}

