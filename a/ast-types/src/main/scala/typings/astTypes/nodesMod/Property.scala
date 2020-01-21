package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.init
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
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
  var `type`: typings.astTypes.astTypesStrings.Property
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
    `type`: typings.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind,
    decorators: js.Array[DecoratorKind] = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

