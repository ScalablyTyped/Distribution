package typings.activexLibreoffice.com_.sun.star.lang

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a collection of implementations of services.
  *
  * The factories for instantiating objects of implementations are accessed via a service name.
  *
  * The {@link com.sun.star.container.XContentEnumerationAccess} interface can be supported optionally. If it is supported, it is possible to enumerate
  * all implementations that support the service specified with the argument of {@link
  * com.sun.star.container.XContentEnumerationAccess.createContentEnumeration()} . The enumerator returns interfaces. The type of the interface is not
  * specified. Commonly this is {@link XSingleComponentFactory} .
  */
@js.native
trait MultiServiceFactory
  extends XMultiServiceFactory
     with XMultiComponentFactory {
  /**
    * Gets the names of all supported services.
    * @returns sequence of all service names
    */
  /* InferMemberOverrides */
  override val AvailableServiceNames: SafeArray[String] = js.native
  /**
    * Provides the available names of the factory to be used to create instances.
    * @returns sequence of all names
    */
  /* InferMemberOverrides */
  override def getAvailableServiceNames(): SafeArray[String] = js.native
}

