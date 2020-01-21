package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PrivateNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ClassProperty, 'type' | 'key' | 'value'> ]: ast-types.ast-types/gen/nodes.ClassProperty[P]} */ trait ClassPrivateProperty extends ASTNode {
  var key: PrivateNameKind
  var `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty
  var value: ExpressionKind | Null
}

object ClassPrivateProperty {
  @scala.inline
  def apply(
    key: PrivateNameKind,
    `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty,
    value: ExpressionKind = null
  ): ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateProperty]
  }
}

