package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundStyle extends StObject {
  
  var backgroundStyle: FillStringOpacityNumber
  
  var foregroundStyle: CursorFill
  
  var handlerStyle: HeightWidth
  
  var textStyle: OpacityTextBaseline
}
object BackgroundStyle {
  
  inline def apply(
    backgroundStyle: FillStringOpacityNumber,
    foregroundStyle: CursorFill,
    handlerStyle: HeightWidth,
    textStyle: OpacityTextBaseline
  ): BackgroundStyle = {
    val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], foregroundStyle = foregroundStyle.asInstanceOf[js.Any], handlerStyle = handlerStyle.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundStyle(value: FillStringOpacityNumber): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundStyle(value: CursorFill): Self = StObject.set(x, "foregroundStyle", value.asInstanceOf[js.Any])
    
    inline def setHandlerStyle(value: HeightWidth): Self = StObject.set(x, "handlerStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: OpacityTextBaseline): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
  }
}
