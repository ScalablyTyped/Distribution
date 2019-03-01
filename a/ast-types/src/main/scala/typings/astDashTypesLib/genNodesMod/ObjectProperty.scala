package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var accessibility: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var computed: scala.Boolean
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var shorthand: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectProperty
  var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    shorthand: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectProperty,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind,
    accessibility: astDashTypesLib.genKindsMod.LiteralKind = null
  ): ObjectProperty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("shorthand")(shorthand)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    __obj.asInstanceOf[ObjectProperty]
  }
}

