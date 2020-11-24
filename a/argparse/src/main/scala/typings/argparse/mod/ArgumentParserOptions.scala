package typings.argparse.mod

import typings.argparse.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgumentParserOptions extends js.Object {
  
  var add_help: js.UndefOr[Boolean] = js.native
  
  var argument_default: js.UndefOr[js.Any] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var epilog: js.UndefOr[String] = js.native
  
  var exit_on_error: js.UndefOr[Boolean] = js.native
  
  var formatter_class: js.UndefOr[`0`] = js.native
  
  var parents: js.UndefOr[js.Array[ArgumentParser]] = js.native
  
  var prefix_chars: js.UndefOr[String] = js.native
  
  var prog: js.UndefOr[String] = js.native
  
  var usage: js.UndefOr[String] = js.native
}
object ArgumentParserOptions {
  
  @scala.inline
  def apply(): ArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentParserOptions]
  }
  
  @scala.inline
  implicit class ArgumentParserOptionsOps[Self <: ArgumentParserOptions] (val x: Self) extends AnyVal {
    
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
    def setAdd_help(value: Boolean): Self = this.set("add_help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd_help: Self = this.set("add_help", js.undefined)
    
    @scala.inline
    def setArgument_default(value: js.Any): Self = this.set("argument_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument_default: Self = this.set("argument_default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEpilog(value: String): Self = this.set("epilog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpilog: Self = this.set("epilog", js.undefined)
    
    @scala.inline
    def setExit_on_error(value: Boolean): Self = this.set("exit_on_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit_on_error: Self = this.set("exit_on_error", js.undefined)
    
    @scala.inline
    def setFormatter_class(value: `0`): Self = this.set("formatter_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter_class: Self = this.set("formatter_class", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: ArgumentParser*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[ArgumentParser]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setPrefix_chars(value: String): Self = this.set("prefix_chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix_chars: Self = this.set("prefix_chars", js.undefined)
    
    @scala.inline
    def setProg(value: String): Self = this.set("prog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProg: Self = this.set("prog", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
