package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> ]: ast-types.ast-types/gen/nodes.Function[P]} */ trait ObjectMethod
  extends ASTNode
     with astDashTypesLib.genKindsMod.FunctionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var accessibility: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var async: scala.Boolean
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var generator: scala.Boolean
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectMethod
}

object ObjectMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    computed: scala.Boolean,
    generator: scala.Boolean,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectMethod,
    accessibility: astDashTypesLib.genKindsMod.LiteralKind = null,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null
  ): ObjectMethod = {
    val __obj = js.Dynamic.literal(async = async, body = body, computed = computed, generator = generator, key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    __obj.asInstanceOf[ObjectMethod]
  }
}

