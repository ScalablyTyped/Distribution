package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var align: Overflow
  
  var placement: String
  
  var prefixCls: String
  
  var trigger: js.Array[String]
}
object Placement {
  
  inline def apply(align: Overflow, placement: String, prefixCls: String, trigger: js.Array[String]): Placement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setAlign(value: Overflow): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: js.Array[String]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerVarargs(value: String*): Self = StObject.set(x, "trigger", js.Array(value :_*))
  }
}
