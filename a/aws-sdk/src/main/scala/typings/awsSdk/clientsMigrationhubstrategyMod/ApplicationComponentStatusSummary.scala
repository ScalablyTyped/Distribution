package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationComponentStatusSummary extends StObject {
  
  /**
    * The number of application components successfully analyzed, partially successful or failed analysis.
    */
  var count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of database analysis.
    */
  var srcCodeOrDbAnalysisStatus: js.UndefOr[SrcCodeOrDbAnalysisStatus] = js.undefined
}
object ApplicationComponentStatusSummary {
  
  inline def apply(): ApplicationComponentStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponentStatusSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationComponentStatusSummary] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSrcCodeOrDbAnalysisStatus(value: SrcCodeOrDbAnalysisStatus): Self = StObject.set(x, "srcCodeOrDbAnalysisStatus", value.asInstanceOf[js.Any])
    
    inline def setSrcCodeOrDbAnalysisStatusUndefined: Self = StObject.set(x, "srcCodeOrDbAnalysisStatus", js.undefined)
  }
}
