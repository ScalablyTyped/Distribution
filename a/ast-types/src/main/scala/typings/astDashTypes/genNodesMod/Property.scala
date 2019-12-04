package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.init
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Property extends ASTNode {
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: init | get | set
  var method: Boolean
  var shorthand: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.Property
  var value: ExpressionKind | PatternKind
}

object Property {
  @scala.inline
  def apply(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.Property,
    value: ExpressionKind | PatternKind,
    decorators: js.Array[DecoratorKind] = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

