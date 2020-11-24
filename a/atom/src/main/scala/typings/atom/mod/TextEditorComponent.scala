package typings.atom.mod

import typings.atom.anon.ClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditorComponent extends js.Object {
  
  def pixelPositionForMouseEvent(event: ClientX): PixelPosition = js.native
  
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition = js.native
  
  def screenPositionForMouseEvent(event: ClientX): Point = js.native
  
  def screenPositionForPixelPosition(pos: PixelPosition): Point = js.native
}
object TextEditorComponent {
  
  @scala.inline
  def apply(
    pixelPositionForMouseEvent: ClientX => PixelPosition,
    pixelPositionForScreenPosition: PointLike => PixelPosition,
    screenPositionForMouseEvent: ClientX => Point,
    screenPositionForPixelPosition: PixelPosition => Point
  ): TextEditorComponent = {
    val __obj = js.Dynamic.literal(pixelPositionForMouseEvent = js.Any.fromFunction1(pixelPositionForMouseEvent), pixelPositionForScreenPosition = js.Any.fromFunction1(pixelPositionForScreenPosition), screenPositionForMouseEvent = js.Any.fromFunction1(screenPositionForMouseEvent), screenPositionForPixelPosition = js.Any.fromFunction1(screenPositionForPixelPosition))
    __obj.asInstanceOf[TextEditorComponent]
  }
  
  @scala.inline
  implicit class TextEditorComponentOps[Self <: TextEditorComponent] (val x: Self) extends AnyVal {
    
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
    def setPixelPositionForMouseEvent(value: ClientX => PixelPosition): Self = this.set("pixelPositionForMouseEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPixelPositionForScreenPosition(value: PointLike => PixelPosition): Self = this.set("pixelPositionForScreenPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenPositionForMouseEvent(value: ClientX => Point): Self = this.set("screenPositionForMouseEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScreenPositionForPixelPosition(value: PixelPosition => Point): Self = this.set("screenPositionForPixelPosition", js.Any.fromFunction1(value))
  }
}
