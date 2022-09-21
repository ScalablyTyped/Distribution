package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedLifecycle extends StObject {
  
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[js.Date] = js.undefined
}
object CalculatedLifecycle {
  
  inline def apply(): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedLifecycle]
  }
  
  extension [Self <: CalculatedLifecycle](x: Self) {
    
    inline def setDeleteAt(value: js.Date): Self = StObject.set(x, "DeleteAt", value.asInstanceOf[js.Any])
    
    inline def setDeleteAtUndefined: Self = StObject.set(x, "DeleteAt", js.undefined)
    
    inline def setMoveToColdStorageAt(value: js.Date): Self = StObject.set(x, "MoveToColdStorageAt", value.asInstanceOf[js.Any])
    
    inline def setMoveToColdStorageAtUndefined: Self = StObject.set(x, "MoveToColdStorageAt", js.undefined)
  }
}
