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
    getStyleElements: js.Function0[js.Array[stdLib.HTMLStyleElement]],
    getUserStyleSheetPath: js.Function0[java.lang.String],
    observeStyleElements: js.Function1[js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit], Disposable],
    onDidAddStyleElement: js.Function1[js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit], Disposable],
    onDidRemoveStyleElement: js.Function1[js.Function1[/* styleElement */ stdLib.HTMLStyleElement, scala.Unit], Disposable],
    onDidUpdateStyleElement: js.Function1[js.Function1[/* styleElement */ StyleElementObservedEvent, scala.Unit], Disposable]
  ): StyleManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStyleElements")(getStyleElements)
    __obj.updateDynamic("getUserStyleSheetPath")(getUserStyleSheetPath)
    __obj.updateDynamic("observeStyleElements")(observeStyleElements)
    __obj.updateDynamic("onDidAddStyleElement")(onDidAddStyleElement)
    __obj.updateDynamic("onDidRemoveStyleElement")(onDidRemoveStyleElement)
    __obj.updateDynamic("onDidUpdateStyleElement")(onDidUpdateStyleElement)
    __obj.asInstanceOf[StyleManager]
  }
}

