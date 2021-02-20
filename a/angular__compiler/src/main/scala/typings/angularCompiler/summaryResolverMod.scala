package typings.angularCompiler

import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolMod.StaticSymbolCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object summaryResolverMod {
  
  @JSImport("@angular/compiler/src/aot/summary_resolver", "AotSummaryResolver")
  @js.native
  class AotSummaryResolver protected () extends SummaryResolver[StaticSymbol] {
    def this(host: AotSummaryResolverHost, staticSymbolCache: StaticSymbolCache) = this()
    
    var _loadSummaryFile: js.Any = js.native
    
    var host: js.Any = js.native
    
    var importAs: js.Any = js.native
    
    var knownFileNameToModuleNames: js.Any = js.native
    
    var loadedFilePaths: js.Any = js.native
    
    var staticSymbolCache: js.Any = js.native
    
    var summaryCache: js.Any = js.native
  }
  
  @js.native
  trait AotSummaryResolverHost extends StObject {
    
    /**
      * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
      * given the fileName of the library that is referrig to it.
      */
    def fromSummaryFileName(fileName: String, referringLibFileName: String): String = js.native
    
    /**
      * Returns whether a file is a source file or not.
      */
    def isSourceFile(sourceFilePath: String): Boolean = js.native
    
    /**
      * Loads an NgModule/Directive/Pipe summary file
      */
    def loadSummary(filePath: String): String | Null = js.native
    
    /**
      * Converts a file name into a representation that should be stored in a summary file.
      * This has to include changing the suffix as well.
      * E.g.
      * `some_file.ts` -> `some_file.d.ts`
      *
      * @param referringSrcFileName the soure file that refers to fileName
      */
    def toSummaryFileName(fileName: String, referringSrcFileName: String): String = js.native
  }
  object AotSummaryResolverHost {
    
    @scala.inline
    def apply(
      fromSummaryFileName: (String, String) => String,
      isSourceFile: String => Boolean,
      loadSummary: String => String | Null,
      toSummaryFileName: (String, String) => String
    ): AotSummaryResolverHost = {
      val __obj = js.Dynamic.literal(fromSummaryFileName = js.Any.fromFunction2(fromSummaryFileName), isSourceFile = js.Any.fromFunction1(isSourceFile), loadSummary = js.Any.fromFunction1(loadSummary), toSummaryFileName = js.Any.fromFunction2(toSummaryFileName))
      __obj.asInstanceOf[AotSummaryResolverHost]
    }
    
    @scala.inline
    implicit class AotSummaryResolverHostMutableBuilder[Self <: AotSummaryResolverHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSummaryFileName(value: (String, String) => String): Self = StObject.set(x, "fromSummaryFileName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsSourceFile(value: String => Boolean): Self = StObject.set(x, "isSourceFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadSummary(value: String => String | Null): Self = StObject.set(x, "loadSummary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToSummaryFileName(value: (String, String) => String): Self = StObject.set(x, "toSummaryFileName", js.Any.fromFunction2(value))
    }
  }
}
