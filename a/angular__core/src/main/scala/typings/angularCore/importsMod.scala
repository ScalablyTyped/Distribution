package typings.angularCore

import typings.typescript.mod.Identifier
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getImportOfIdentifier(typeChecker: TypeChecker, node: Identifier): Import | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportOfIdentifier")(typeChecker.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Import | Null]
  
  @scala.inline
  def getImportSpecifier(sourceFile: SourceFile, moduleName: String, specifierName: String): ImportSpecifier | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportSpecifier")(sourceFile.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any], specifierName.asInstanceOf[js.Any])).asInstanceOf[ImportSpecifier | Null]
  
  @scala.inline
  def replaceImport(node: NamedImports, existingImport: String, newImportName: String): NamedImports = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceImport")(node.asInstanceOf[js.Any], existingImport.asInstanceOf[js.Any], newImportName.asInstanceOf[js.Any])).asInstanceOf[NamedImports]
  
  trait Import extends StObject {
    
    var importModule: String
    
    var name: String
    
    var node: ImportDeclaration
  }
  object Import {
    
    @scala.inline
    def apply(importModule: String, name: String, node: ImportDeclaration): Import = {
      val __obj = js.Dynamic.literal(importModule = importModule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Import]
    }
    
    @scala.inline
    implicit class ImportMutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportModule(value: String): Self = StObject.set(x, "importModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ImportDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
