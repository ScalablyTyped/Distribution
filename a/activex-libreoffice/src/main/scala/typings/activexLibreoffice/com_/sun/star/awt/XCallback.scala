package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an interface which can be used to call back an implementation */
trait XCallback extends js.Object {
  /**
    * notifies the callback implementation
    * @param aData private data which was provided when the callback was requested.
    */
  def notify(aData: js.Any): Unit
}

object XCallback {
  @scala.inline
  def apply(notify: js.Any => Unit): XCallback = {
    val __obj = js.Dynamic.literal(notify = js.Any.fromFunction1(notify))
    __obj.asInstanceOf[XCallback]
  }
}

