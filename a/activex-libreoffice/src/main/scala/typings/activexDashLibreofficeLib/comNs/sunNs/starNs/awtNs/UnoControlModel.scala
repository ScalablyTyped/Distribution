package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the standard model of an {@link UnoControl} in the **Smalltalk model view controller design** .
  *
  * The interfaces {@link com.sun.star.beans.XPropertySet} and {@link com.sun.star.beans.XMultiPropertySet} need access to the model data from the
  * embedding environment. The control and the model can specify additional interfaces to exchange data or export more functionality from the model.
  */
trait UnoControlModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with UnoControlDialogElement
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XPersistObject
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable {
  /** specifies the service name of the default control for this model. */
  var DefaultControl: java.lang.String
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object UnoControlModel {
  @scala.inline
  def apply(
    DefaultControl: java.lang.String,
    Height: scala.Double,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ServiceName: java.lang.String,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tag: java.lang.String,
    Width: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    dispose: () => scala.Unit,
    firePropertiesChangeEvent: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getPropertyValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[_],
    getServiceName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream => scala.Unit,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertiesChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setPropertyValues: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    write: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream => scala.Unit
  ): UnoControlModel = {
    val __obj = js.Dynamic.literal(DefaultControl = DefaultControl, Height = Height, Name = Name, PositionX = PositionX, PositionY = PositionY, PropertySetInfo = PropertySetInfo, ServiceName = ServiceName, Step = Step, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[UnoControlModel]
  }
}

