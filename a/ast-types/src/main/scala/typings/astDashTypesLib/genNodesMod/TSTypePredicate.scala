package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSTypeAnnotation, 'type' | 'typeAnnotation'> ]: ast-types.ast-types/gen/nodes.TSTypeAnnotation[P]} */ trait TSTypePredicate extends js.Object {
  var parameterName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSThisTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypePredicate
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
}

