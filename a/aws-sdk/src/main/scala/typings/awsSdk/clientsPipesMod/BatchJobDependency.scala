package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchJobDependency extends StObject {
  
  /**
    * The job ID of the Batch job that's associated with this dependency.
    */
  var JobId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the job dependency.
    */
  var Type: js.UndefOr[BatchJobDependencyType] = js.undefined
}
object BatchJobDependency {
  
  inline def apply(): BatchJobDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchJobDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchJobDependency] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setType(value: BatchJobDependencyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
