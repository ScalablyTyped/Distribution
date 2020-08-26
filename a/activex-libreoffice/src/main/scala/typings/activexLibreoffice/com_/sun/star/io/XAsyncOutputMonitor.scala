package typings.activexLibreoffice.com_.sun.star.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An optional companion interface to {@link com.sun.star.io.XOutputStream} that supports scenarios where {@link
  * com.sun.star.io.XOutputStream.writeBytes()} operates asynchronously and does not necessarily report any errors.
  *
  * A typical scenario where this interface is useful is when an {@link com.sun.star.io.XOutputStream} is used to write to a file via NFS. Normally, any
  * calls to {@link com.sun.star.io.XOutputStream.writeBytes()} will execute asynchronously then, in that any potential errors might only be reported by
  * later calls to {@link com.sun.star.io.XOutputStream.writeBytes()} or {@link com.sun.star.io.XOutputStream.closeOutput()} . If such an output stream
  * shall not be closed immediately after one or more calls to {@link com.sun.star.io.XOutputStream.writeBytes()} , but the client wants to know as soon
  * as possible whether writing was successful, then {@link com.sun.star.io.XAsyncOutputMonitor.waitForCompletion()} should be called after the series of
  * calls to {@link com.sun.star.io.XOutputStream.writeBytes()} .
  * @since OOo 2.0
  */
@js.native
trait XAsyncOutputMonitor extends js.Object {
  /**
    * waits for the completion of any previous calls to {@link com.sun.star.io.XOutputStream.writeBytes()} , and reports potentially pending errors.
    *
    * Calling this method is potentially expensive (even if the associated {@link com.sun.star.io.XOutputStream} represents a local file not accessed via
    * NFS, for example). This method has a similar description to {@link com.sun.star.io.XOutputStream.flush()} . However, where the semantics of `flush`
    * are rather vague, `waitForCompletion` has very specific semantics  --  it just blocks long enough so that any errors encountered during previous calls
    * to {@link com.sun.star.io.XOutputStream.writeBytes()} can reliably be reported. It specificially does not guarantee that any data have safely been
    * stored on a stable physical medium, like a hard disk (and it is completely unspecified whether `flush` should give this guarantee).
    * @throws com::sun::star::io::IOException if any previous call to {@link com.sun.star.io.XOutputStream.writeBytes()} encountered such an error, but has not
    */
  def waitForCompletion(): Unit = js.native
}

object XAsyncOutputMonitor {
  @scala.inline
  def apply(waitForCompletion: () => Unit): XAsyncOutputMonitor = {
    val __obj = js.Dynamic.literal(waitForCompletion = js.Any.fromFunction0(waitForCompletion))
    __obj.asInstanceOf[XAsyncOutputMonitor]
  }
  @scala.inline
  implicit class XAsyncOutputMonitorOps[Self <: XAsyncOutputMonitor] (val x: Self) extends AnyVal {
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
    def setWaitForCompletion(value: () => Unit): Self = this.set("waitForCompletion", js.Any.fromFunction0(value))
  }
  
}

