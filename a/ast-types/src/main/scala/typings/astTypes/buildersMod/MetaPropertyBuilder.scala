package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocMeta
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.MetaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaPropertyBuilder extends js.Object {
  def apply(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  def from(params: AnonCommentsLocMeta): MetaProperty = js.native
}

