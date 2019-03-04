package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface can get notifications from a {@link TreeControl} when nodes are expanded or collapsed.
  * @see XTreeControl.addTreeExpansionListener
  * @see XTreeControl.removeTreeExpansionListener
  */
trait XTreeExpansionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Invoked when a node with children on demand is about to be expanded.
    *
    * This event is invoked before the {@link treeExpanding()} event.
    */
  def requestChildNodes(Event: TreeExpansionEvent): scala.Unit
  /** Called whenever a node in the tree has been successfully collapsed. */
  def treeCollapsed(Event: TreeExpansionEvent): scala.Unit
  /**
    * Invoked whenever a node in the tree is about to be collapsed.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that collapsing {@link TreeExpansionEvent.Node} should fail.
    */
  def treeCollapsing(Event: TreeExpansionEvent): scala.Unit
  /** Called whenever a node in the tree has been successfully expanded. */
  def treeExpanded(Event: TreeExpansionEvent): scala.Unit
  /**
    * Invoked whenever a node in the tree is about to be expanded.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that expanding {@link TreeExpansionEvent.Node} should fail.
    */
  def treeExpanding(Event: TreeExpansionEvent): scala.Unit
}

object XTreeExpansionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    requestChildNodes: js.Function1[TreeExpansionEvent, scala.Unit],
    treeCollapsed: js.Function1[TreeExpansionEvent, scala.Unit],
    treeCollapsing: js.Function1[TreeExpansionEvent, scala.Unit],
    treeExpanded: js.Function1[TreeExpansionEvent, scala.Unit],
    treeExpanding: js.Function1[TreeExpansionEvent, scala.Unit]
  ): XTreeExpansionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, requestChildNodes = requestChildNodes, treeCollapsed = treeCollapsed, treeCollapsing = treeCollapsing, treeExpanded = treeExpanded, treeExpanding = treeExpanding)
  
    __obj.asInstanceOf[XTreeExpansionListener]
  }
}

