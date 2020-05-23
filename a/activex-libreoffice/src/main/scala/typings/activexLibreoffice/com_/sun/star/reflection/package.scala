package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reflection {
  /**
    * thrown in case that a certain type name does exist, but does not meet some other criteria.
    * @since OOo 1.1.2
    */
  type InvalidTypeNameException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * This exception denotes a checked exception (wrapping an originating exception) and may be thrown upon using invocation API.
    * @see XIdlMethod
    */
  type InvocationTargetException = typings.activexLibreoffice.com_.sun.star.lang.WrappedTargetException
  /**
    * thrown in case that a certain type name does not exist.
    * @since OOo 1.1.2
    */
  type NoSuchTypeNameException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * Service to create proxy objects acting on behalf of a given target object. ;  A proxy delegates calls to a given target object. In addition, it is
    * aggregatable, thus it is possible to intercept calls on the proxy's interfaces.
    * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
    */
  type ProxyFactory = typings.activexLibreoffice.com_.sun.star.reflection.XProxyFactory
  /** @since LibreOffice 4.0 */
  type theCoreReflection = typings.activexLibreoffice.com_.sun.star.reflection.XIdlReflection
}
