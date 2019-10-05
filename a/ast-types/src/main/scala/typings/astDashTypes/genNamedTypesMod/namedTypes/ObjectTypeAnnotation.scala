package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.FlowKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typings.astDashTypes.genKindsMod.ObjectTypeInternalSlotKind
import typings.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ObjectTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.undefined
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.undefined
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectTypeAnnotation
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeAnnotation")
@js.native
object ObjectTypeAnnotation extends TopLevel[Type[ObjectTypeAnnotation]]

