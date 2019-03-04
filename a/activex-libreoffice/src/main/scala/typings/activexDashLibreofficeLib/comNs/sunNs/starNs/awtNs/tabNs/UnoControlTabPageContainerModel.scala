package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a model for a {@link UnoControlTabPageContainer} control.
  * @since OOo 3.4
  */
trait UnoControlTabPageContainerModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel
     with XTabPageContainerModel {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object UnoControlTabPageContainerModel {
  @scala.inline
  def apply(
    Count: scala.Double,
    DefaultControl: java.lang.String,
    ElementType: activexDashLibreofficeLib.`type`,
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
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    createTabPage: js.Function1[scala.Double, XTabPageModel],
    dispose: js.Function0[scala.Unit],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getServiceName: js.Function0[java.lang.String],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    loadTabPage: js.Function2[scala.Double, java.lang.String, XTabPageModel],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): UnoControlTabPageContainerModel = {
    val __obj = js.Dynamic.literal(Count = Count, DefaultControl = DefaultControl, ElementType = ElementType, Height = Height, Name = Name, PositionX = PositionX, PositionY = PositionY, PropertySetInfo = PropertySetInfo, ServiceName = ServiceName, Step = Step, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = acquire, addContainerListener = addContainerListener, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, createTabPage = createTabPage, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, hasElements = hasElements, insertByIndex = insertByIndex, loadTabPage = loadTabPage, queryInterface = queryInterface, read = read, release = release, removeByIndex = removeByIndex, removeContainerListener = removeContainerListener, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, replaceByIndex = replaceByIndex, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlTabPageContainerModel]
  }
}

