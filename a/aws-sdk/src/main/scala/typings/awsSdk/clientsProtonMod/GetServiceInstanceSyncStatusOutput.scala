package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceInstanceSyncStatusOutput extends StObject {
  
  /**
    * The service instance sync desired state that's returned by Proton
    */
  var desiredState: js.UndefOr[Revision] = js.undefined
  
  /**
    * The detailed data of the latest successful sync with the service instance.
    */
  var latestSuccessfulSync: js.UndefOr[ResourceSyncAttempt] = js.undefined
  
  /**
    * The detailed data of the latest sync with the service instance.
    */
  var latestSync: js.UndefOr[ResourceSyncAttempt] = js.undefined
}
object GetServiceInstanceSyncStatusOutput {
  
  inline def apply(): GetServiceInstanceSyncStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceInstanceSyncStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceInstanceSyncStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setDesiredState(value: Revision): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setLatestSuccessfulSync(value: ResourceSyncAttempt): Self = StObject.set(x, "latestSuccessfulSync", value.asInstanceOf[js.Any])
    
    inline def setLatestSuccessfulSyncUndefined: Self = StObject.set(x, "latestSuccessfulSync", js.undefined)
    
    inline def setLatestSync(value: ResourceSyncAttempt): Self = StObject.set(x, "latestSync", value.asInstanceOf[js.Any])
    
    inline def setLatestSyncUndefined: Self = StObject.set(x, "latestSync", js.undefined)
  }
}
