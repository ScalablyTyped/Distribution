package typings.astDashTypes.genNodesMod

import typings.astDashTypes.astDashTypesStrings.constructor
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FunctionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait MethodDefinition extends ASTNode {
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var key: ExpressionKind
  var kind: constructor | method | get | set
  var static: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.MethodDefinition
  var value: FunctionKind
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: Boolean,
    key: ExpressionKind,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.MethodDefinition,
    value: FunctionKind,
    decorators: js.Array[DecoratorKind] = null
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
}

