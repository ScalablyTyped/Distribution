package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gutter extends StObject {
  
  /**
    *  Add a decoration that tracks a DisplayMarker. When the marker moves, is
    *  invalidated, or is destroyed, the decoration will be updated to reflect
    *  the marker's state.
    */
  def decorateMarker(marker: DisplayMarker, decorationParams: DecorationOptions): Decoration = js.native
  
  // Gutter Destruction
  /** Destroys the gutter. */
  def destroy(): Unit = js.native
  
  // Visibility
  /** Hide the gutter. */
  def hide(): Unit = js.native
  
  /** Determine whether the gutter is visible. */
  def isVisible(): Boolean = js.native
  
  // Event Subscription
  /** Calls your callback when the gutter's visibility changes. */
  def onDidChangeVisible(callback: js.Function1[/* gutter */ this.type, Unit]): Disposable = js.native
  
  /** Calls your callback when the gutter is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  
  /** Show the gutter. */
  def show(): Unit = js.native
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
  
  @scala.inline
  implicit class GutterMutableBuilder[Self <: Gutter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorateMarker(value: (DisplayMarker, DecorationOptions) => Decoration): Self = StObject.set(x, "decorateMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDidChangeVisible(value: js.Function1[Gutter, Unit] => Disposable): Self = StObject.set(x, "onDidChangeVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDestroy(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
