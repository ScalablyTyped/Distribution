package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigninDelegateGroup extends js.Object {
  
  /**
    * The group name.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.native
}
object SigninDelegateGroup {
  
  @scala.inline
  def apply(): SigninDelegateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigninDelegateGroup]
  }
  
  @scala.inline
  implicit class SigninDelegateGroupOps[Self <: SigninDelegateGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: NonEmptyString): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}
