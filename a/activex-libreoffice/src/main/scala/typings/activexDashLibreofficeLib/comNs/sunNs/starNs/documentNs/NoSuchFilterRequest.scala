package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be used for interaction to handle states of unknown filter during detection
  *
  * If during loading time the filter can't be detected and wasn't given at calling time, a possible {@link com.sun.star.task.InteractionHandler} will be
  * used. (it's a part of used {@link MediaDescriptor} ) Such "NoSuchFilterRequest" will be used then to start right interaction on that to get a decision
  * which filter should be used for given URL. A possible continuation of type {@link XInteractionFilterSelect} will transport this decision back to
  * generic filter detection and force using of it. Of course it's possible to abort the loading process by use another continuation {@link
  * com.sun.star.task.XInteractionAbort} .
  * @see MediaDescriptor
  * @see com.sun.star.task.InteractionHandler
  * @see XInteractionFilterSelect
  * @see com.sun.star.task.XInteractionAbort
  */
trait NoSuchFilterRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** transport URL which couldn't be detected */
  var URL: java.lang.String
}

object NoSuchFilterRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    URL: java.lang.String
  ): NoSuchFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, URL = URL)
  
    __obj.asInstanceOf[NoSuchFilterRequest]
  }
}

