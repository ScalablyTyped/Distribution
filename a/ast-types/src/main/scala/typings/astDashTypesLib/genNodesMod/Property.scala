package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Property
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var method: scala.Boolean
  var shorthand: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.Property
  var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
}

object Property {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set,
    method: scala.Boolean,
    shorthand: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.Property,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed, key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method, shorthand = shorthand, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    __obj.asInstanceOf[Property]
  }
}

