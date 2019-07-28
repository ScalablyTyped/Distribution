package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dispatch statement from a recorded macro
  * @since OOo 1.1.2
  */
trait DispatchStatement extends js.Object {
  /**
    * specifies the dispatch command arguments
    *
    * That means the **Arguments** parameter of a corresponding {@link XDispatch.dispatch()} request.
    */
  var aArgs: SafeArray[PropertyValue]
  /**
    * specifies the dispatch command
    *
    * That means the **URL** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aCommand: String
  /**
    * specifies the frame target
    *
    * That means the **TargetFrameName** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var aTarget: String
  /**
    * specifies if this statement should be recorded as commented out or not
    * @see XDispatchRecorder.recordDispatchAsComment()
    */
  var bIsComment: Boolean
  /**
    * specifies the optional search flags
    *
    * That means the **SearchFlags** parameter of a corresponding {@link XDispatchProvider.queryDispatch()} request.
    */
  var nFlags: Double
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
    val __obj = js.Dynamic.literal(aArgs = aArgs, aCommand = aCommand, aTarget = aTarget, bIsComment = bIsComment, nFlags = nFlags)
  
    __obj.asInstanceOf[DispatchStatement]
  }
}

