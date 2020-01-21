package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLeftLocRightArray
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQualifiedNameBuilder extends js.Object {
  def apply(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def apply(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def from(params: AnonCommentsLeftLocRightArray): TSQualifiedName = js.native
}

