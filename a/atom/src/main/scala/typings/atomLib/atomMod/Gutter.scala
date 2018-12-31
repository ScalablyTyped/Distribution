package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gutter extends js.Object {
  /**
    *  Add a decoration that tracks a DisplayMarker. When the marker moves, is
    *  invalidated, or is destroyed, the decoration will be updated to reflect
    *  the marker's state.
    */
  def decorateMarker(marker: DisplayMarker, decorationParams: DecorationOptions): Decoration
  // Gutter Destruction
  /** Destroys the gutter. */
  def destroy(): scala.Unit
  // Visibility
  /** Hide the gutter. */
  def hide(): scala.Unit
  /** Determine whether the gutter is visible. */
  def isVisible(): scala.Boolean
  // Event Subscription
  /** Calls your callback when the gutter's visibility changes. */
  def onDidChangeVisible(callback: js.Function1[/* gutter */ this.type, scala.Unit]): Disposable
  /** Calls your callback when the gutter is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): Disposable
  /** Show the gutter. */
  def show(): scala.Unit
}

