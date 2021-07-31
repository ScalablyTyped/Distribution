package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flex extends StObject {
  
  var alignItems: String
  
  var flex: Double
  
  var flexDirection: String
}
object Flex {
  
  @scala.inline
  def apply(alignItems: String, flex: Double, flexDirection: String): Flex = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
  
  @scala.inline
  implicit class FlexMutableBuilder[Self <: Flex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
  }
}
