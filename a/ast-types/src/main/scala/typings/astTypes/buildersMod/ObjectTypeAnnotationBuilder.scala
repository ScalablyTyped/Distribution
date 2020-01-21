package typings.astTypes.buildersMod

import typings.astTypes.AnonCallProperties
import typings.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typings.astTypes.kindsMod.ObjectTypeIndexerKind
import typings.astTypes.kindsMod.ObjectTypePropertyKind
import typings.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
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
  def from(params: AnonCallProperties): ObjectTypeAnnotation = js.native
}

