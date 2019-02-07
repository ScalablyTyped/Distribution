package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TemplateLiteral extends js.Object {
  var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
  var quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TemplateLiteral
}

