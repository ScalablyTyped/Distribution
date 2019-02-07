package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSPropertySignature extends TSHasOptionalTypeAnnotation {
  var computed: scala.Boolean
  var initializer: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var optional: scala.Boolean
  var readonly: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSPropertySignature
}

