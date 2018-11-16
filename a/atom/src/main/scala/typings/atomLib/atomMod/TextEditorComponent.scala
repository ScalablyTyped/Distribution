package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextEditorComponent extends js.Object {
  def pixelPositionForMouseEvent(event: atomLib.Anon_ClientY): PixelPosition
  /** Does not clip screenPosition, unlike similar method on TextEditorElement */
  def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition
  def screenPositionForMouseEvent(event: atomLib.Anon_ClientY): Point
  def screenPositionForPixelPosition(pos: PixelPosition): Point
}

