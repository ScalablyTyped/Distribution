package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.activexLibreoffice.com_.sun.star.view.SelectionType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of a {@link TreeControl} . */
@js.native
trait TreeControlModel extends UnoControlModel {
  
  /**
    * Specifies the {@link XTreeDataModel} that is providing the hierarchical data.
    *
    * You can implement your own instance of {@link XTreeDataModel} or use the {@link MutableTreeDataModel} .
    */
  var DataModel: XTreeDataModel = js.native
  
  /**
    * Specifies whether the nodes of the tree are editable.
    *
    * The default value is `FALSE`
    * @see XTreeControl.startEditingAtNode()
    * @see XTreeEditListener
    */
  var Editable: Boolean = js.native
  
  /**
    * Specifies what happens when editing is interrupted by selecting another node in the tree, a change in the tree's data, or by some other means.
    *
    * Setting this property to `TRUE` causes the changes to be automatically saved when editing is interrupted. `FALSE` means that editing is canceled and
    * changes are lost
    *
    * The default value is `FALSE`
    */
  var InvokesStopNodeEditing: Boolean = js.native
  
  /**
    * Specifies if the root node of the tree is displayed.
    *
    * If **RootDisplayed** is set to `FALSE` , the root node of a model is no longer a valid node for the {@link XTreeControl} and can't be used with any
    * method of {@link XTreeControl} .
    *
    * The default value is `TRUE`
    */
  var RootDisplayed: Boolean = js.native
  
  /**
    * Specifies the height of each row, in pixels.
    *
    * If the specified value is less than or equal to zero, the row height is the maximum height of all rows.
    *
    * The default value is 0
    */
  var RowHeight: Double = js.native
  
  /**
    * Specifies the selection mode that is enabled for this tree.
    *
    * The default value is com::sun::star::view::SelectionType::NONE
    */
  var SelectionType: typings.activexLibreoffice.com_.sun.star.view.SelectionType = js.native
  
  /**
    * Specifies whether the node handles should be displayed.
    *
    * The handles are doted lines that visualize the tree like hierarchy
    *
    * The default value is `TRUE`
    */
  var ShowsHandles: Boolean = js.native
  
  /**
    * Specifies whether the node handles should also be displayed at root level.
    *
    * The default value is `TRUE`
    */
  var ShowsRootHandles: Boolean = js.native
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
    val __obj = js.Dynamic.literal(DataModel = DataModel.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Editable = Editable.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InvokesStopNodeEditing = InvokesStopNodeEditing.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RootDisplayed = RootDisplayed.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ShowsHandles = ShowsHandles.asInstanceOf[js.Any], ShowsRootHandles = ShowsRootHandles.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[TreeControlModel]
  }
  
  @scala.inline
  implicit class TreeControlModelOps[Self <: TreeControlModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataModel(value: XTreeDataModel): Self = this.set("DataModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("Editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokesStopNodeEditing(value: Boolean): Self = this.set("InvokesStopNodeEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDisplayed(value: Boolean): Self = this.set("RootDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("RowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionType(value: SelectionType): Self = this.set("SelectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsHandles(value: Boolean): Self = this.set("ShowsHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowsRootHandles(value: Boolean): Self = this.set("ShowsRootHandles", value.asInstanceOf[js.Any])
  }
}
