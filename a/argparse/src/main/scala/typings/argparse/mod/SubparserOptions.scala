package typings.argparse.mod

import typings.argparse.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubparserOptions extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dest: js.UndefOr[String] = js.native
  
  var help: js.UndefOr[String] = js.native
  
  var metavar: js.UndefOr[String] = js.native
  
  var parser_class: js.UndefOr[Instantiable] = js.native
  
  var prog: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SubparserOptions {
  
  @scala.inline
  def apply(): SubparserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubparserOptions]
  }
  
  @scala.inline
  implicit class SubparserOptionsOps[Self <: SubparserOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setMetavar(value: String): Self = this.set("metavar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetavar: Self = this.set("metavar", js.undefined)
    
    @scala.inline
    def setParser_class(value: Instantiable): Self = this.set("parser_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser_class: Self = this.set("parser_class", js.undefined)
    
    @scala.inline
    def setProg(value: String): Self = this.set("prog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProg: Self = this.set("prog", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
