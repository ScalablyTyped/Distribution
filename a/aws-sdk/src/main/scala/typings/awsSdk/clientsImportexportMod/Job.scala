package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  var IsCanceled: js.UndefOr[typings.awsSdk.clientsImportexportMod.IsCanceled] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.clientsImportexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typings.awsSdk.clientsImportexportMod.JobType] = js.undefined
}
object Job {
  
  inline def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setIsCanceled(value: IsCanceled): Self = StObject.set(x, "IsCanceled", value.asInstanceOf[js.Any])
    
    inline def setIsCanceledUndefined: Self = StObject.set(x, "IsCanceled", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
  }
}
