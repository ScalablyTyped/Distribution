package typings.actionsOnGoogle.placeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceOptions extends js.Object {
  
  /**
    * This is the context for seeking permissions.
    * For example: "To find a place to pick you up"
    * Prompt to user: "*To find a place to pick you up*, I just need to check your location.
    *     Can I get that from Google?".
    * @public
    */
  var context: String = js.native
  
  /**
    * This is the initial response by location sub-dialog.
    * For example: "Where do you want to get picked up?"
    * @public
    */
  var prompt: String = js.native
}
object PlaceOptions {
  
  @scala.inline
  def apply(context: String, prompt: String): PlaceOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceOptions]
  }
  
  @scala.inline
  implicit class PlaceOptionsOps[Self <: PlaceOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
  }
}
