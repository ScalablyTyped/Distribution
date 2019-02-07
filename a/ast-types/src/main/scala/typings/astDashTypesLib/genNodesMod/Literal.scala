package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait Literal extends js.Object {
  var regex: astDashTypesLib.Anon_Flags | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.Literal
  var value: java.lang.String | scala.Boolean | scala.Null | scala.Double | stdLib.RegExp
}

