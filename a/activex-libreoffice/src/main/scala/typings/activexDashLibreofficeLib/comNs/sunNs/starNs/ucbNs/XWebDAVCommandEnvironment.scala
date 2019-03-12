package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A command environment that can be used to deal with WebDAV/HTTP specific commands. */
trait XWebDAVCommandEnvironment extends XCommandEnvironment {
  /**
    * This method gets called while assembling an WebDAV/HTTP request. The returned headername-headervalue pairs will be appended to the list of request
    * headers before the request is dispatched.
    * @param aURI The request URI.
    * @param eMethod The WebDAV/HTTP method ("GET","PUT","MKCOL",...) as defined in WebDAVHTTPMethod.
    * @returns A sequence of header name, header value pairs. The header names must be the plain names and contain no trailing ":".
    */
  def getUserRequestHeaders(aURI: java.lang.String, eMethod: WebDAVHTTPMethod): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
}

object XWebDAVCommandEnvironment {
  @scala.inline
  def apply(
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: () => scala.Unit,
    getInteractionHandler: () => activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    getProgressHandler: () => XProgressHandler,
    getUserRequestHeaders: (java.lang.String, WebDAVHTTPMethod) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XWebDAVCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler, ProgressHandler = ProgressHandler, acquire = js.Any.fromFunction0(acquire), getInteractionHandler = js.Any.fromFunction0(getInteractionHandler), getProgressHandler = js.Any.fromFunction0(getProgressHandler), getUserRequestHeaders = js.Any.fromFunction2(getUserRequestHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWebDAVCommandEnvironment]
  }
}

