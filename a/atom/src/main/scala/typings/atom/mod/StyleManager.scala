package typings.atom.mod

import typings.std.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleManager extends js.Object {
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
  implicit class StyleManagerOps[Self <: StyleManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetStyleElements(value: () => js.Array[HTMLStyleElement]): Self = this.set("getStyleElements", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserStyleSheetPath(value: () => String): Self = this.set("getUserStyleSheetPath", js.Any.fromFunction0(value))
    @scala.inline
    def setObserveStyleElements(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = this.set("observeStyleElements", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidAddStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = this.set("onDidAddStyleElement", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidRemoveStyleElement(value: js.Function1[/* styleElement */ HTMLStyleElement, Unit] => Disposable): Self = this.set("onDidRemoveStyleElement", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDidUpdateStyleElement(value: js.Function1[/* styleElement */ StyleElementObservedEvent, Unit] => Disposable): Self = this.set("onDidUpdateStyleElement", js.Any.fromFunction1(value))
  }
  
}

