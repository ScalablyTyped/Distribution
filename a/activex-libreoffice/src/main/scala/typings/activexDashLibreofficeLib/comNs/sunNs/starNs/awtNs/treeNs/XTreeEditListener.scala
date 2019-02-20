package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can implement this interface and register with {@link XTreeControl.addTreeEditListener()} to get notifications when editing of a node starts and
  * ends.
  *
  * You have to set the {@link TreeControlModel.Editable} property to `TRUE` before a tree supports editing.
  */
trait XTreeEditListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * This method is called from the {@link TreeControl} implementation when editing of **Node** is finished and was not canceled.
    *
    * Implementations that register a {@link XTreeEditListener} must update the display value at the Node.
    * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
    * @param NewText the text that was entered by the user.
    */
  def nodeEdited(Node: XTreeNode, NewText: java.lang.String): scala.Unit
  /**
    * This method is called from the {@link TreeControl} implementation when editing of **Node** is requested by calling {@link
    * XTreeControl.startEditingAtNode()} .
    * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
    * @throws VetoException if thrown the editing will not start.
    */
  def nodeEditing(Node: XTreeNode): scala.Unit
}

