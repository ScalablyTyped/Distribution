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

