package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query information about the state of this object, seen as a property contained in a property set.
  *
  * This interface provides direct access to operations that are available if the containing property set implements {@link XPropertyState} .
  *
  * The state contains the information if:
  *
  * a value is available or voidthe value is stored in the object itself, or if a default value is being usedor if the value cannot be determined, due to
  * ambiguity (multi selection with multiple values).
  *
  * Generally objects that implement this interface also implement {@link XProperty} .
  */
trait XPropertyWithState extends XInterface {
  /**
    * @returns an object representing the default state of this object (as a property).  If no default exists, is not known or is void, then the return value is
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  val DefaultAsProperty: XInterface
  /** @returns the state of this as a property. */
  val StateAsProperty: PropertyState
  /**
    * @returns an object representing the default state of this object (as a property).  If no default exists, is not known or is void, then the return value is
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getDefaultAsProperty(): XInterface
  /** @returns the state of this as a property. */
  def getStateAsProperty(): PropertyState
  /**
    * sets this to its default value.
    *
    * The value depends on the implementation of this interface. If this is a bound property, the value changes before the change events are fired. If this
    * is a constrained property, the vetoable event is fired before the property value changes.
    * @@throws com::sun::star::lang::WrappedTargetException    if the implementation has an internal reason for the exception.      In this case the original ex
    */
  def setToDefaultAsProperty(): Unit
}

object XPropertyWithState {
  @scala.inline
  def apply(
    DefaultAsProperty: XInterface,
    StateAsProperty: PropertyState,
    acquire: () => Unit,
    getDefaultAsProperty: () => XInterface,
    getStateAsProperty: () => PropertyState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setToDefaultAsProperty: () => Unit
  ): XPropertyWithState = {
    val __obj = js.Dynamic.literal(DefaultAsProperty = DefaultAsProperty, StateAsProperty = StateAsProperty, acquire = js.Any.fromFunction0(acquire), getDefaultAsProperty = js.Any.fromFunction0(getDefaultAsProperty), getStateAsProperty = js.Any.fromFunction0(getStateAsProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setToDefaultAsProperty = js.Any.fromFunction0(setToDefaultAsProperty))
  
    __obj.asInstanceOf[XPropertyWithState]
  }
}

