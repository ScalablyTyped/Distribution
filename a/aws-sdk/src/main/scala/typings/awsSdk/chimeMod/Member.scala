package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends js.Object {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The member email address.
    */
  var Email: js.UndefOr[SensitiveString] = js.native
  
  /**
    * The member name.
    */
  var FullName: js.UndefOr[SensitiveString] = js.native
  
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The member type.
    */
  var MemberType: js.UndefOr[typings.awsSdk.chimeMod.MemberType] = js.native
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: SensitiveString): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setFullName(value: SensitiveString): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("FullName", js.undefined)
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
    
    @scala.inline
    def setMemberType(value: MemberType): Self = this.set("MemberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberType: Self = this.set("MemberType", js.undefined)
  }
}
