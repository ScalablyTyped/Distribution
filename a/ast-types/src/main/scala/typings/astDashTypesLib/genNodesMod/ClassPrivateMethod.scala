package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/nodes.Function[P]} */ trait ClassPrivateMethod
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.FunctionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var `abstract`: scala.Boolean | scala.Null
  var access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
  var accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var key: astDashTypesLib.genKindsMod.PrivateNameKind
  var kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
  var optional: scala.Boolean | scala.Null
  var static: scala.Boolean | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateMethod
}

object ClassPrivateMethod {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.PrivateNameKind,
    kind: astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor,
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateMethod,
    `abstract`: js.UndefOr[scala.Boolean] = js.undefined,
    access: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    static: js.UndefOr[scala.Boolean] = js.undefined
  ): ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body, computed = computed, key = key, kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[ClassPrivateMethod]
  }
}

