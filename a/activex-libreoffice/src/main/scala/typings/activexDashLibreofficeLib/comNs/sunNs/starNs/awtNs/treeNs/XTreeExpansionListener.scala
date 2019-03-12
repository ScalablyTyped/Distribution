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
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    requestChildNodes: TreeExpansionEvent => scala.Unit,
    treeCollapsed: TreeExpansionEvent => scala.Unit,
    treeCollapsing: TreeExpansionEvent => scala.Unit,
    treeExpanded: TreeExpansionEvent => scala.Unit,
    treeExpanding: TreeExpansionEvent => scala.Unit
  ): XTreeExpansionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestChildNodes = js.Any.fromFunction1(requestChildNodes), treeCollapsed = js.Any.fromFunction1(treeCollapsed), treeCollapsing = js.Any.fromFunction1(treeCollapsing), treeExpanded = js.Any.fromFunction1(treeExpanded), treeExpanding = js.Any.fromFunction1(treeExpanding))
  
    __obj.asInstanceOf[XTreeExpansionListener]
  }
}

