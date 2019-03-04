package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait PropertyPattern
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var computed: scala.Boolean
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var pattern: astDashTypesLib.genKindsMod.PatternKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.PropertyPattern
}

object PropertyPattern {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    pattern: astDashTypesLib.genKindsMod.PatternKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.PropertyPattern
  ): PropertyPattern = {
    val __obj = js.Dynamic.literal(computed = computed, key = key.asInstanceOf[js.Any], pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PropertyPattern]
  }
}

