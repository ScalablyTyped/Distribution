package typings.atom.mod

import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleManager extends StObject {
  
  // Reading Style Elements
  /** Get all loaded style elements. */
  def getStyleElements(): js.Array[HTMLStyleElement] = js.native
  
  // Paths
  /** Get the path of the user style sheet in ~/.atom. */
  def getUserStyleSheetPath(): String = js.native
  
  // Event Subscription
  /** Invoke callback for all current and future style elements. */
  def observeStyleElements(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
  
  /** Invoke callback when a style element is added. */
  def onDidAddStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
  
  /** Invoke callback when a style element is removed. */
  def onDidRemoveStyleElement(callback: js.Function1[/* styleElement */ HTMLStyleElement, Unit]): Disposable = js.native
  
  /** Invoke callback when an existing style element is updated. */
  def onDidUpdateStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit]): Disposable = js.native
}
object StyleManager {
  
  @scala.inline
  def apply(
    getStyleElements: () => js.Array[HTMLStyleElement],
    getUserStyleSheetPath: () => String,
    observeStyleElements: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
    onDidAddStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable,
    onDidRemoveStyleElement: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable,
    onDidUpdateStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable
  ): StyleManager = {
    val __obj = js.Dynamic.literal(getStyleElements = js.Any.fromFunction0(getStyleElements), getUserStyleSheetPath = js.Any.fromFunction0(getUserStyleSheetPath), observeStyleElements = js.Any.fromFunction1(observeStyleElements), onDidAddStyleElement = js.Any.fromFunction1(onDidAddStyleElement), onDidRemoveStyleElement = js.Any.fromFunction1(onDidRemoveStyleElement), onDidUpdateStyleElement = js.Any.fromFunction1(onDidUpdateStyleElement))
    __obj.asInstanceOf[StyleManager]
  }
  
  @scala.inline
  implicit class StyleManagerMutableBuilder[Self <: StyleManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStyleElements(value: () => js.Array[HTMLStyleElement]): Self = StObject.set(x, "getStyleElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserStyleSheetPath(value: () => String): Self = StObject.set(x, "getUserStyleSheetPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObserveStyleElements(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "observeStyleElements", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidAddStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidAddStyleElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidRemoveStyleElement(value: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable): Self = StObject.set(x, "onDidRemoveStyleElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidUpdateStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = StObject.set(x, "onDidUpdateStyleElement", js.Any.fromFunction1(value))
  }
}
