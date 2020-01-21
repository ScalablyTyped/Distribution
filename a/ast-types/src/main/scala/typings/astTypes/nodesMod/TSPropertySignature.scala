package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSPropertySignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode {
  var computed: Boolean
  var initializer: ExpressionKind | Null
  var key: ExpressionKind
  var optional: Boolean
  var readonly: Boolean
  var `type`: typings.astTypes.astTypesStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    computed: Boolean,
    key: ExpressionKind,
    optional: Boolean,
    readonly: Boolean,
    `type`: typings.astTypes.astTypesStrings.TSPropertySignature,
    initializer: ExpressionKind = null,
    typeAnnotation: TSTypeAnnotationKind = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSPropertySignature]
  }
}

