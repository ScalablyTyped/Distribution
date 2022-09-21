package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionOption extends StObject {
  
  /**
    * @title 交互配置
    */
  var cfg: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title 交互名称
    */
  var `type`: String
}
object InteractionOption {
  
  inline def apply(`type`: String): InteractionOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionOption]
  }
  
  extension [Self <: InteractionOption](x: Self) {
    
    inline def setCfg(value: LooseObject): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
