package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The member email address.
    */
  var Email: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The member name.
    */
  var FullName: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The member type.
    */
  var MemberType: js.UndefOr[typings.awsSdk.chimeMod.MemberType] = js.undefined
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setEmail(value: SensitiveString): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setFullName(value: SensitiveString): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "FullName", js.undefined)
    
    @scala.inline
    def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    @scala.inline
    def setMemberType(value: MemberType): Self = StObject.set(x, "MemberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypeUndefined: Self = StObject.set(x, "MemberType", js.undefined)
  }
}
