package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingNgccImportRewriterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/ngcc_import_rewriter", "NgccFlatImportRewriter")
  @js.native
  open class NgccFlatImportRewriter ()
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
}
