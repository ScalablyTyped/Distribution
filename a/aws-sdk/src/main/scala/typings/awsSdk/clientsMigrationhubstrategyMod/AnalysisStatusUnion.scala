package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisStatusUnion extends StObject {
  
  /**
    * The status of the analysis.
    */
  var runtimeAnalysisStatus: js.UndefOr[RuntimeAnalysisStatus] = js.undefined
  
  /**
    * The status of the source code or database analysis.
    */
  var srcCodeOrDbAnalysisStatus: js.UndefOr[SrcCodeOrDbAnalysisStatus] = js.undefined
}
object AnalysisStatusUnion {
  
  inline def apply(): AnalysisStatusUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisStatusUnion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisStatusUnion] (val x: Self) extends AnyVal {
    
    inline def setRuntimeAnalysisStatus(value: RuntimeAnalysisStatus): Self = StObject.set(x, "runtimeAnalysisStatus", value.asInstanceOf[js.Any])
    
    inline def setRuntimeAnalysisStatusUndefined: Self = StObject.set(x, "runtimeAnalysisStatus", js.undefined)
    
    inline def setSrcCodeOrDbAnalysisStatus(value: SrcCodeOrDbAnalysisStatus): Self = StObject.set(x, "srcCodeOrDbAnalysisStatus", value.asInstanceOf[js.Any])
    
    inline def setSrcCodeOrDbAnalysisStatusUndefined: Self = StObject.set(x, "srcCodeOrDbAnalysisStatus", js.undefined)
  }
}
