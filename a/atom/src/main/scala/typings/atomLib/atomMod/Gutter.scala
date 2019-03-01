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

object Gutter {
  @scala.inline
  def apply(
    decorateMarker: js.Function2[DisplayMarker, DecorationOptions, Decoration],
    destroy: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    isVisible: js.Function0[scala.Boolean],
    onDidChangeVisible: js.Function1[js.Function1[Gutter, scala.Unit], Disposable],
    onDidDestroy: js.Function1[js.Function0[scala.Unit], Disposable],
    show: js.Function0[scala.Unit]
  ): Gutter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decorateMarker")(decorateMarker)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("onDidChangeVisible")(onDidChangeVisible)
    __obj.updateDynamic("onDidDestroy")(onDidDestroy)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Gutter]
  }
}

