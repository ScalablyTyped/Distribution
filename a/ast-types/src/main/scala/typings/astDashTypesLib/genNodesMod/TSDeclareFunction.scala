package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSDeclareFunction extends TSHasOptionalTypeParameters {
  var async: scala.Boolean
  var declare: scala.Boolean
  var generator: scala.Boolean
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  var returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareFunction
}

