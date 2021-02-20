package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends StObject {
  
  var align: Overflow = js.native
  
  var placement: String = js.native
  
  var prefixCls: String = js.native
  
  var trigger: js.Array[String] = js.native
}
object Placement {
  
  @scala.inline
  def apply(align: Overflow, placement: String, prefixCls: String, trigger: js.Array[String]): Placement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementMutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Overflow): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: js.Array[String]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerVarargs(value: String*): Self = StObject.set(x, "trigger", js.Array(value :_*))
  }
}
