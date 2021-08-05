package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
  - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
*/
trait SpecifierKind extends StObject
object SpecifierKind {
  
  inline def ExportBatchSpecifier(): typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportBatchSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  }
  
  inline def ExportDefaultSpecifier(exported: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  }
  
  inline def ExportNamespaceSpecifier(exported: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  }
  
  inline def ExportSpecifier(exported: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  }
  
  inline def ImportDefaultSpecifier(): typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  }
  
  inline def ImportNamespaceSpecifier(): typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  }
  
  inline def ImportSpecifier(imported: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  }
}
