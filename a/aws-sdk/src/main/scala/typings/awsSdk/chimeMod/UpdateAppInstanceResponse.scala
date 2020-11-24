package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppInstanceResponse extends js.Object {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
}
object UpdateAppInstanceResponse {
  
  @scala.inline
  def apply(): UpdateAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppInstanceResponse]
  }
  
  @scala.inline
  implicit class UpdateAppInstanceResponseOps[Self <: UpdateAppInstanceResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceArn: Self = this.set("AppInstanceArn", js.undefined)
  }
}
