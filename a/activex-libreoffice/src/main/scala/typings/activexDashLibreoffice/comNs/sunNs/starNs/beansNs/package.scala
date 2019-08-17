package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object beansNs {
  import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception

  /**
    * This exception is thrown to indicate the use of a type which is not appropriate.
    *
    * This problem can occur, if you use an `any` .
    * @see PropertyContainer
    */
  type IllegalTypeException = Exception
  /**
    * A legacy (single-instance) service variant of {@link theIntrospection} singleton.
    * @deprecated DeprecatedUse theIntrospection instead.
    */
  type Introspection = XIntrospection
  /**
    * This exception is thrown when an exception happens during introspection.
    * @deprecated Deprecated  This exception isn't specified and used anywhere
    */
  type IntrospectionException = Exception
  /** This exception is thrown to indicate that removing a property from an {@link XPropertyContainer} is not allowed. */
  type NotRemoveableException = Exception
  /**
    * This exception is thrown to indicate that a property with this name already exists in the object.
    * @see PropertyContainer
    */
  type PropertyExistException = Exception
  /**
    * specifies a sequence of {@link PropertyValue} instances.
    *
    * Such sequences are especially useful for remote interfaces.
    */
  type PropertyValues = SeqEquiv[PropertyValue]
  /**
    * This exception is thrown when a proposed change to a property represents an unacceptable value.
    * @see XPropertySet
    */
  type PropertyVetoException = Exception
  /**
    * This exception is thrown to indicate that the property name is unknown to the implementation.
    * @see XPropertySet
    */
  type UnknownPropertyException = Exception
  /**
    * provides functionality to get information about an object's properties and methods.
    *
    * **Important note:** An object can only be inspected completely if it supports the {@link com.sun.star.lang.XTypeProvider} interface.
    *
    * For details, see method {@link XIntrospection.inspect()} .
    * @since LibreOffice 4.3
    */
  type theIntrospection = XIntrospection
}
