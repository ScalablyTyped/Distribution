package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectProperty extends ASTNode {
  var accessibility: LiteralKind | Null
  var computed: Boolean
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var shorthand: Boolean
  var `type`: typings.astTypes.astTypesStrings.ObjectProperty
  var value: ExpressionKind | PatternKind
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    shorthand: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectProperty,
    value: ExpressionKind | PatternKind,
    accessibility: LiteralKind = null
  ): ObjectProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectProperty]
  }
}

