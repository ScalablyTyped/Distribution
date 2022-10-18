package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcCoreMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/core", "NoopImportRewriter")
  @js.native
  open class NoopImportRewriter ()
    extends StObject
       with ImportRewriter {
    
    /**
      * Optionally rewrite the given module specifier in the context of a given file.
      */
    /* CompleteClass */
    override def rewriteSpecifier(specifier: String, inContextOfFile: String): String = js.native
    
    /**
      * Optionally rewrite a reference to an imported symbol, changing either the binding prefix or the
      * symbol name itself.
      */
    /* CompleteClass */
    override def rewriteSymbol(symbol: String, specifier: String): String = js.native
    
    /**
      * Should the given symbol be imported at all?
      *
      * If `true`, the symbol should be imported from the given specifier. If `false`, the symbol
      * should be referenced directly, without an import.
      */
    /* CompleteClass */
    override def shouldImportSymbol(symbol: String, specifier: String): Boolean = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/core", "R3SymbolsImportRewriter")
  @js.native
  open class R3SymbolsImportRewriter protected ()
    extends StObject
       with ImportRewriter {
    def this(r3SymbolsPath: String) = this()
    
    /* private */ var r3SymbolsPath: Any = js.native
    
    /**
      * Optionally rewrite the given module specifier in the context of a given file.
      */
    /* CompleteClass */
    override def rewriteSpecifier(specifier: String, inContextOfFile: String): String = js.native
    
    /**
      * Optionally rewrite a reference to an imported symbol, changing either the binding prefix or the
      * symbol name itself.
      */
    /* CompleteClass */
    override def rewriteSymbol(symbol: String, specifier: String): String = js.native
    
    /**
      * Should the given symbol be imported at all?
      *
      * If `true`, the symbol should be imported from the given specifier. If `false`, the symbol
      * should be referenced directly, without an import.
      */
    /* CompleteClass */
    override def shouldImportSymbol(symbol: String, specifier: String): Boolean = js.native
  }
  
  inline def validateAndRewriteCoreSymbol(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndRewriteCoreSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ImportRewriter extends StObject {
    
    /**
      * Optionally rewrite the given module specifier in the context of a given file.
      */
    def rewriteSpecifier(specifier: String, inContextOfFile: String): String
    
    /**
      * Optionally rewrite a reference to an imported symbol, changing either the binding prefix or the
      * symbol name itself.
      */
    def rewriteSymbol(symbol: String, specifier: String): String
    
    /**
      * Should the given symbol be imported at all?
      *
      * If `true`, the symbol should be imported from the given specifier. If `false`, the symbol
      * should be referenced directly, without an import.
      */
    def shouldImportSymbol(symbol: String, specifier: String): Boolean
  }
  object ImportRewriter {
    
    inline def apply(
      rewriteSpecifier: (String, String) => String,
      rewriteSymbol: (String, String) => String,
      shouldImportSymbol: (String, String) => Boolean
    ): ImportRewriter = {
      val __obj = js.Dynamic.literal(rewriteSpecifier = js.Any.fromFunction2(rewriteSpecifier), rewriteSymbol = js.Any.fromFunction2(rewriteSymbol), shouldImportSymbol = js.Any.fromFunction2(shouldImportSymbol))
      __obj.asInstanceOf[ImportRewriter]
    }
    
    extension [Self <: ImportRewriter](x: Self) {
      
      inline def setRewriteSpecifier(value: (String, String) => String): Self = StObject.set(x, "rewriteSpecifier", js.Any.fromFunction2(value))
      
      inline def setRewriteSymbol(value: (String, String) => String): Self = StObject.set(x, "rewriteSymbol", js.Any.fromFunction2(value))
      
      inline def setShouldImportSymbol(value: (String, String) => Boolean): Self = StObject.set(x, "shouldImportSymbol", js.Any.fromFunction2(value))
    }
  }
}
