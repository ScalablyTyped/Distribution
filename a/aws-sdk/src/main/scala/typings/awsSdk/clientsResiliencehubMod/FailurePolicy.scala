package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailurePolicy extends StObject {
  
  /**
    * The Recovery Point Objective (RPO), in seconds.
    */
  var rpoInSecs: Seconds
  
  /**
    * The Recovery Time Objective (RTO), in seconds.
    */
  var rtoInSecs: Seconds
}
object FailurePolicy {
  
  inline def apply(rpoInSecs: Seconds, rtoInSecs: Seconds): FailurePolicy = {
    val __obj = js.Dynamic.literal(rpoInSecs = rpoInSecs.asInstanceOf[js.Any], rtoInSecs = rtoInSecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailurePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailurePolicy] (val x: Self) extends AnyVal {
    
    inline def setRpoInSecs(value: Seconds): Self = StObject.set(x, "rpoInSecs", value.asInstanceOf[js.Any])
    
    inline def setRtoInSecs(value: Seconds): Self = StObject.set(x, "rtoInSecs", value.asInstanceOf[js.Any])
  }
}
