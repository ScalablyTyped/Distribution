package typings.activexLibreoffice.com_.sun.star.task

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to abort a command asynchronously. For example, have a look at {@link com.sun.star.deployment.XPackageManager} . */
@js.native
trait XAbortChannel extends js.Object {
  /** sends an abort notification to all commands associated with this channel. */
  def sendAbort(): Unit = js.native
}

object XAbortChannel {
  @scala.inline
  def apply(sendAbort: () => Unit): XAbortChannel = {
    val __obj = js.Dynamic.literal(sendAbort = js.Any.fromFunction0(sendAbort))
    __obj.asInstanceOf[XAbortChannel]
  }
  @scala.inline
  implicit class XAbortChannelOps[Self <: XAbortChannel] (val x: Self) extends AnyVal {
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
    def setSendAbort(value: () => Unit): Self = this.set("sendAbort", js.Any.fromFunction0(value))
  }
  
}

