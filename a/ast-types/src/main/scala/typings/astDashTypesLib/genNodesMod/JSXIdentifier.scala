package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/nodes.Identifier[P]} */ trait JSXIdentifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.IdentifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXIdentifier
}

object JSXIdentifier {
  @scala.inline
  def apply(name: java.lang.String, `type`: astDashTypesLib.astDashTypesLibStrings.JSXIdentifier): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSXIdentifier]
  }
}

