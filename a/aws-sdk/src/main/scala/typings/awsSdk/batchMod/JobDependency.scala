package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDependency extends StObject {
  
  /**
    * The job ID of the AWS Batch job associated with this dependency.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the job dependency.
    */
  var `type`: js.UndefOr[ArrayJobDependency] = js.undefined
}
object JobDependency {
  
  @scala.inline
  def apply(): JobDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDependency]
  }
  
  @scala.inline
  implicit class JobDependencyMutableBuilder[Self <: JobDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setType(value: ArrayJobDependency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
