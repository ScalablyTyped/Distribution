package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleInfo extends js.Object {
  
  var ModuleObject: XInterface = js.native
  
  var ModuleType: Double = js.native
}
object ModuleInfo {
  
  @scala.inline
  def apply(ModuleObject: XInterface, ModuleType: Double): ModuleInfo = {
    val __obj = js.Dynamic.literal(ModuleObject = ModuleObject.asInstanceOf[js.Any], ModuleType = ModuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
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
    def setModuleObject(value: XInterface): Self = this.set("ModuleObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleType(value: Double): Self = this.set("ModuleType", value.asInstanceOf[js.Any])
  }
}
