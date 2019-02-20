package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object langNs {
  /**
    * This exception is thrown to indicate that an array has been accessed with an illegal index.
    *
    * The index is either negative or greater than or equal to the size of the array.
    */
  type ArrayIndexOutOfBoundsException = IndexOutOfBoundsException
  /** This exception is thrown when an application tries to load the information on the type through its string name. */
  type ClassNotFoundException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * This exception occurs if the object behind this interface has been disposed before and can't uphold its method specification anymore.
    *
    * The implementation normally should implement the {@link com.sun.star.lang.XComponent} interface to indicate this possibility.
    */
  type DisposedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.RuntimeException
  /** This exception is thrown when an application tries to change a constant property. */
  type IllegalAccessException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * This exception is thrown to indicate that a container has been accessed with an illegal index.
    *
    * The index is either negative or greater than or equal to the count of the elements.
    */
  type IndexOutOfBoundsException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * is thrown by the XConnectionPoint::advice() method to indicate that the listener has not supplied the necessary interface.
    * @see XConnectionPoint
    */
  type InvalidListenerException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * is thrown by the {@link XConnectionPoint.advise()} method to indicate that there is only one listener allowed.
    * @see XConnectionPoint
    */
  type ListenerExistException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /** signals that the class does not have a field of a specified name. */
  type NoSuchFieldException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /** signals that the interface does not have a method of a specified name. */
  type NoSuchMethodException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * This exception is thrown when a feature of an interface is not supported.
    *
    * An example is a `setParent(...)` method and the object does not allow the change.
    * @see XEnumeration
    * @see com.sun.star.container.XChild.setParent
    */
  type NoSupportException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /** is thrown when a component is attempted to be used before it was completely constructed. */
  type NotInitializedException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.RuntimeException
  /**
    * This exception is thrown when an application attempts to use `NULL` in a case where an object is required.
    *
    * Applications should throw instances of this class to indicate other illegal uses of the `NULL` object.
    * @see com.sun.star.reflection.XIdlReflection.forName
    */
  type NullPointerException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * This exception is thrown when a needed service is not found.
    *
    * Applications should throw instances of this class to indicate that a needed service is not registered.
    */
  type ServiceNotRegisteredException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
}
