package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXNamespacedName
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: astDashTypesLib.genKindsMod.JSXIdentifierKind
  var namespace: astDashTypesLib.genKindsMod.JSXIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXNamespacedName
}

object JSXNamespacedName {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    namespace: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.JSXNamespacedName
  ): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSXNamespacedName]
  }
}

