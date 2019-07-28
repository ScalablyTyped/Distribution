package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unoNs {
  /**
    * {@link Exception} signalling a deployment error.
    * @since OOo 1.1.2
    */
  type DeploymentException = RuntimeException
  /** a simple named object container. */
  type NamingService = XNamingService
  /**
    * This exception or a subclass can occur at every interface method.
    *
    * It shall signal an error, which was not covered by the interface method specification. This exception (or a derived one) is thrown, when for instance
    * an interprocess bridge to the object broke down, some explicitly forbidden invalid parameters were passed ( e.g. null references ) or the called
    * object has been disposed before.
    */
  type RuntimeException = Exception
  /** Base exception for all security related exceptions. */
  type SecurityException = RuntimeException
}
