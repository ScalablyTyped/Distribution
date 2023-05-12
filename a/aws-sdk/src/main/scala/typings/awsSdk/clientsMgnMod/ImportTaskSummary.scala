package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTaskSummary extends StObject {
  
  /**
    * Import task summary applications.
    */
  var applications: js.UndefOr[ImportTaskSummaryApplications] = js.undefined
  
  /**
    * Import task summary servers.
    */
  var servers: js.UndefOr[ImportTaskSummaryServers] = js.undefined
  
  /**
    * Import task summary waves.
    */
  var waves: js.UndefOr[ImportTaskSummaryWaves] = js.undefined
}
object ImportTaskSummary {
  
  inline def apply(): ImportTaskSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTaskSummary] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: ImportTaskSummaryApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setServers(value: ImportTaskSummaryServers): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setWaves(value: ImportTaskSummaryWaves): Self = StObject.set(x, "waves", value.asInstanceOf[js.Any])
    
    inline def setWavesUndefined: Self = StObject.set(x, "waves", js.undefined)
  }
}
