package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.PatternKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> ]: ast-types.ast-types/gen/nodes.Function[P]} */ trait ObjectMethod extends ASTNode {
  var accessibility: LiteralKind | Null
  var async: Boolean
  var body: BlockStatementKind
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var generator: Boolean
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: method | get | set
  var params: js.Array[PatternKind]
  var `type`: typings.astTypes.astTypesStrings.ObjectMethod
}

object ObjectMethod {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatementKind,
    computed: Boolean,
    generator: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ObjectMethod,
    accessibility: LiteralKind = null,
    decorators: js.Array[DecoratorKind] = null
  ): ObjectMethod = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMethod]
  }
}

