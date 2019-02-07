package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ObjectTypeAnnotation extends js.Object {
  var callProperties: js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind]
  var exact: scala.Boolean
  var indexers: js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind]
  var inexact: js.UndefOr[scala.Boolean]
  var internalSlots: js.Array[astDashTypesLib.genKindsMod.ObjectTypeInternalSlotKind]
  var properties: js.Array[
    astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeAnnotation
}

