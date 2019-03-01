package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait MethodDefinition
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.constructor | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var static: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.MethodDefinition
  var value: astDashTypesLib.genKindsMod.FunctionKind
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.constructor | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set,
    static: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.MethodDefinition,
    value: astDashTypesLib.genKindsMod.FunctionKind,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("static")(static)
    __obj.updateDynamic("value")(value)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    __obj.asInstanceOf[MethodDefinition]
  }
}

