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
    val __obj = js.Dynamic.literal(DataModel = DataModel, DefaultControl = DefaultControl, Editable = Editable, Height = Height, InvokesStopNodeEditing = InvokesStopNodeEditing, Name = Name, PositionX = PositionX, PositionY = PositionY, PropertySetInfo = PropertySetInfo, RootDisplayed = RootDisplayed, RowHeight = RowHeight, SelectionType = SelectionType, ServiceName = ServiceName, ShowsHandles = ShowsHandles, ShowsRootHandles = ShowsRootHandles, Step = Step, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[TreeControlModel]
  }
}

