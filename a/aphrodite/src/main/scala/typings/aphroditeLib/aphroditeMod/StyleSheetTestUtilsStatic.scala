package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetTestUtilsStatic extends js.Object {
  /**
    * Opposite method of preventStyleInject.
    */
  def clearBufferAndResumeStyleInjection(): scala.Unit
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
  def suppressStyleInjection(): scala.Unit
}

object StyleSheetTestUtilsStatic {
  @scala.inline
  def apply(clearBufferAndResumeStyleInjection: () => scala.Unit, suppressStyleInjection: () => scala.Unit): StyleSheetTestUtilsStatic = {
    val __obj = js.Dynamic.literal(clearBufferAndResumeStyleInjection = js.Any.fromFunction0(clearBufferAndResumeStyleInjection), suppressStyleInjection = js.Any.fromFunction0(suppressStyleInjection))
  
    __obj.asInstanceOf[StyleSheetTestUtilsStatic]
  }
}

