package typings.argparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubArgumentParserOptions extends ArgumentParserOptions {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var help: js.UndefOr[String] = js.native
}
object SubArgumentParserOptions {
  
  @scala.inline
  def apply(): SubArgumentParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubArgumentParserOptions]
  }
  
  @scala.inline
  implicit class SubArgumentParserOptionsOps[Self <: SubArgumentParserOptions] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
  }
}
