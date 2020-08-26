package typings.aphrodite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetTestUtilsStatic extends js.Object {
  /**
    * Opposite method of preventStyleInject.
    */
  def clearBufferAndResumeStyleInjection(): Unit = js.native
  /**
    * Returns a string of buffered styles which have not been flushed
    *
    * @returns {string}  Buffer of styles which have not yet been flushed.
    */
  def getBufferedStyles(): js.Array[String] = js.native
  /**
    * Prevent styles from being injected into the DOM.
    *
    * This is useful in situations where you'd like to test rendering UI
    * components which use Aphrodite without any of the side-effects of
    * Aphrodite happening. Particularly useful for testing the output of
    * components when you have no DOM, e.g. testing in Node without a fake DOM.
    *
    * Should be paired with a subsequent call to
    * clearBufferAndResumeStyleInjection.
    */
  def suppressStyleInjection(): Unit = js.native
}

object StyleSheetTestUtilsStatic {
  @scala.inline
  def apply(
    clearBufferAndResumeStyleInjection: () => Unit,
    getBufferedStyles: () => js.Array[String],
    suppressStyleInjection: () => Unit
  ): StyleSheetTestUtilsStatic = {
    val __obj = js.Dynamic.literal(clearBufferAndResumeStyleInjection = js.Any.fromFunction0(clearBufferAndResumeStyleInjection), getBufferedStyles = js.Any.fromFunction0(getBufferedStyles), suppressStyleInjection = js.Any.fromFunction0(suppressStyleInjection))
    __obj.asInstanceOf[StyleSheetTestUtilsStatic]
  }
  @scala.inline
  implicit class StyleSheetTestUtilsStaticOps[Self <: StyleSheetTestUtilsStatic] (val x: Self) extends AnyVal {
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
    def setClearBufferAndResumeStyleInjection(value: () => Unit): Self = this.set("clearBufferAndResumeStyleInjection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBufferedStyles(value: () => js.Array[String]): Self = this.set("getBufferedStyles", js.Any.fromFunction0(value))
    @scala.inline
    def setSuppressStyleInjection(value: () => Unit): Self = this.set("suppressStyleInjection", js.Any.fromFunction0(value))
  }
  
}

