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

