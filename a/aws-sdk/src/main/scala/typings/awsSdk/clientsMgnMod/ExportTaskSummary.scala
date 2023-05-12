package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskSummary extends StObject {
  
  /**
    * Export task summary applications count.
    */
  var applicationsCount: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Export task summary servers count.
    */
  var serversCount: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Export task summary waves count.
    */
  var wavesCount: js.UndefOr[PositiveInteger] = js.undefined
}
object ExportTaskSummary {
  
  inline def apply(): ExportTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTaskSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationsCount(value: PositiveInteger): Self = StObject.set(x, "applicationsCount", value.asInstanceOf[js.Any])
    
    inline def setApplicationsCountUndefined: Self = StObject.set(x, "applicationsCount", js.undefined)
    
    inline def setServersCount(value: PositiveInteger): Self = StObject.set(x, "serversCount", value.asInstanceOf[js.Any])
    
    inline def setServersCountUndefined: Self = StObject.set(x, "serversCount", js.undefined)
    
    inline def setWavesCount(value: PositiveInteger): Self = StObject.set(x, "wavesCount", value.asInstanceOf[js.Any])
    
    inline def setWavesCountUndefined: Self = StObject.set(x, "wavesCount", js.undefined)
  }
}
