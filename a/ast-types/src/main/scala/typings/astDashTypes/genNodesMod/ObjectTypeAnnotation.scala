package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typings.astDashTypes.genKindsMod.ObjectTypeInternalSlotKind
import typings.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait ObjectTypeAnnotation extends ASTNode {
  var callProperties: js.Array[ObjectTypeCallPropertyKind]
  var exact: Boolean
  var indexers: js.Array[ObjectTypeIndexerKind]
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.Array[ObjectTypeInternalSlotKind]
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeAnnotation
}

object ObjectTypeAnnotation {
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallPropertyKind],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexerKind],
    internalSlots: js.Array[ObjectTypeInternalSlotKind],
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeAnnotation,
    inexact: js.UndefOr[Boolean] = js.undefined
  ): ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation]
  }
}

