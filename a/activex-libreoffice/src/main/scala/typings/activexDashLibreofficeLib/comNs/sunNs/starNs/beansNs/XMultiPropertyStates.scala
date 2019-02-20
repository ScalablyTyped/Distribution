package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to query information about the state of one or more properties.
  *
  * The state of a property contains information about the source of the value, e.g. the object itself, a default or a stylesheet. For more information
  * see PropertyState.
  */
trait XMultiPropertyStates
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns the default values of the propertes with the specified names.  If no default exists, is not known, or is void, then the return type at the corres
    * @throws UnknownPropertyException if one of the propertes does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyDefaults(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[_]
  /**
    * @param aPropertyName specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    */
  def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[PropertyState]
  /**
    * sets all properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    */
  def setAllPropertiesToDefault(): scala.Unit
  /**
    * sets the specified properties to their default values.
    *
    * Each value depends on the implementation of this interface. If it is a bound property, you must change the value before the change events are fired.
    * If it is a constrained property, you must fire the vetoable event before you change the property value.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @throws UnknownPropertyException if one of the properties does not exist.
    */
  def setPropertiesToDefault(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
}

