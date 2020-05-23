package typings.atom.mod

import typings.atom.anon.ClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorComponent extends js.Object {
  def pixelPositionForMouseEvent(event: ClientX): PixelPosition
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition
  def screenPositionForMouseEvent(event: ClientX): Point
  def screenPositionForPixelPosition(pos: PixelPosition): Point
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
}

