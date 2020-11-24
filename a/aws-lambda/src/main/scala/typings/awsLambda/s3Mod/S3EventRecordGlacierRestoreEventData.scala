package typings.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3EventRecordGlacierRestoreEventData extends js.Object {
  
  var lifecycleRestorationExpiryTime: String = js.native
  
  var lifecycleRestoreStorageClass: String = js.native
}
object S3EventRecordGlacierRestoreEventData {
  
  @scala.inline
  def apply(lifecycleRestorationExpiryTime: String, lifecycleRestoreStorageClass: String): S3EventRecordGlacierRestoreEventData = {
    val __obj = js.Dynamic.literal(lifecycleRestorationExpiryTime = lifecycleRestorationExpiryTime.asInstanceOf[js.Any], lifecycleRestoreStorageClass = lifecycleRestoreStorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecordGlacierRestoreEventData]
  }
  
  @scala.inline
  implicit class S3EventRecordGlacierRestoreEventDataOps[Self <: S3EventRecordGlacierRestoreEventData] (val x: Self) extends AnyVal {
    
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
    def setLifecycleRestorationExpiryTime(value: String): Self = this.set("lifecycleRestorationExpiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleRestoreStorageClass(value: String): Self = this.set("lifecycleRestoreStorageClass", value.asInstanceOf[js.Any])
  }
}
