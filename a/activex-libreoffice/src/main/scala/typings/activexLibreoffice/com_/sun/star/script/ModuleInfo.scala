package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleInfo extends StObject {
  
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
  implicit class ModuleInfoMutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModuleObject(value: XInterface): Self = StObject.set(x, "ModuleObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleType(value: Double): Self = StObject.set(x, "ModuleType", value.asInstanceOf[js.Any])
  }
}
