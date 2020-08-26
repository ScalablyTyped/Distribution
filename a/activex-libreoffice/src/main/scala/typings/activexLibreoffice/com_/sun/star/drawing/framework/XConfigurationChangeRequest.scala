package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single explicit request for a configuration change.
  *
  * The requested change is committed to a configuration only when the {@link execute()} method is called. {@link Configuration} change requests are
  * executed asynchronously. This is done to avoid reentrance problems with objects that are registered as {@link XConfigurationChangeListener} and at the
  * same time make configuration change requests. When the requests were executed synchronously then the listeners would be notified of the changes while
  * their request call has not yet returned.
  *
  * This interface is typically used internally by the {@link XConfigurationController}
  * @see XConfigurationController
  */
@js.native
trait XConfigurationChangeRequest extends js.Object {
  /**
    * Commit the configuration change request represented by the called object to the given configuration.
    * @param xConfiguration This is the configuration to commit the requested change to.
    */
  def execute(xConfiguration: XConfiguration): Unit = js.native
}

object XConfigurationChangeRequest {
  @scala.inline
  def apply(execute: XConfiguration => Unit): XConfigurationChangeRequest = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[XConfigurationChangeRequest]
  }
  @scala.inline
  implicit class XConfigurationChangeRequestOps[Self <: XConfigurationChangeRequest] (val x: Self) extends AnyVal {
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
    def setExecute(value: XConfiguration => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
  }
  
}

