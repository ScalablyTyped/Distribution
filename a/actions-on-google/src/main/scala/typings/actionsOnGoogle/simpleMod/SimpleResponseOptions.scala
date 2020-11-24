package typings.actionsOnGoogle.simpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleResponseOptions extends js.Object {
  
  /**
    * Speech to be spoken to user. SSML allowed.
    * @public
    */
  var speech: String = js.native
  
  /**
    * Optional text to be shown to user
    * @public
    */
  var text: js.UndefOr[String] = js.native
}
object SimpleResponseOptions {
  
  @scala.inline
  def apply(speech: String): SimpleResponseOptions = {
    val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleResponseOptions]
  }
  
  @scala.inline
  implicit class SimpleResponseOptionsOps[Self <: SimpleResponseOptions] (val x: Self) extends AnyVal {
    
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
    def setSpeech(value: String): Self = this.set("speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
