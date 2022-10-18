package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobSummary extends StObject {
  
  /**
    * The date and time when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  var ImportDestination: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ImportDestination] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobId] = js.undefined
  
  var JobStatus: js.UndefOr[typings.awsSdk.clientsSesv2Mod.JobStatus] = js.undefined
}
object ImportJobSummary {
  
  inline def apply(): ImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobSummary]
  }
  
  extension [Self <: ImportJobSummary](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
    
    inline def setImportDestinationUndefined: Self = StObject.set(x, "ImportDestination", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
