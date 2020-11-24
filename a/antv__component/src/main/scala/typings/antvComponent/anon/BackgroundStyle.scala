package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundStyle extends js.Object {
  
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
  implicit class BackgroundStyleOps[Self <: BackgroundStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundStyle(value: FillStringOpacityNumber): Self = this.set("backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundStyle(value: CursorFill): Self = this.set("foregroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerStyle(value: Width): Self = this.set("handlerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: OpacityTextBaseline): Self = this.set("textStyle", value.asInstanceOf[js.Any])
  }
}
