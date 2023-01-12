package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSyncStatusOutput extends StObject {
  
  /**
    * The template sync desired state that's returned by Proton.
    */
  var desiredState: js.UndefOr[Revision] = js.undefined
  
  /**
    * The details of the last successful sync that's returned by Proton.
    */
  var latestSuccessfulSync: js.UndefOr[ResourceSyncAttempt] = js.undefined
  
  /**
    * The details of the last sync that's returned by Proton.
    */
  var latestSync: js.UndefOr[ResourceSyncAttempt] = js.undefined
}
object GetTemplateSyncStatusOutput {
  
  inline def apply(): GetTemplateSyncStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSyncStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateSyncStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setDesiredState(value: Revision): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setLatestSuccessfulSync(value: ResourceSyncAttempt): Self = StObject.set(x, "latestSuccessfulSync", value.asInstanceOf[js.Any])
    
    inline def setLatestSuccessfulSyncUndefined: Self = StObject.set(x, "latestSuccessfulSync", js.undefined)
    
    inline def setLatestSync(value: ResourceSyncAttempt): Self = StObject.set(x, "latestSync", value.asInstanceOf[js.Any])
    
    inline def setLatestSyncUndefined: Self = StObject.set(x, "latestSync", js.undefined)
  }
}
