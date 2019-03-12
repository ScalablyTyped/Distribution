package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShouldDestroyOnFileDelete extends js.Object {
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** The initial string text of the buffer. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ShouldDestroyOnFileDelete {
  @scala.inline
  def apply(shouldDestroyOnFileDelete: () => scala.Boolean = null, text: java.lang.String = null): Anon_ShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    if (shouldDestroyOnFileDelete != null) __obj.updateDynamic("shouldDestroyOnFileDelete")(js.Any.fromFunction0(shouldDestroyOnFileDelete))
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_ShouldDestroyOnFileDelete]
  }
}

