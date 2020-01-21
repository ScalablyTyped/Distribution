package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdImported
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSpecifierBuilder extends js.Object {
  def apply(imported: IdentifierKind): ImportSpecifier = js.native
  def apply(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  def from(params: AnonCommentsIdImported): ImportSpecifier = js.native
}

