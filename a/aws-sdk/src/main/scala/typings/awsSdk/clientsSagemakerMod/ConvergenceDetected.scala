package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvergenceDetected extends StObject {
  
  /**
    * A flag to stop a tuning job once AMT has detected that the job has converged.
    */
  var CompleteOnConvergence: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CompleteOnConvergence] = js.undefined
}
object ConvergenceDetected {
  
  inline def apply(): ConvergenceDetected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvergenceDetected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvergenceDetected] (val x: Self) extends AnyVal {
    
    inline def setCompleteOnConvergence(value: CompleteOnConvergence): Self = StObject.set(x, "CompleteOnConvergence", value.asInstanceOf[js.Any])
    
    inline def setCompleteOnConvergenceUndefined: Self = StObject.set(x, "CompleteOnConvergence", js.undefined)
  }
}
