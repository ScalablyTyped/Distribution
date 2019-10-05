package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CallProperties
import typings.astDashTypes.genKindsMod.ObjectTypeCallPropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeIndexerKind
import typings.astDashTypes.genKindsMod.ObjectTypePropertyKind
import typings.astDashTypes.genKindsMod.ObjectTypeSpreadPropertyKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotationBuilder extends js.Object {
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation = js.native
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  def from(params: Anon_CallProperties): ObjectTypeAnnotation = js.native
}

