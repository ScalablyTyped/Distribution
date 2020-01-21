package typings.astTypes.nodesMod

import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait TypeParameter extends ASTNode {
  var bound: TypeAnnotationKind | Null
  var name: String
  var `type`: typings.astTypes.astTypesStrings.TypeParameter
  var variance: VarianceKind | plus | minus | Null
}

object TypeParameter {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.astTypes.astTypesStrings.TypeParameter,
    bound: TypeAnnotationKind = null,
    variance: VarianceKind | plus | minus = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bound != null) __obj.updateDynamic("bound")(bound.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

