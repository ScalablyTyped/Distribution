package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.public
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/nodes.Function[P]} */ trait ClassMethod extends ASTNode {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var body: BlockStatementKind
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var static: Boolean | Null
  var `type`: typings.astTypes.astTypesStrings.ClassMethod
}

object ClassMethod {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: get | set | method | constructor,
    `type`: typings.astTypes.astTypesStrings.ClassMethod,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[DecoratorKind] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    static: js.UndefOr[Boolean] = js.undefined
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMethod]
  }
}

