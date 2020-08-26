package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can implement this interface and register with {@link XTreeControl.addTreeEditListener()} to get notifications when editing of a node starts and
  * ends.
  *
  * You have to set the {@link TreeControlModel.Editable} property to `TRUE` before a tree supports editing.
  */
@js.native
trait XTreeEditListener extends XEventListener {
  /**
    * This method is called from the {@link TreeControl} implementation when editing of **Node** is finished and was not canceled.
    *
    * Implementations that register a {@link XTreeEditListener} must update the display value at the Node.
    * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
    * @param NewText the text that was entered by the user.
    */
  def nodeEdited(Node: XTreeNode, NewText: String): Unit = js.native
  /**
    * This method is called from the {@link TreeControl} implementation when editing of **Node** is requested by calling {@link
    * XTreeControl.startEditingAtNode()} .
    * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
    * @throws VetoException if thrown the editing will not start.
    */
  def nodeEditing(Node: XTreeNode): Unit = js.native
}

object XTreeEditListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    nodeEdited: (XTreeNode, String) => Unit,
    nodeEditing: XTreeNode => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTreeEditListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), nodeEdited = js.Any.fromFunction2(nodeEdited), nodeEditing = js.Any.fromFunction1(nodeEditing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTreeEditListener]
  }
  @scala.inline
  implicit class XTreeEditListenerOps[Self <: XTreeEditListener] (val x: Self) extends AnyVal {
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
    def setNodeEdited(value: (XTreeNode, String) => Unit): Self = this.set("nodeEdited", js.Any.fromFunction2(value))
    @scala.inline
    def setNodeEditing(value: XTreeNode => Unit): Self = this.set("nodeEditing", js.Any.fromFunction1(value))
  }
  
}

