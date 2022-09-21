package typings.angularCompilerCli

import typings.angularCompilerCli.dependencyHostMod.DependencyHostBase
import typings.angularCompilerCli.moduleResolverMod.ModuleResolver
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import typings.typescript.mod.Statement
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/esm_dependency_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/esm_dependency_host", "EsmDependencyHost")
  @js.native
  open class EsmDependencyHost protected () extends DependencyHostBase {
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver) = this()
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver, scanImportExpressions: Boolean) = this()
    
    /**
      * We have found an `import` token so now try to identify the import path.
      *
      * This method will use the current state of `this.scanner` to extract a string literal module
      * specifier. It expects that the current state of the scanner is that an `import` token has just
      * been scanned.
      *
      * The following forms of import are matched:
      *
      * * `import "module-specifier";`
      * * `import("module-specifier")`
      * * `import defaultBinding from "module-specifier";`
      * * `import defaultBinding, * as identifier from "module-specifier";`
      * * `import defaultBinding, {...} from "module-specifier";`
      * * `import * as identifier from "module-specifier";`
      * * `import {...} from "module-specifier";`
      *
      * @returns the import path or null if there is no import or it is not a string literal.
      */
    /* protected */ def extractImportPath(): String | Null = js.native
    
    /**
      * We have found an `export` token so now try to identify a re-export path.
      *
      * This method will use the current state of `this.scanner` to extract a string literal module
      * specifier. It expects that the current state of the scanner is that an `export` token has
      * just been scanned.
      *
      * There are three forms of re-export that are matched:
      *
      * * `export * from '...';
      * * `export * as alias from '...';
      * * `export {...} from '...';
      */
    /* protected */ def extractReexportPath(): String | Null = js.native
    
    /* private */ var scanImportExpressions: Any = js.native
    
    /* private */ var scanner: Any = js.native
    
    /* protected */ def skipNamedClause(): SyntaxKind = js.native
    
    /* protected */ def skipNamespacedClause(): SyntaxKind | Null = js.native
    
    /* protected */ def tryStringLiteral(): String | Null = js.native
  }
  
  inline def hasImportOrReexportStatements(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasImportOrReexportStatements")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStringImportOrReexport(stmt: Statement): /* is @angular/compiler-cli.anon.ImportDeclarationmoduleSp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringImportOrReexport")(stmt.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ImportDeclarationmoduleSp */ Boolean]
}
