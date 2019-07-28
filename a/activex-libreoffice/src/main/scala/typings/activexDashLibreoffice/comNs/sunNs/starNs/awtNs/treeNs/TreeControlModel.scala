package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.SelectionType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of a {@link TreeControl} . */
trait TreeControlModel extends UnoControlModel {
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
  var Editable: Boolean
  /**
    * Specifies what happens when editing is interrupted by selecting another node in the tree, a change in the tree's data, or by some other means.
    *
    * Setting this property to `TRUE` causes the changes to be automatically saved when editing is interrupted. `FALSE` means that editing is canceled and
    * changes are lost
    *
    * The default value is `FALSE`
    */
  var InvokesStopNodeEditing: Boolean
  /**
    * Specifies if the root node of the tree is displayed.
    *
    * If **RootDisplayed** is set to `FALSE` , the root node of a model is no longer a valid node for the {@link XTreeControl} and can't be used with any
    * method of {@link XTreeControl} .
    *
    * The default value is `TRUE`
    */
  var RootDisplayed: Boolean
  /**
    * Specifies the height of each row, in pixels.
    *
    * If the specified value is less than or equal to zero, the row height is the maximum height of all rows.
    *
    * The default value is 0
    */
  var RowHeight: Double
  /**
    * Specifies the selection mode that is enabled for this tree.
    *
    * The default value is com::sun::star::view::SelectionType::NONE
    */
  var SelectionType: typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.SelectionType
  /**
    * Specifies whether the node handles should be displayed.
    *
    * The handles are doted lines that visualize the tree like hierarchy
    *
    * The default value is `TRUE`
    */
  var ShowsHandles: Boolean
  /**
    * Specifies whether the node handles should also be displayed at root level.
    *
    * The default value is `TRUE`
    */
  var ShowsRootHandles: Boolean
}

object TreeControlModel {
  @scala.inline
  def apply(
    DataModel: XTreeDataModel,
    DefaultControl: String,
    Editable: Boolean,
    Height: Double,
    InvokesStopNodeEditing: Boolean,
    Name: String,
    PositionX: String,
    PositionY: String,
    PropertySetInfo: XPropertySetInfo,
    RootDisplayed: Boolean,
    RowHeight: Double,
    SelectionType: SelectionType,
    ServiceName: String,
    ShowsHandles: Boolean,
    ShowsRootHandles: Boolean,
    Step: Double,
    TabIndex: Double,
    Tag: String,
    Width: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    write: XObjectOutputStream => Unit
  ): TreeControlModel = {
    val __obj = js.Dynamic.literal(DataModel = DataModel, DefaultControl = DefaultControl, Editable = Editable, Height = Height, InvokesStopNodeEditing = InvokesStopNodeEditing, Name = Name, PositionX = PositionX, PositionY = PositionY, PropertySetInfo = PropertySetInfo, RootDisplayed = RootDisplayed, RowHeight = RowHeight, SelectionType = SelectionType, ServiceName = ServiceName, ShowsHandles = ShowsHandles, ShowsRootHandles = ShowsRootHandles, Step = Step, TabIndex = TabIndex, Tag = Tag, Width = Width, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[TreeControlModel]
  }
}

