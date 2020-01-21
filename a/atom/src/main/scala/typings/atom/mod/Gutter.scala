package typings.atom.mod

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
  def destroy(): Unit
  // Visibility
  /** Hide the gutter. */
  def hide(): Unit
  /** Determine whether the gutter is visible. */
  def isVisible(): Boolean
  // Event Subscription
  /** Calls your callback when the gutter's visibility changes. */
  def onDidChangeVisible(callback: js.Function1[/* gutter */ this.type, Unit]): Disposable
  /** Calls your callback when the gutter is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable
  /** Show the gutter. */
  def show(): Unit
}

object Gutter {
  @scala.inline
  def apply(
    decorateMarker: (DisplayMarker, DecorationOptions) => Decoration,
    destroy: () => Unit,
    hide: () => Unit,
    isVisible: () => Boolean,
    onDidChangeVisible: js.Function1[Gutter, Unit] => Disposable,
    onDidDestroy: js.Function0[Unit] => Disposable,
    show: () => Unit
  ): Gutter = {
    val __obj = js.Dynamic.literal(decorateMarker = js.Any.fromFunction2(decorateMarker), destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroy = js.Any.fromFunction1(onDidDestroy), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Gutter]
  }
}

