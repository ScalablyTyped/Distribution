package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait MemberTypeAnnotation extends js.Object {
  var `object`: astDashTypesLib.genKindsMod.IdentifierKind
  var property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.MemberTypeAnnotation
}

