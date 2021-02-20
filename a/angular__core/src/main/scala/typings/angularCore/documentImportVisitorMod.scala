package typings.angularCore

import typings.std.Map
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    var getDocumentElement: js.Any = js.native
    
    var importsMap: Map[SourceFile, ResolvedDocumentImport] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    var visitNamedImport: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  @JSImport("@angular/core/schematics/migrations/move-document/document_import_visitor", "PLATFORM_BROWSER_IMPORT")
  @js.native
  val PLATFORM_BROWSER_IMPORT: /* "@angular/platform-browser" */ String = js.native
  
  @js.native
  trait ResolvedDocumentImport extends StObject {
    
    var commonImport: NamedImports | Null = js.native
    
    var documentElement: ImportSpecifier | Null = js.native
    
    var platformBrowserImport: NamedImports | Null = js.native
  }
  object ResolvedDocumentImport {
    
    @scala.inline
    def apply(): ResolvedDocumentImport = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolvedDocumentImport]
    }
    
    @scala.inline
    implicit class ResolvedDocumentImportMutableBuilder[Self <: ResolvedDocumentImport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonImport(value: NamedImports): Self = StObject.set(x, "commonImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonImportNull: Self = StObject.set(x, "commonImport", null)
      
      @scala.inline
      def setDocumentElement(value: ImportSpecifier): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentElementNull: Self = StObject.set(x, "documentElement", null)
      
      @scala.inline
      def setPlatformBrowserImport(value: NamedImports): Self = StObject.set(x, "platformBrowserImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformBrowserImportNull: Self = StObject.set(x, "platformBrowserImport", null)
    }
  }
}
