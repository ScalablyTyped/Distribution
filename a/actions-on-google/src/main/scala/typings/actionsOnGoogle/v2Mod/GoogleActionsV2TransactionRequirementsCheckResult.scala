package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  
  /**
    * Result of the operation.
    */
  var resultType: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResultResultType] = js.native
}
object GoogleActionsV2TransactionRequirementsCheckResult {
  
  @scala.inline
  def apply(): GoogleActionsV2TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckResult]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TransactionRequirementsCheckResultOps[Self <: GoogleActionsV2TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    
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
    def setResultType(value: GoogleActionsV2TransactionRequirementsCheckResultResultType): Self = this.set("resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
  }
}
