package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dispatch statement from a recorded macro
  * @since OOo 1.1.2
  */
@js.native
trait DispatchStatement extends js.Object {
  /**
    * specifies the dispatch command arguments
    *
    * That means the **Arguments** parameter of a corresponding {@link XDispatch.dispatch()} request.
    */
  var aArgs: SafeArray[PropertyValue] = js.native
  /**
    * specifies the dispatch command
    *
    * That means the **URL** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aCommand: String = js.native
  /**
    * specifies the frame target
    *
    * That means the **TargetFrameName** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aTarget: String = js.native
  /**
    * specifies if this statement should be recorded as commented out or not
    * @see XDispatchRecorder.recordDispatchAsComment()
    */
  var bIsComment: Boolean = js.native
  /**
    * specifies the optional search flags
    *
    * That means the **SearchFlags** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var nFlags: Double = js.native
}

object DispatchStatement {
  @scala.inline
  def apply(
    aArgs: SafeArray[PropertyValue],
    aCommand: String,
    aTarget: String,
    bIsComment: Boolean,
    nFlags: Double
  ): DispatchStatement = {
    val __obj = js.Dynamic.literal(aArgs = aArgs.asInstanceOf[js.Any], aCommand = aCommand.asInstanceOf[js.Any], aTarget = aTarget.asInstanceOf[js.Any], bIsComment = bIsComment.asInstanceOf[js.Any], nFlags = nFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchStatement]
  }
  @scala.inline
  implicit class DispatchStatementOps[Self <: DispatchStatement] (val x: Self) extends AnyVal {
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
    def setAArgs(value: SafeArray[PropertyValue]): Self = this.set("aArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def setACommand(value: String): Self = this.set("aCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def setATarget(value: String): Self = this.set("aTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIsComment(value: Boolean): Self = this.set("bIsComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setNFlags(value: Double): Self = this.set("nFlags", value.asInstanceOf[js.Any])
  }
  
}

