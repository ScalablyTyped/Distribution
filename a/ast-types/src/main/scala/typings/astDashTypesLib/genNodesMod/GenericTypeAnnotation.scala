package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait GenericTypeAnnotation extends js.Object {
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.GenericTypeAnnotation
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null
}

