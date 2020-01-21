package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLoc
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportNamespaceSpecifierBuilder extends js.Object {
  def apply(): ImportNamespaceSpecifier = js.native
  def apply(local: IdentifierKind): ImportNamespaceSpecifier = js.native
  def from(params: AnonCommentsIdLoc): ImportNamespaceSpecifier = js.native
}

