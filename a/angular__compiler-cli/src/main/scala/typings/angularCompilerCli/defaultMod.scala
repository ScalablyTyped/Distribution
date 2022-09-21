package typings.angularCompilerCli

import typings.angularCompiler.mod.WrappedNodeExpr
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/default", "DefaultImportTracker")
  @js.native
  open class DefaultImportTracker () extends StObject {
    
    /**
      * Get a `ts.TransformerFactory` which will preserve default imports that were previously marked
      * as used.
      *
      * This transformer must run after any other transformers which call `recordUsedImport`.
      */
    def importPreservingTransformer(): TransformerFactory[SourceFile] = js.native
    
    def recordUsedImport(importDecl: ImportDeclaration): Unit = js.native
    
    /**
      * A `Map` which tracks the `Set` of `ts.ImportDeclaration`s for default imports that were used in
      * a given `ts.SourceFile` and need to be preserved.
      */
    /* private */ var sourceFileToUsedImports: Any = js.native
    
    /**
      * Process a `ts.SourceFile` and replace any `ts.ImportDeclaration`s.
      */
    /* private */ var transformSourceFile: Any = js.native
  }
  
  inline def attachDefaultImportDeclaration(expr: WrappedNodeExpr[Any], importDecl: ImportDeclaration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachDefaultImportDeclaration")(expr.asInstanceOf[js.Any], importDecl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDefaultImportDeclaration(expr: WrappedNodeExpr[Any]): ImportDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultImportDeclaration")(expr.asInstanceOf[js.Any]).asInstanceOf[ImportDeclaration | Null]
}
