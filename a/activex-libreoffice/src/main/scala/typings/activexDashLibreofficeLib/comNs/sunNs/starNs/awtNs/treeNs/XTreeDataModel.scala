package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

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
trait XTreeDataModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
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
  def addTreeDataModelListener(Listener: XTreeDataModelListener): scala.Unit
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
  def removeTreeDataModelListener(Listener: XTreeDataModelListener): scala.Unit
}

object XTreeDataModel {
  @scala.inline
  def apply(
    Root: XTreeNode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addTreeDataModelListener: js.Function1[XTreeDataModelListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getRoot: js.Function0[XTreeNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeTreeDataModelListener: js.Function1[XTreeDataModelListener, scala.Unit]
  ): XTreeDataModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Root")(Root)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addTreeDataModelListener")(addTreeDataModelListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getRoot")(getRoot)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeTreeDataModelListener")(removeTreeDataModelListener)
    __obj.asInstanceOf[XTreeDataModel]
  }
}

