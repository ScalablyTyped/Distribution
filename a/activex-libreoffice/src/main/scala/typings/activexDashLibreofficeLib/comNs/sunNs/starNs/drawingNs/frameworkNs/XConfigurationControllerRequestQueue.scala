package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request queue of the configuration controller handles requests for changes to the current configuration.
  *
  * This interface allows callers to add requests to the back of the queue and to determine whether the queue is empty. Using this interface should
  * normally not be necessary for anyone else than the {@link XConfigurationController} . It may be removed in the future.
  */
trait XConfigurationControllerRequestQueue extends js.Object {
  /**
    * Return whether there are pending requests for configuration changes.
    * @returns Returns `TRUE` when there is at least one request object in the queue that has not yet been processed. It returns `FALSE` when the queue is empty.
    */
  def hasPendingRequests(): scala.Boolean
  /**
    * Add a request for a configuration change to the request queue.
    *
    * This method should not be called from outside the drawing framework. Other sub controllers of the drawing framework are typical callers. They can add
    * change requests that can not be made with the requestResourceActivation() and requestResourceDeactivation() methods.
    * @param xRequest The configuration change represented by this request object must only be committed to the configuration when the {@link com.sun.star.dra
    */
  def postChangeRequest(xRequest: XConfigurationChangeRequest): scala.Unit
}

object XConfigurationControllerRequestQueue {
  @scala.inline
  def apply(
    hasPendingRequests: js.Function0[scala.Boolean],
    postChangeRequest: js.Function1[XConfigurationChangeRequest, scala.Unit]
  ): XConfigurationControllerRequestQueue = {
    val __obj = js.Dynamic.literal(hasPendingRequests = hasPendingRequests, postChangeRequest = postChangeRequest)
  
    __obj.asInstanceOf[XConfigurationControllerRequestQueue]
  }
}

