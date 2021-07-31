package typings.antvComponent.anon

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayLength extends StObject {
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object DisplayLength {
  
  @scala.inline
  def apply(): DisplayLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayLength]
  }
  
  @scala.inline
  implicit class DisplayLengthMutableBuilder[Self <: DisplayLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
