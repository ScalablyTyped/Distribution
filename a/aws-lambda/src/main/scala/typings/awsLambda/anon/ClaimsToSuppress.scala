package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import typings.awsLambda.preTokenGenerationMod.GroupOverrideDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsToSuppress extends js.Object {
  
  var claimsToAddOrOverride: js.UndefOr[StringMap] = js.native
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  
  var groupOverrideDetails: js.UndefOr[GroupOverrideDetails] = js.native
}
object ClaimsToSuppress {
  
  @scala.inline
  def apply(): ClaimsToSuppress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToSuppress]
  }
  
  @scala.inline
  implicit class ClaimsToSuppressOps[Self <: ClaimsToSuppress] (val x: Self) extends AnyVal {
    
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
    def setClaimsToAddOrOverride(value: StringMap): Self = this.set("claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsToAddOrOverride: Self = this.set("claimsToAddOrOverride", js.undefined)
    
    @scala.inline
    def setClaimsToSuppressVarargs(value: String*): Self = this.set("claimsToSuppress", js.Array(value :_*))
    
    @scala.inline
    def setClaimsToSuppress(value: js.Array[String]): Self = this.set("claimsToSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimsToSuppress: Self = this.set("claimsToSuppress", js.undefined)
    
    @scala.inline
    def setGroupOverrideDetails(value: GroupOverrideDetails): Self = this.set("groupOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupOverrideDetails: Self = this.set("groupOverrideDetails", js.undefined)
  }
}
