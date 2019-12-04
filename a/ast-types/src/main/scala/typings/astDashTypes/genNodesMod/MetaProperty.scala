package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.IdentifierKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait MetaProperty extends ASTNode {
  var meta: IdentifierKind
  var property: IdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typings.astDashTypes.astDashTypesStrings.MetaProperty
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty]
  }
}

