package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSPropertySignature
  extends TSHasOptionalTypeAnnotation
     with ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind {
  var computed: scala.Boolean
  var initializer: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var optional: scala.Boolean
  var readonly: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSPropertySignature
}

object TSPropertySignature {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    optional: scala.Boolean,
    readonly: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSPropertySignature,
    initializer: astDashTypesLib.genKindsMod.ExpressionKind = null,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): TSPropertySignature = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, optional = optional, readonly = readonly)
    __obj.updateDynamic("type")(`type`)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSPropertySignature]
  }
}

