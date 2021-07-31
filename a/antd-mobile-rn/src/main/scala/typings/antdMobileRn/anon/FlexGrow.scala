package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGrow extends StObject {
  
  var alignItems: String
  
  var backgroundColor: String
  
  var flexDirection: String
  
  var flexGrow: Double
  
  var paddingLeft: Double
}
object FlexGrow {
  
  @scala.inline
  def apply(
    alignItems: String,
    backgroundColor: String,
    flexDirection: String,
    flexGrow: Double,
    paddingLeft: Double
  ): FlexGrow = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrow]
  }
  
  @scala.inline
  implicit class FlexGrowMutableBuilder[Self <: FlexGrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
  }
}
