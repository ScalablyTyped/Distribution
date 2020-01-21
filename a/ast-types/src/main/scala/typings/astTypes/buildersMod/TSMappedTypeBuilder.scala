package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocOptional
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.namedTypesMod.namedTypes.TSMappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMappedTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  def from(params: AnonCommentsLocOptional): TSMappedType = js.native
}

