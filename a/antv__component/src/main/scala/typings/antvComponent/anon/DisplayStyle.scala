package typings.antvComponent.anon

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayStyle extends StObject {
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object DisplayStyle {
  
  @scala.inline
  def apply(): DisplayStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayStyle]
  }
  
  @scala.inline
  implicit class DisplayStyleMutableBuilder[Self <: DisplayStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
