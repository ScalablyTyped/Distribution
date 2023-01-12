package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTerminationPolicy extends StObject {
  
  /**
    * Specifies the amount of idle time in seconds after which the cluster automatically terminates. You can specify a minimum of 60 seconds and a maximum of 604800 seconds (seven days).
    */
  var IdleTimeout: js.UndefOr[Long] = js.undefined
}
object AutoTerminationPolicy {
  
  inline def apply(): AutoTerminationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTerminationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTerminationPolicy] (val x: Self) extends AnyVal {
    
    inline def setIdleTimeout(value: Long): Self = StObject.set(x, "IdleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "IdleTimeout", js.undefined)
  }
}
