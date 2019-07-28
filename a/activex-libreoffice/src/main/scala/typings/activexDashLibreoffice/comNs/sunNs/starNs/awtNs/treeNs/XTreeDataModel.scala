package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
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
trait XTreeDataModel extends XComponent {
  /**
    * Returns the root of the tree.
    *
    * Returns null only if the tree has no nodes.
    * @returns the root of the tree
    */
  val Root: XTreeNode
  /**
    * Adds a listener for the {@link TreeDataModelEvent} posted after the tree changes.
    * @param Listener the listener to add.
    */
  def addTreeDataModelListener(Listener: XTreeDataModelListener): Unit
  /**
    * Returns the root of the tree.
    *
    * Returns null only if the tree has no nodes.
    * @returns the root of the tree
    */
  def getRoot(): XTreeNode
  /**
    * Removes a listener previously added with {@link addTreeDataModelListener()} .
    * @param Listener the listener to remove.
    */
  def removeTreeDataModelListener(Listener: XTreeDataModelListener): Unit
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
    val __obj = js.Dynamic.literal(Root = Root, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addTreeDataModelListener = js.Any.fromFunction1(addTreeDataModelListener), dispose = js.Any.fromFunction0(dispose), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTreeDataModelListener = js.Any.fromFunction1(removeTreeDataModelListener))
  
    __obj.asInstanceOf[XTreeDataModel]
  }
}

