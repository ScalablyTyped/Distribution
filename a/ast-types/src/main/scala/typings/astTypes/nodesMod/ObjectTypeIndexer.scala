package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeIndexer extends ASTNode {
  var id: IdentifierKind
  var key: FlowTypeKind
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeIndexer
  var value: FlowTypeKind
  var variance: VarianceKind | plus | minus | Null
}

object ObjectTypeIndexer {
  @scala.inline
  def apply(
    id: IdentifierKind,
    key: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeIndexer,
    value: FlowTypeKind,
    variance: VarianceKind | plus | minus = null
  ): ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

