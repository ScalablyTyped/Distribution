package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileTypeSummary
import typings.angularCompiler.coreMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSummaryResolverMod {
  
  @JSImport("@angular/compiler/src/summary_resolver", "JitSummaryResolver")
  @js.native
  class JitSummaryResolver () extends SummaryResolver[Type] {
    
    var _summaries: js.Any = js.native
    
    def fromSummaryFileName(fileName: String): String = js.native
    
    def getSymbolsOf(): js.Array[Type] = js.native
    
    def isLibraryFile(): Boolean = js.native
    
    def toSummaryFileName(fileName: String): String = js.native
  }
  
  @JSImport("@angular/compiler/src/summary_resolver", "SummaryResolver")
  @js.native
  abstract class SummaryResolver[T] () extends StObject {
    
    def addSummary(summary: Summary[T]): Unit = js.native
    
    def fromSummaryFileName(fileName: String, referringLibFileName: String): String = js.native
    
    def getImportAs(reference: T): T = js.native
    
    def getKnownModuleName(fileName: String): String | Null = js.native
    
    def getSymbolsOf(filePath: String): js.Array[T] | Null = js.native
    
    def isLibraryFile(fileName: String): Boolean = js.native
    
    def resolveSummary(reference: T): Summary[T] | Null = js.native
    
    def toSummaryFileName(fileName: String, referringSrcFileName: String): String = js.native
  }
  
  @js.native
  trait Summary[T] extends StObject {
    
    var metadata: js.Any = js.native
    
    var symbol: T = js.native
    
    var `type`: js.UndefOr[CompileTypeSummary] = js.native
  }
  object Summary {
    
    @scala.inline
    def apply[T](metadata: js.Any, symbol: T): Summary[T] = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Summary[T]]
    }
    
    @scala.inline
    implicit class SummaryMutableBuilder[Self <: Summary[_], T] (val x: Self with Summary[T]) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: T): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CompileTypeSummary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
