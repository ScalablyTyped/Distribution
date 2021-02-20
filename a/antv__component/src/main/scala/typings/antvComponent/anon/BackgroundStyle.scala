package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundStyle extends StObject {
  
  var backgroundStyle: FillStringOpacityNumber = js.native
  
  var foregroundStyle: CursorFill = js.native
  
  var handlerStyle: Width = js.native
  
  var textStyle: OpacityTextBaseline = js.native
}
object BackgroundStyle {
  
  @scala.inline
  def apply(
    backgroundStyle: FillStringOpacityNumber,
    foregroundStyle: CursorFill,
    handlerStyle: Width,
    textStyle: OpacityTextBaseline
  ): BackgroundStyle = {
    val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], foregroundStyle = foregroundStyle.asInstanceOf[js.Any], handlerStyle = handlerStyle.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundStyle]
  }
  
  @scala.inline
  implicit class BackgroundStyleMutableBuilder[Self <: BackgroundStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundStyle(value: FillStringOpacityNumber): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundStyle(value: CursorFill): Self = StObject.set(x, "foregroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerStyle(value: Width): Self = StObject.set(x, "handlerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: OpacityTextBaseline): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
  }
}
