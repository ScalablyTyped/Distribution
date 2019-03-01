package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of a {@link TreeControl} . */
trait TreeControlModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel {
  /**
    * Specifies the {@link XTreeDataModel} that is providing the hierarchical data.
    *
    * You can implement your own instance of {@link XTreeDataModel} or use the {@link MutableTreeDataModel} .
    */
  var DataModel: XTreeDataModel
  /**
    * Specifies whether the nodes of the tree are editable.
    *
    * The default value is `FALSE`
    * @see XTreeControl.startEditingAtNode()
    * @see XTreeEditListener
    */
  var Editable: scala.Boolean
  /**
    * Specifies what happens when editing is interrupted by selecting another node in the tree, a change in the tree's data, or by some other means.
    *
    * Setting this property to `TRUE` causes the changes to be automatically saved when editing is interrupted. `FALSE` means that editing is canceled and
    * changes are lost
    *
    * The default value is `FALSE`
    */
  var InvokesStopNodeEditing: scala.Boolean
  /**
    * Specifies if the root node of the tree is displayed.
    *
    * If **RootDisplayed** is set to `FALSE` , the root node of a model is no longer a valid node for the {@link XTreeControl} and can't be used with any
    * method of {@link XTreeControl} .
    *
    * The default value is `TRUE`
    */
  var RootDisplayed: scala.Boolean
  /**
    * Specifies the height of each row, in pixels.
    *
    * If the specified value is less than or equal to zero, the row height is the maximum height of all rows.
    *
    * The default value is 0
    */
  var RowHeight: scala.Double
  /**
    * Specifies the selection mode that is enabled for this tree.
    *
    * The default value is com::sun::star::view::SelectionType::NONE
    */
  var SelectionType: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  /**
    * Specifies whether the node handles should be displayed.
    *
    * The handles are doted lines that visualize the tree like hierarchy
    *
    * The default value is `TRUE`
    */
  var ShowsHandles: scala.Boolean
  /**
    * Specifies whether the node handles should also be displayed at root level.
    *
    * The default value is `TRUE`
    */
  var ShowsRootHandles: scala.Boolean
}

object TreeControlModel {
  @scala.inline
  def apply(
    DataModel: XTreeDataModel,
    DefaultControl: java.lang.String,
    Editable: scala.Boolean,
    Height: scala.Double,
    InvokesStopNodeEditing: scala.Boolean,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RootDisplayed: scala.Boolean,
    RowHeight: scala.Double,
    SelectionType: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType,
    ServiceName: java.lang.String,
    ShowsHandles: scala.Boolean,
    ShowsRootHandles: scala.Boolean,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tag: java.lang.String,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
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
    dispose: js.Function0[scala.Unit],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): TreeControlModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataModel")(DataModel)
    __obj.updateDynamic("DefaultControl")(DefaultControl)
    __obj.updateDynamic("Editable")(Editable)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("InvokesStopNodeEditing")(InvokesStopNodeEditing)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RootDisplayed")(RootDisplayed)
    __obj.updateDynamic("RowHeight")(RowHeight)
    __obj.updateDynamic("SelectionType")(SelectionType)
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("ShowsHandles")(ShowsHandles)
    __obj.updateDynamic("ShowsRootHandles")(ShowsRootHandles)
    __obj.updateDynamic("Step")(Step)
    __obj.updateDynamic("TabIndex")(TabIndex)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("firePropertiesChangeEvent")(firePropertiesChangeEvent)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("getServiceName")(getServiceName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[TreeControlModel]
  }
}

