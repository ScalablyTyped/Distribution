package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to multiple properties with a single call. */
trait XMultiPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  val PropertySetInfo: XPropertySetInfo
  /**
    * adds an {@link XPropertiesChangeListener} to the specified property with the specified names.
    *
    * The implementation can ignore the names of the properties and fire the event on all properties.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param aPropertyNames specifies the names of the properties.
    * @param xListener contains the listener for the property change events.
    * @see removePropertiesChangeListener
    */
  def addPropertiesChangeListener(
    aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    xListener: XPropertiesChangeListener
  ): scala.Unit
  /**
    * fires a sequence of PropertyChangeEvents to the specified listener.
    * @param aPropertyNames specifies the sorted names of the properties.
    * @param xListener contains the listener for the property change events.
    */
  def firePropertiesChangeEvent(
    aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    xListener: XPropertiesChangeListener
  ): scala.Unit
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  def getPropertySetInfo(): XPropertySetInfo
  /**
    * @param aPropertyNames specifies the names of the properties. This sequence must be alphabetically sorted.
    * @returns a sequence of all values of the properties which are specified by their names.  The order of the values in the returned sequence will be the same
    */
  def getPropertyValues(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[_]
  /**
    * removes an {@link XPropertiesChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @param xListener contains the listener to be removed.
    * @see addPropertiesChangeListener
    */
  def removePropertiesChangeListener(xListener: XPropertiesChangeListener): scala.Unit
  /**
    * sets the values to the properties with the specified names.
    *
    * The values of the properties must change before the bound events are fired. The values of the constrained properties should change after the vetoable
    * events are fired and only if no exception occurred. Unknown properties are ignored.
    * @param aPropertyNames specifies the names of the properties. All names must be unique. This sequence must be alphabetically sorted.
    * @param aValues contains the new values of the properties. The order is the same as in **aPropertyNames** .
    * @throws IllegalArgumentException if one of the new values cannot be converted to the type of the underlying property by an identity or widening conversion.
    * @throws com::sun::star::lang:WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception i
    */
  def setPropertyValues(
    aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): scala.Unit
}

object XMultiPropertySet {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XPropertiesChangeListener, 
      scala.Unit
    ],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XPropertiesChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[XPropertySetInfo],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[XPropertiesChangeListener, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): XMultiPropertySet = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValues = getPropertyValues, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[XMultiPropertySet]
  }
}

