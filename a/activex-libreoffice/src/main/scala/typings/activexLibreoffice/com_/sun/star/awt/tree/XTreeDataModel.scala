package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link TreeControl} to retrieve the hierarchical outline data that is displayed in the actual control.
  *
  * If you implement your own {@link XTreeDataModel} you need to notify registered {@link XTreeDataModelListener} if your model changes after the control
  * is created. If this is not done correctly the {@link TreeControl} will not update the data properly.
  *
  * If you do not need your own model implementation, you can also use the {@link MutableTreeDataModel} .
  */
@js.native
trait XTreeDataModel extends XComponent {
  /**
    * Returns the root of the tree.
    *
    * Returns null only if the tree has no nodes.
    * @returns the root of the tree
    */
  val Root: XTreeNode = js.native
  /**
    * Adds a listener for the {@link TreeDataModelEvent} posted after the tree changes.
    * @param Listener the listener to add.
    */
  def addTreeDataModelListener(Listener: XTreeDataModelListener): Unit = js.native
  /**
    * Returns the root of the tree.
    *
    * Returns null only if the tree has no nodes.
    * @returns the root of the tree
    */
  def getRoot(): XTreeNode = js.native
  /**
    * Removes a listener previously added with {@link addTreeDataModelListener()} .
    * @param Listener the listener to remove.
    */
  def removeTreeDataModelListener(Listener: XTreeDataModelListener): Unit = js.native
}

object XTreeDataModel {
  @scala.inline
  def apply(
    Root: XTreeNode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addTreeDataModelListener: XTreeDataModelListener => Unit,
    dispose: () => Unit,
    getRoot: () => XTreeNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeTreeDataModelListener: XTreeDataModelListener => Unit
  ): XTreeDataModel = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addTreeDataModelListener = js.Any.fromFunction1(addTreeDataModelListener), dispose = js.Any.fromFunction0(dispose), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTreeDataModelListener = js.Any.fromFunction1(removeTreeDataModelListener))
    __obj.asInstanceOf[XTreeDataModel]
  }
  @scala.inline
  implicit class XTreeDataModelOps[Self <: XTreeDataModel] (val x: Self) extends AnyVal {
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
    def setRoot(value: XTreeNode): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTreeDataModelListener(value: XTreeDataModelListener => Unit): Self = this.set("addTreeDataModelListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRoot(value: () => XTreeNode): Self = this.set("getRoot", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveTreeDataModelListener(value: XTreeDataModelListener => Unit): Self = this.set("removeTreeDataModelListener", js.Any.fromFunction1(value))
  }
  
}

