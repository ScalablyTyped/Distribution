package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ComprehensionExpression extends js.Object {
  var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
  var body: astDashTypesLib.genKindsMod.ExpressionKind
  var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionExpression
}

