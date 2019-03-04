package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorComponent extends js.Object {
  def pixelPositionForMouseEvent(event: atomLib.Anon_ClientX): PixelPosition
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition
  def screenPositionForMouseEvent(event: atomLib.Anon_ClientX): Point
  def screenPositionForPixelPosition(pos: PixelPosition): Point
}

object TextEditorComponent {
  @scala.inline
  def apply(
    pixelPositionForMouseEvent: js.Function1[atomLib.Anon_ClientX, PixelPosition],
    pixelPositionForScreenPosition: js.Function1[PointLike, PixelPosition],
    screenPositionForMouseEvent: js.Function1[atomLib.Anon_ClientX, Point],
    screenPositionForPixelPosition: js.Function1[PixelPosition, Point]
  ): TextEditorComponent = {
    val __obj = js.Dynamic.literal(pixelPositionForMouseEvent = pixelPositionForMouseEvent, pixelPositionForScreenPosition = pixelPositionForScreenPosition, screenPositionForMouseEvent = screenPositionForMouseEvent, screenPositionForPixelPosition = screenPositionForPixelPosition)
  
    __obj.asInstanceOf[TextEditorComponent]
  }
}

