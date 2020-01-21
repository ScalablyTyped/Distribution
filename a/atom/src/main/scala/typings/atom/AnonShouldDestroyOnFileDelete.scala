package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShouldDestroyOnFileDelete extends js.Object {
  /**
    *  A function that returns a Boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** The initial string text of the buffer. */
  var text: js.UndefOr[String] = js.undefined
}

object AnonShouldDestroyOnFileDelete {
  @scala.inline
  def apply(shouldDestroyOnFileDelete: () => Boolean = null, text: String = null): AnonShouldDestroyOnFileDelete = {
    val __obj = js.Dynamic.literal()
    if (shouldDestroyOnFileDelete != null) __obj.updateDynamic("shouldDestroyOnFileDelete")(js.Any.fromFunction0(shouldDestroyOnFileDelete))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldDestroyOnFileDelete]
  }
}

