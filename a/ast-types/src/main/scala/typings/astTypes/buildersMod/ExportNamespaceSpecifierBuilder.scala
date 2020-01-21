package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExportedLoc
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamespaceSpecifierBuilder extends js.Object {
  def apply(exported: IdentifierKind): ExportNamespaceSpecifier = js.native
  def from(params: AnonCommentsExportedLoc): ExportNamespaceSpecifier = js.native
}

