package typings.activexLibreoffice.com_.sun.star.task

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to abort a command asynchronously. For example, have a look at {@link com.sun.star.deployment.XPackageManager} . */
trait XAbortChannel extends js.Object {
  /** sends an abort notification to all commands associated with this channel. */
  def sendAbort(): Unit
}

object XAbortChannel {
  @scala.inline
  def apply(sendAbort: () => Unit): XAbortChannel = {
    val __obj = js.Dynamic.literal(sendAbort = js.Any.fromFunction0(sendAbort))
    __obj.asInstanceOf[XAbortChannel]
  }
}

