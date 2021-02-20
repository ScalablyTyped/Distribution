package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
*/
trait ModuleSpecifierKind extends StObject
object ModuleSpecifierKind {
  
  @scala.inline
  def ExportSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportSpecifier): typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(`type`: typings.astTypes.astTypesStrings.ImportDefaultSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(`type`: typings.astTypes.astTypesStrings.ImportNamespaceSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(imported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ImportSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  }
}
