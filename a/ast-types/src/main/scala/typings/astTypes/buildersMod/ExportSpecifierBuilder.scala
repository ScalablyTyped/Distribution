package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExported
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSpecifierBuilder extends js.Object {
  def apply(local: js.UndefOr[scala.Nothing], exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: Null, exported: IdentifierKind): ExportSpecifier = js.native
  def apply(local: IdentifierKind, exported: IdentifierKind): ExportSpecifier = js.native
  def from(params: AnonCommentsExported): ExportSpecifier = js.native
}

