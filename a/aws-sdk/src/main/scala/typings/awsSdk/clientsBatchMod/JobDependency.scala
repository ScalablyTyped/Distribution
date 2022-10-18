package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDependency extends StObject {
  
  /**
    * The job ID of the Batch job associated with this dependency.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the job dependency.
    */
  var `type`: js.UndefOr[ArrayJobDependency] = js.undefined
}
object JobDependency {
  
  inline def apply(): JobDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDependency]
  }
  
  extension [Self <: JobDependency](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setType(value: ArrayJobDependency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
