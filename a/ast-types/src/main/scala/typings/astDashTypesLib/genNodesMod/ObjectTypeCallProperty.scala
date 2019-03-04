package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait ObjectTypeCallProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var static: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeCallProperty
  var value: astDashTypesLib.genKindsMod.FunctionTypeAnnotationKind
}

object ObjectTypeCallProperty {
  @scala.inline
  def apply(
    static: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeCallProperty,
    value: astDashTypesLib.genKindsMod.FunctionTypeAnnotationKind
  ): ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(static = static, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ObjectTypeCallProperty]
  }
}

