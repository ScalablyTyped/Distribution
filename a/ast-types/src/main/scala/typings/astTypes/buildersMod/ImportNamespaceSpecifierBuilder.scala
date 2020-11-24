package typings.astTypes.buildersMod

import typings.astTypes.anon.Local
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportNamespaceSpecifierBuilder extends js.Object {
  
  def apply(): ImportNamespaceSpecifier = js.native
  def apply(local: IdentifierKind): ImportNamespaceSpecifier = js.native
  
  def from(params: Local): ImportNamespaceSpecifier = js.native
}
