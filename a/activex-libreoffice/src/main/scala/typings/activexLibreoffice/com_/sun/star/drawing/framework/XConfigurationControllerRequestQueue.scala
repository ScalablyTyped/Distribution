package typings.activexLibreoffice.com_.sun.star.drawing.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request queue of the configuration controller handles requests for changes to the current configuration.
  *
  * This interface allows callers to add requests to the back of the queue and to determine whether the queue is empty. Using this interface should
  * normally not be necessary for anyone else than the {@link XConfigurationController} . It may be removed in the future.
  */
trait XConfigurationControllerRequestQueue extends StObject {
  
  /**
    * Return whether there are pending requests for configuration changes.
    * @returns Returns `TRUE` when there is at least one request object in the queue that has not yet been processed. It returns `FALSE` when the queue is empty.
    */
  def hasPendingRequests(): Boolean
  
  /**
    * Add a request for a configuration change to the request queue.
    *
    * This method should not be called from outside the drawing framework. Other sub controllers of the drawing framework are typical callers. They can add
    * change requests that can not be made with the requestResourceActivation() and requestResourceDeactivation() methods.
    * @param xRequest The configuration change represented by this request object must only be committed to the configuration when the {@link com.sun.star.dra
    */
  def postChangeRequest(xRequest: XConfigurationChangeRequest): Unit
}
object XConfigurationControllerRequestQueue {
  
  inline def apply(hasPendingRequests: () => Boolean, postChangeRequest: XConfigurationChangeRequest => Unit): XConfigurationControllerRequestQueue = {
    val __obj = js.Dynamic.literal(hasPendingRequests = js.Any.fromFunction0(hasPendingRequests), postChangeRequest = js.Any.fromFunction1(postChangeRequest))
    __obj.asInstanceOf[XConfigurationControllerRequestQueue]
  }
  
  extension [Self <: XConfigurationControllerRequestQueue](x: Self) {
    
    inline def setHasPendingRequests(value: () => Boolean): Self = StObject.set(x, "hasPendingRequests", js.Any.fromFunction0(value))
    
    inline def setPostChangeRequest(value: XConfigurationChangeRequest => Unit): Self = StObject.set(x, "postChangeRequest", js.Any.fromFunction1(value))
  }
}
