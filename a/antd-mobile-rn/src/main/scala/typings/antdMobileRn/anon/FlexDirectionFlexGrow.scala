package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexDirectionFlexGrow extends StObject {
  
  var flexDirection: String = js.native
  
  var flexGrow: Double = js.native
}
object FlexDirectionFlexGrow {
  
  @scala.inline
  def apply(flexDirection: String, flexGrow: Double): FlexDirectionFlexGrow = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionFlexGrow]
  }
  
  @scala.inline
  implicit class FlexDirectionFlexGrowMutableBuilder[Self <: FlexDirectionFlexGrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
  }
}
