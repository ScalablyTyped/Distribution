package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAppInstanceResponse extends js.Object {
  
  /**
    * The ARN, metadata, created and last-updated timestamps, and the name of the app instance. All timestamps use epoch milliseconds.
    */
  var AppInstance: js.UndefOr[typings.awsSdk.chimeMod.AppInstance] = js.native
}
object DescribeAppInstanceResponse {
  
  @scala.inline
  def apply(): DescribeAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceResponse]
  }
  
  @scala.inline
  implicit class DescribeAppInstanceResponseOps[Self <: DescribeAppInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppInstance(value: AppInstance): Self = this.set("AppInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstance: Self = this.set("AppInstance", js.undefined)
  }
}
