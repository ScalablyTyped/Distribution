package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleManager extends js.Object {
  // Reading Style Elements
  /** Get all loaded style elements. */
  def getStyleElements(): js.Array[stdLib.HTMLStyleElement]
  // Paths
  /** Get the path of the user style sheet in ~/.atom. */
  def getUserStyleSheetPath(): java.lang.String
  // Event Subscription
  /** Invoke callback for all current and future style elements. */
  def observeStyleElements(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit]): Disposable
  /** Invoke callback when a style element is added. */
  def onDidAddStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit]): Disposable
  /** Invoke callback when a style element is removed. */
  def onDidRemoveStyleElement(callback: js.Function1[/* styleElement */ stdLib.HTMLStyleElement, scala.Unit]): Disposable
  /** Invoke callback when an existing style element is updated. */
  def onDidUpdateStyleElement(callback: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit]): Disposable
}

object StyleManager {
  @scala.inline
  def apply(
    getStyleElements: () => js.Array[stdLib.HTMLStyleElement],
    getUserStyleSheetPath: () => java.lang.String,
    observeStyleElements: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit] => Disposable,
    onDidAddStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit] => Disposable,
    onDidRemoveStyleElement: js.Function1[/* styleElement */ stdLib.HTMLStyleElement, scala.Unit] => Disposable,
    onDidUpdateStyleElement: js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit] => Disposable
  ): StyleManager = {
    val __obj = js.Dynamic.literal(getStyleElements = js.Any.fromFunction0(getStyleElements), getUserStyleSheetPath = js.Any.fromFunction0(getUserStyleSheetPath), observeStyleElements = js.Any.fromFunction1(observeStyleElements), onDidAddStyleElement = js.Any.fromFunction1(onDidAddStyleElement), onDidRemoveStyleElement = js.Any.fromFunction1(onDidRemoveStyleElement), onDidUpdateStyleElement = js.Any.fromFunction1(onDidUpdateStyleElement))
  
    __obj.asInstanceOf[StyleManager]
  }
}

