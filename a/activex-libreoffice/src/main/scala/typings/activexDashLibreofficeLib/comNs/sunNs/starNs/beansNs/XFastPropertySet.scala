package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a fast way of accessing and changing property values.
  *
  * This interface is an extension to the {@link XPropertySet} interface. The get and set methods use handles to access the property values instead of
  * character strings.
  */
trait XFastPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @returns the value of the property with the name PropertyName.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getFastPropertyValue(nHandle: scala.Double): js.Any
  /**
    * sets the value to the property with the specified name.
    * @param nHandle contains the implementation handle of the implementation for the property.
    * @param aValue contains the new value of the property.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws PropertyVetoException if a vetoable listener does not approve the change of a property value.
    * @throws IllegalArgumentException if the new value cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def setFastPropertyValue(nHandle: scala.Double, aValue: js.Any): scala.Unit
}

