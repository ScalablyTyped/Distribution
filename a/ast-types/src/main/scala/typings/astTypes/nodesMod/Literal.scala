package typings.astTypes.nodesMod

import typings.astTypes.AnonFlags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait Literal extends ASTNode {
  var regex: AnonFlags | Null
  var `type`: typings.astTypes.astTypesStrings.Literal
  var value: String | Boolean | Null | Double | RegExp
}

object Literal {
  @scala.inline
  def apply(
    `type`: typings.astTypes.astTypesStrings.Literal,
    regex: AnonFlags = null,
    value: String | Boolean | Double | RegExp = null
  ): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

