package typings.argv.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait module extends js.Object {
  
  var description: String = js.native
  
  var mod: String = js.native
  
  var options: StringDictionary[helpOption] = js.native
}
object module {
  
  @scala.inline
  def apply(description: String, mod: String, options: StringDictionary[helpOption]): module = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[module]
  }
  
  @scala.inline
  implicit class moduleOps[Self <: module] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMod(value: String): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: StringDictionary[helpOption]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
