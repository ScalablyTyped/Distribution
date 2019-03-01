package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

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
trait XPropertyState
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param aPropertyName specifies the name of the property.
    * @returns the default value of the property with the name PropertyName.  If no default exists, is not known or is void, then the return type is `void` .
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefault(aPropertyName: java.lang.String): js.Any
  /**
    * @param PropertyName specifies the name of the property.
    * @returns the state of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def getPropertyState(PropertyName: java.lang.String): PropertyState
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[PropertyState]
  /**
    * Sets the property to default value.
    *
    * The value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired. If
    * it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param PropertyName specifies the name of the property.
    * @throws UnknownPropertyException if the property does not exist.
    */
  def setPropertyToDefault(PropertyName: java.lang.String): scala.Unit
}

object XPropertyState {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getPropertyDefault: js.Function1[java.lang.String, js.Any],
    getPropertyState: js.Function1[java.lang.String, PropertyState],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[PropertyState]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPropertyToDefault: js.Function1[java.lang.String, scala.Unit]
  ): XPropertyState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getPropertyDefault")(getPropertyDefault)
    __obj.updateDynamic("getPropertyState")(getPropertyState)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setPropertyToDefault")(setPropertyToDefault)
    __obj.asInstanceOf[XPropertyState]
  }
}

