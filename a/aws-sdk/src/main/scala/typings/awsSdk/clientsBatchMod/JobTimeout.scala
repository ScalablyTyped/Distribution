package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTimeout extends StObject {
  
  /**
    * The job timeout time (in seconds) that's measured from the job attempt's startedAt timestamp. After this time passes, Batch terminates your jobs if they aren't finished. The minimum value for the timeout is 60 seconds.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.undefined
}
object JobTimeout {
  
  inline def apply(): JobTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobTimeout] (val x: Self) extends AnyVal {
    
    inline def setAttemptDurationSeconds(value: Integer): Self = StObject.set(x, "attemptDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setAttemptDurationSecondsUndefined: Self = StObject.set(x, "attemptDurationSeconds", js.undefined)
  }
}
