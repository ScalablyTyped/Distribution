package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsExported
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportNamespaceSpecifierBuilder extends StObject {
  
  def apply(exported: IdentifierKind): ExportNamespaceSpecifier = js.native
  
  def from(params: CommentsExported): ExportNamespaceSpecifier = js.native
}
