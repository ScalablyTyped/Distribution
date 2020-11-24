package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsOverrideDetails extends js.Object {
  
  var claimsOverrideDetails: ClaimsToSuppress = js.native
}
object ClaimsOverrideDetails {
  
  @scala.inline
  def apply(claimsOverrideDetails: ClaimsToSuppress): ClaimsOverrideDetails = {
    val __obj = js.Dynamic.literal(claimsOverrideDetails = claimsOverrideDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimsOverrideDetails]
  }
  
  @scala.inline
  implicit class ClaimsOverrideDetailsOps[Self <: ClaimsOverrideDetails] (val x: Self) extends AnyVal {
    
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
    def setClaimsOverrideDetails(value: ClaimsToSuppress): Self = this.set("claimsOverrideDetails", value.asInstanceOf[js.Any])
  }
}
