package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedLifecycle extends StObject {
  
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[timestamp] = js.undefined
  
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[timestamp] = js.undefined
}
object CalculatedLifecycle {
  
  @scala.inline
  def apply(): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedLifecycle]
  }
  
  @scala.inline
  implicit class CalculatedLifecycleMutableBuilder[Self <: CalculatedLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteAt(value: timestamp): Self = StObject.set(x, "DeleteAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAtUndefined: Self = StObject.set(x, "DeleteAt", js.undefined)
    
    @scala.inline
    def setMoveToColdStorageAt(value: timestamp): Self = StObject.set(x, "MoveToColdStorageAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToColdStorageAtUndefined: Self = StObject.set(x, "MoveToColdStorageAt", js.undefined)
  }
}
