package typings.atom.mod

import typings.atom.anon.ClientX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorComponent extends StObject {
  
  def pixelPositionForMouseEvent(event: ClientX): PixelPosition
  
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition
  
  def screenPositionForMouseEvent(event: ClientX): Point
  
  def screenPositionForPixelPosition(pos: PixelPosition): Point
}
object TextEditorComponent {
  
  inline def apply(
    pixelPositionForMouseEvent: ClientX => PixelPosition,
    pixelPositionForScreenPosition: PointLike => PixelPosition,
    screenPositionForMouseEvent: ClientX => Point,
    screenPositionForPixelPosition: PixelPosition => Point
  ): TextEditorComponent = {
    val __obj = js.Dynamic.literal(pixelPositionForMouseEvent = js.Any.fromFunction1(pixelPositionForMouseEvent), pixelPositionForScreenPosition = js.Any.fromFunction1(pixelPositionForScreenPosition), screenPositionForMouseEvent = js.Any.fromFunction1(screenPositionForMouseEvent), screenPositionForPixelPosition = js.Any.fromFunction1(screenPositionForPixelPosition))
    __obj.asInstanceOf[TextEditorComponent]
  }
  
  extension [Self <: TextEditorComponent](x: Self) {
    
    inline def setPixelPositionForMouseEvent(value: ClientX => PixelPosition): Self = StObject.set(x, "pixelPositionForMouseEvent", js.Any.fromFunction1(value))
    
    inline def setPixelPositionForScreenPosition(value: PointLike => PixelPosition): Self = StObject.set(x, "pixelPositionForScreenPosition", js.Any.fromFunction1(value))
    
    inline def setScreenPositionForMouseEvent(value: ClientX => Point): Self = StObject.set(x, "screenPositionForMouseEvent", js.Any.fromFunction1(value))
    
    inline def setScreenPositionForPixelPosition(value: PixelPosition => Point): Self = StObject.set(x, "screenPositionForPixelPosition", js.Any.fromFunction1(value))
  }
}
