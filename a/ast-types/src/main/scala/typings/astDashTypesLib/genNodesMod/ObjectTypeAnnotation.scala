package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ObjectTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
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

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind],
    exact: scala.Boolean,
    indexers: js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind],
    internalSlots: js.Array[astDashTypesLib.genKindsMod.ObjectTypeInternalSlotKind],
    properties: js.Array[
      astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeAnnotation,
    inexact: js.UndefOr[scala.Boolean] = js.undefined
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("callProperties")(callProperties)
    __obj.updateDynamic("exact")(exact)
    __obj.updateDynamic("indexers")(indexers)
    __obj.updateDynamic("internalSlots")(internalSlots)
    __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact)
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

