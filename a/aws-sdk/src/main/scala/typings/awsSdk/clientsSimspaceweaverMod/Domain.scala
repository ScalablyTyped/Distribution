package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /**
    * The type of lifecycle management for apps in the domain. Indicates whether apps in this domain are managed (SimSpace Weaver starts and stops the apps) or unmanaged (you must start and stop the apps).  Lifecycle types     PerWorker – Managed: SimSpace Weaver starts one app on each worker.    BySpatialSubdivision – Managed: SimSpace Weaver starts one app for each spatial partition.    ByRequest – Unmanaged: You use the StartApp API to start the apps and use the StopApp API to stop the apps.  
    */
  var Lifecycle: js.UndefOr[LifecycleManagementStrategy] = js.undefined
  
  /**
    * The name of the domain.
    */
  var Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    inline def setLifecycle(value: LifecycleManagementStrategy): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setName(value: SimSpaceWeaverResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
