package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentGroupOptions extends js.Object {
  
  var argument_default: js.UndefOr[js.Any] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var prefix_chars: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ArgumentGroupOptions {
  
  @scala.inline
  def apply(): ArgumentGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentGroupOptions]
  }
  
  @scala.inline
  implicit class ArgumentGroupOptionsOps[Self <: ArgumentGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setArgument_default(value: js.Any): Self = this.set("argument_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument_default: Self = this.set("argument_default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPrefix_chars(value: String): Self = this.set("prefix_chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix_chars: Self = this.set("prefix_chars", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
