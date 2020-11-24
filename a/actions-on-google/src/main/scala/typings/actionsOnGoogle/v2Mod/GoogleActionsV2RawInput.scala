package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2RawInput extends js.Object {
  
  /**
    * Indicates how the user provided this input: a typed response, a voice
    * response, unspecified, etc.
    */
  var inputType: js.UndefOr[GoogleActionsV2RawInputInputType] = js.native
  
  /**
    * Typed or spoken input from the end user.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The triggering URL.
    */
  var url: js.UndefOr[String] = js.native
}
object GoogleActionsV2RawInput {
  
  @scala.inline
  def apply(): GoogleActionsV2RawInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RawInput]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RawInputOps[Self <: GoogleActionsV2RawInput] (val x: Self) extends AnyVal {
    
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
    def setInputType(value: GoogleActionsV2RawInputInputType): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
