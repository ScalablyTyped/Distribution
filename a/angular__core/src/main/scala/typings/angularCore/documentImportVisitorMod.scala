package typings.angularCore

import typings.std.Map
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentImportVisitorMod {
  
  @JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "COMMON_IMPORT")
  @js.native
  val COMMON_IMPORT: /* "@angular/common" */ String = js.native
  
  @JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "DOCUMENT_TOKEN_NAME")
  @js.native
  val DOCUMENT_TOKEN_NAME: /* "DOCUMENT" */ String = js.native
  
  @JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "DocumentImportVisitor")
  @js.native
  class DocumentImportVisitor protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    /* private */ var getDocumentElement: js.Any = js.native
    
    var importsMap: Map[SourceFile, ResolvedDocumentImport] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    /* private */ var visitNamedImport: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  @JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "PLATFORM_BROWSER_IMPORT")
  @js.native
  val PLATFORM_BROWSER_IMPORT: /* "@angular/platform-browser" */ String = js.native
  
  trait ResolvedDocumentImport extends StObject {
    
    var commonImport: NamedImports | Null
    
    var documentElement: ImportSpecifier | Null
    
    var platformBrowserImport: NamedImports | Null
  }
  object ResolvedDocumentImport {
    
    inline def apply(): ResolvedDocumentImport = {
      val __obj = js.Dynamic.literal(commonImport = null, documentElement = null, platformBrowserImport = null)
      __obj.asInstanceOf[ResolvedDocumentImport]
    }
    
    extension [Self <: ResolvedDocumentImport](x: Self) {
      
      inline def setCommonImport(value: NamedImports): Self = StObject.set(x, "commonImport", value.asInstanceOf[js.Any])
      
      inline def setCommonImportNull: Self = StObject.set(x, "commonImport", null)
      
      inline def setDocumentElement(value: ImportSpecifier): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
      
      inline def setDocumentElementNull: Self = StObject.set(x, "documentElement", null)
      
      inline def setPlatformBrowserImport(value: NamedImports): Self = StObject.set(x, "platformBrowserImport", value.asInstanceOf[js.Any])
      
      inline def setPlatformBrowserImportNull: Self = StObject.set(x, "platformBrowserImport", null)
    }
  }
}
