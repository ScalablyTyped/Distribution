package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculatedLifecycle extends js.Object {
  
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[timestamp] = js.native
  
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[timestamp] = js.native
}
object CalculatedLifecycle {
  
  @scala.inline
  def apply(): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculatedLifecycle]
  }
  
  @scala.inline
  implicit class CalculatedLifecycleOps[Self <: CalculatedLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeleteAt(value: timestamp): Self = this.set("DeleteAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAt: Self = this.set("DeleteAt", js.undefined)
    
    @scala.inline
    def setMoveToColdStorageAt(value: timestamp): Self = this.set("MoveToColdStorageAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveToColdStorageAt: Self = this.set("MoveToColdStorageAt", js.undefined)
  }
}
