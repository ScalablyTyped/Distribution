package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaderNs {
  /**
    * indicates an error during component activation
    *
    * This exception is thrown when an application tries to activate a component factory using the {@link XImplementationLoader.activate()} method, but the
    * component factory can not be activated.
    *
    * Possible reasons for this error is a missing shared library or .jar file, a badly linked library, a wrong LD_LIBRARY_PATH or PATH, an incomplete
    * classpath, or a missing java installation. The Message should contain some more detailed explanations.
    */
  type CannotActivateFactoryException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * Makes it possible to access services accessible via a `UnoUrlResolver` E.g., instantiation of services in another process. This service is still in an
    * experimental state and should not be used in a production environment.
    *
    * Is used to write persistent information into the given registry for accessing a `SingleServiceFactory` and for activating this implementation.
    *
    * Allows registration and activation of described service. The url parameter has to be a comma-separated list of attributes. The following attribute
    * types are understood: servicename = the service name to register this component under link = a parameter given to a resolver to get a
    * `SingleServiceFactory` resolver = a `UnoUrlResolver` service, which is used to resolve the link
    */
  type Dynamic = XImplementationLoader
  /**
    * Allows to access a java component stored with a .jar file.
    *
    * Is used for writing persistent information in the registry for external implementation and for activating this implementation. The locationUrls must
    * be absolute file urls.
    */
  type Java = XImplementationLoader
  /**
    * the same as {@link com.sun.star.loader.Java} .
    *
    * This service was introduced for UNO 3 components. The then {@link com.sun.star.loader.Java} service was intended for UNO 2 components. Since UNO 2 is
    * not supported anymore, the service name is reused again.
    * @deprecated Deprecated
    */
  type Java2 = XImplementationLoader
  /**
    * Allows to access a native component stored in a shared library.
    *
    * Is used for writing persistent information in the registry for an external implementation and for activating this implementation.
    */
  type SharedLibrary = XImplementationLoader
}
