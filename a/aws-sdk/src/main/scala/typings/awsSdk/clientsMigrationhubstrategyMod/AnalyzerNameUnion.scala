package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzerNameUnion extends StObject {
  
  /**
    * The binary analyzer names.
    */
  var binaryAnalyzerName: js.UndefOr[BinaryAnalyzerName] = js.undefined
  
  /**
    * The assessment analyzer names.
    */
  var runTimeAnalyzerName: js.UndefOr[RunTimeAnalyzerName] = js.undefined
  
  /**
    * The source code analyzer names.
    */
  var sourceCodeAnalyzerName: js.UndefOr[SourceCodeAnalyzerName] = js.undefined
}
object AnalyzerNameUnion {
  
  inline def apply(): AnalyzerNameUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzerNameUnion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyzerNameUnion] (val x: Self) extends AnyVal {
    
    inline def setBinaryAnalyzerName(value: BinaryAnalyzerName): Self = StObject.set(x, "binaryAnalyzerName", value.asInstanceOf[js.Any])
    
    inline def setBinaryAnalyzerNameUndefined: Self = StObject.set(x, "binaryAnalyzerName", js.undefined)
    
    inline def setRunTimeAnalyzerName(value: RunTimeAnalyzerName): Self = StObject.set(x, "runTimeAnalyzerName", value.asInstanceOf[js.Any])
    
    inline def setRunTimeAnalyzerNameUndefined: Self = StObject.set(x, "runTimeAnalyzerName", js.undefined)
    
    inline def setSourceCodeAnalyzerName(value: SourceCodeAnalyzerName): Self = StObject.set(x, "sourceCodeAnalyzerName", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeAnalyzerNameUndefined: Self = StObject.set(x, "sourceCodeAnalyzerName", js.undefined)
  }
}
