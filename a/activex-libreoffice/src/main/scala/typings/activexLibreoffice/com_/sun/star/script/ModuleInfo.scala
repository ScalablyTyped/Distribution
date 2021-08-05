package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleInfo extends StObject {
  
  var ModuleObject: XInterface
  
  var ModuleType: Double
}
object ModuleInfo {
  
  inline def apply(ModuleObject: XInterface, ModuleType: Double): ModuleInfo = {
    val __obj = js.Dynamic.literal(ModuleObject = ModuleObject.asInstanceOf[js.Any], ModuleType = ModuleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  
  extension [Self <: ModuleInfo](x: Self) {
    
    inline def setModuleObject(value: XInterface): Self = StObject.set(x, "ModuleObject", value.asInstanceOf[js.Any])
    
    inline def setModuleType(value: Double): Self = StObject.set(x, "ModuleType", value.asInstanceOf[js.Any])
  }
}
