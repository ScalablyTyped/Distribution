package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ClassProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.ClassPropertyKind
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var computed: scala.Boolean
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var static: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassProperty
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
  var value: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
}

object ClassProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    static: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassProperty,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null,
    value: astDashTypesLib.genKindsMod.ExpressionKind = null,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key.asInstanceOf[js.Any], static = static)
    __obj.updateDynamic("type")(`type`)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty]
  }
}

