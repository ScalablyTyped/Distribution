package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The description of an interaction request. */
trait XInteractionRequest
  extends StObject
     with XInterface {
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: SafeArray[XInteractionContinuation]
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: Any
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): SafeArray[XInteractionContinuation]
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): Any
}
object XInteractionRequest {
  
  inline def apply(
    Continuations: SafeArray[XInteractionContinuation],
    Request: Any,
    acquire: () => Unit,
    getContinuations: () => SafeArray[XInteractionContinuation],
    getRequest: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContinuations = js.Any.fromFunction0(getContinuations), getRequest = js.Any.fromFunction0(getRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInteractionRequest] (val x: Self) extends AnyVal {
    
    inline def setContinuations(value: SafeArray[XInteractionContinuation]): Self = StObject.set(x, "Continuations", value.asInstanceOf[js.Any])
    
    inline def setGetContinuations(value: () => SafeArray[XInteractionContinuation]): Self = StObject.set(x, "getContinuations", js.Any.fromFunction0(value))
    
    inline def setGetRequest(value: () => Any): Self = StObject.set(x, "getRequest", js.Any.fromFunction0(value))
    
    inline def setRequest(value: Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
  }
}
