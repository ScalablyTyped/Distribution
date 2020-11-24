package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceUserSummary extends js.Object {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The metadata in an app instance user summary.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The name in an app instance user summary.
    */
  var Name: js.UndefOr[UserName] = js.native
}
object AppInstanceUserSummary {
  
  @scala.inline
  def apply(): AppInstanceUserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserSummary]
  }
  
  @scala.inline
  implicit class AppInstanceUserSummaryOps[Self <: AppInstanceUserSummary] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceUserArn(value: ChimeArn): Self = this.set("AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceUserArn: Self = this.set("AppInstanceUserArn", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setName(value: UserName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
