package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigninDelegateGroup extends StObject {
  
  /**
    * The group name.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
}
object SigninDelegateGroup {
  
  @scala.inline
  def apply(): SigninDelegateGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigninDelegateGroup]
  }
  
  @scala.inline
  implicit class SigninDelegateGroupMutableBuilder[Self <: SigninDelegateGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
