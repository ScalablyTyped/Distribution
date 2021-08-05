package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTimeout extends StObject {
  
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.undefined
}
object JobTimeout {
  
  inline def apply(): JobTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimeout]
  }
  
  extension [Self <: JobTimeout](x: Self) {
    
    inline def setAttemptDurationSeconds(value: Integer): Self = StObject.set(x, "attemptDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setAttemptDurationSecondsUndefined: Self = StObject.set(x, "attemptDurationSeconds", js.undefined)
  }
}
