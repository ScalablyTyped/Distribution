package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSettingsOptions extends js.Object {
  
  /**
    * If the saved settings should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.native
}
object SetSettingsOptions {
  
  @scala.inline
  def apply(): SetSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSettingsOptions]
  }
  
  @scala.inline
  implicit class SetSettingsOptionsOps[Self <: SetSettingsOptions] (val x: Self) extends AnyVal {
    
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
    def setForwardToReplicas(value: Boolean): Self = this.set("forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardToReplicas: Self = this.set("forwardToReplicas", js.undefined)
  }
}
