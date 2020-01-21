package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIndexType
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexedAccessTypeBuilder extends js.Object {
  def apply(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType = js.native
  def from(params: AnonCommentsIndexType): TSIndexedAccessType = js.native
}

