package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotationBuilder extends js.Object {
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
    ]
  ): astDashTypesLib.genNodesMod.ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
    ],
    indexers: js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind]
  ): astDashTypesLib.genNodesMod.ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
    ],
    indexers: js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind],
    callProperties: js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind]
  ): astDashTypesLib.genNodesMod.ObjectTypeAnnotation = js.native
  def from(params: astDashTypesLib.Anon_CallProperties): astDashTypesLib.genNodesMod.ObjectTypeAnnotation = js.native
}

