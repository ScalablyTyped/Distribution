package typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query information about the state of one or more properties.
  *
  * The state contains the information if:
  *
  * a value is available or voidthe value is stored in the object itself, or if a default value is to be usedand if the value cannot be determined, due to
  * ambiguity (multi selection with multiple values).
  */
trait XPropertyState extends XInterface {
  /**
    * @param aPropertyName specifies the name of the property.
    * @returns the default value of the property with the name PropertyName.  If no default exists, is not known or is void, then the return type is `void` .
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefault(aPropertyName: String): js.Any
  /**
    * @param PropertyName specifies the name of the property.
    * @returns the state of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyState(PropertyName: String): PropertyState
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
  /**
    * Sets the property to default value.
    *
    * The value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired. If
    * it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param PropertyName specifies the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def setPropertyToDefault(PropertyName: String): Unit
}

object XPropertyState {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getPropertyDefault: String => js.Any,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyToDefault: String => Unit
  ): XPropertyState = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault))
  
    __obj.asInstanceOf[XPropertyState]
  }
}

