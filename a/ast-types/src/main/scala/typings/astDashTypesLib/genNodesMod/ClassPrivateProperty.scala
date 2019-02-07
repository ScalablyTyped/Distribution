package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ClassProperty, 'type' | 'key' | 'value'> ]: ast-types.ast-types/gen/nodes.ClassProperty[P]} */ trait ClassPrivateProperty extends js.Object {
  var key: astDashTypesLib.genKindsMod.PrivateNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateProperty
  var value: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

