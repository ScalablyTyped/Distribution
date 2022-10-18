package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /**
    *  The execution steps for an execution job, for an Amplify app. 
    */
  var steps: Steps
  
  /**
    *  Describes the summary for an execution job for an Amplify app. 
    */
  var summary: JobSummary
}
object Job {
  
  inline def apply(steps: Steps, summary: JobSummary): Job = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setSteps(value: Steps): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setSummary(value: JobSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
