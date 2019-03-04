package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait MetaProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var meta: astDashTypesLib.genKindsMod.IdentifierKind
  var property: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    meta: astDashTypesLib.genKindsMod.IdentifierKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.MetaProperty
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta, property = property)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetaProperty]
  }
}

