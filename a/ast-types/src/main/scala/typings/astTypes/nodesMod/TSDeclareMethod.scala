package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.public
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NoopKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSDeclareMethod
  extends TSHasOptionalTypeParameters
     with ASTNode {
  var `abstract`: Boolean
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var generator: Boolean
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  var kind: get | set | method | constructor
  var optional: Boolean
  var params: js.Array[PatternKind]
  var returnType: TSTypeAnnotationKind | NoopKind | Null
  var static: Boolean
  var `type`: typings.astTypes.astTypesStrings.TSDeclareMethod
}

object TSDeclareMethod {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    kind: get | set | method | constructor,
    optional: Boolean,
    params: js.Array[PatternKind],
    static: Boolean,
    `type`: typings.astTypes.astTypesStrings.TSDeclareMethod,
    access: public | `private` | `protected` = null,
    accessibility: public | `private` | `protected` = null,
    decorators: js.Array[DecoratorKind] = null,
    returnType: TSTypeAnnotationKind | NoopKind = null,
    typeParameters: TSTypeParameterDeclarationKind = null
  ): TSDeclareMethod = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareMethod]
  }
}

