package typings.astTypes.buildersMod

import typings.astTypes.anon.Local
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDefaultSpecifierBuilder extends js.Object {
  
  def apply(): ImportDefaultSpecifier = js.native
  def apply(local: IdentifierKind): ImportDefaultSpecifier = js.native
  
  def from(params: Local): ImportDefaultSpecifier = js.native
}
