package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveRulesOptions extends js.Object {
  
  /**
    * If the existing rules should be removed.
    */
  val clearExistingRules: js.UndefOr[Boolean] = js.native
  
  /**
    * If the saved rules should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.native
}
object SaveRulesOptions {
  
  @scala.inline
  def apply(): SaveRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveRulesOptions]
  }
  
  @scala.inline
  implicit class SaveRulesOptionsOps[Self <: SaveRulesOptions] (val x: Self) extends AnyVal {
    
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
    def setClearExistingRules(value: Boolean): Self = this.set("clearExistingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearExistingRules: Self = this.set("clearExistingRules", js.undefined)
    
    @scala.inline
    def setForwardToReplicas(value: Boolean): Self = this.set("forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardToReplicas: Self = this.set("forwardToReplicas", js.undefined)
  }
}
