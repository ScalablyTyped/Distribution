package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lifecycle extends StObject {
  
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays.
    */
  var DeleteAfterDays: js.UndefOr[Long_] = js.undefined
  
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long_] = js.undefined
}
object Lifecycle {
  
  @scala.inline
  def apply(): Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycle]
  }
  
  @scala.inline
  implicit class LifecycleMutableBuilder[Self <: Lifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteAfterDays(value: Long_): Self = StObject.set(x, "DeleteAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAfterDaysUndefined: Self = StObject.set(x, "DeleteAfterDays", js.undefined)
    
    @scala.inline
    def setMoveToColdStorageAfterDays(value: Long_): Self = StObject.set(x, "MoveToColdStorageAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToColdStorageAfterDaysUndefined: Self = StObject.set(x, "MoveToColdStorageAfterDays", js.undefined)
  }
}
