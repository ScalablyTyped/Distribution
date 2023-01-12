package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleEventConfiguration extends StObject {
  
  /**
    * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
    */
  var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined
}
object LifecycleEventConfiguration {
  
  inline def apply(): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setShutdown(value: ShutdownEventConfiguration): Self = StObject.set(x, "Shutdown", value.asInstanceOf[js.Any])
    
    inline def setShutdownUndefined: Self = StObject.set(x, "Shutdown", js.undefined)
  }
}
