package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsToAddOrOverride extends js.Object {
  
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.native
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  
  var groupOverrideDetails: js.UndefOr[Null | GroupsToOverride] = js.native
}
object ClaimsToAddOrOverride {
  
  @scala.inline
  def apply(): ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToAddOrOverride]
  }
  
  @scala.inline
  implicit class ClaimsToAddOrOverrideOps[Self <: ClaimsToAddOrOverride] (val x: Self) extends AnyVal {
    
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
    def setClaimsToAddOrOverride(value: StringDictionary[String]): Self = this.set("claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsToAddOrOverride: Self = this.set("claimsToAddOrOverride", js.undefined)
    
    @scala.inline
    def setClaimsToSuppressVarargs(value: String*): Self = this.set("claimsToSuppress", js.Array(value :_*))
    
    @scala.inline
    def setClaimsToSuppress(value: js.Array[String]): Self = this.set("claimsToSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsToSuppress: Self = this.set("claimsToSuppress", js.undefined)
    
    @scala.inline
    def setGroupOverrideDetails(value: GroupsToOverride): Self = this.set("groupOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOverrideDetails: Self = this.set("groupOverrideDetails", js.undefined)
    
    @scala.inline
    def setGroupOverrideDetailsNull: Self = this.set("groupOverrideDetails", null)
  }
}
