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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("DefaultControl")(DefaultControl)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("Step")(Step)
    __obj.updateDynamic("TabIndex")(TabIndex)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addContainerListener")(addContainerListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("createTabPage")(createTabPage)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("firePropertiesChangeEvent")(firePropertiesChangeEvent)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("getServiceName")(getServiceName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByIndex")(insertByIndex)
    __obj.updateDynamic("loadTabPage")(loadTabPage)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByIndex")(removeByIndex)
    __obj.updateDynamic("removeContainerListener")(removeContainerListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("replaceByIndex")(replaceByIndex)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[UnoControlTabPageContainerModel]
  }
}

