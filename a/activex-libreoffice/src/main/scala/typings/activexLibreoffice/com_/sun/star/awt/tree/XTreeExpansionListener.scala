package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface can get notifications from a {@link TreeControl} when nodes are expanded or collapsed.
  * @see XTreeControl.addTreeExpansionListener
  * @see XTreeControl.removeTreeExpansionListener
  */
@js.native
trait XTreeExpansionListener extends XEventListener {
  /**
    * Invoked when a node with children on demand is about to be expanded.
    *
    * This event is invoked before the {@link treeExpanding()} event.
    */
  def requestChildNodes(Event: TreeExpansionEvent): Unit = js.native
  /** Called whenever a node in the tree has been successfully collapsed. */
  def treeCollapsed(Event: TreeExpansionEvent): Unit = js.native
  /**
    * Invoked whenever a node in the tree is about to be collapsed.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that collapsing {@link TreeExpansionEvent.Node} should fail.
    */
  def treeCollapsing(Event: TreeExpansionEvent): Unit = js.native
  /** Called whenever a node in the tree has been successfully expanded. */
  def treeExpanded(Event: TreeExpansionEvent): Unit = js.native
  /**
    * Invoked whenever a node in the tree is about to be expanded.
    * @throws ExpandVetoException to notify the calling {@link XTreeControl} that expanding {@link TreeExpansionEvent.Node} should fail.
    */
  def treeExpanding(Event: TreeExpansionEvent): Unit = js.native
}

object XTreeExpansionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestChildNodes: TreeExpansionEvent => Unit,
    treeCollapsed: TreeExpansionEvent => Unit,
    treeCollapsing: TreeExpansionEvent => Unit,
    treeExpanded: TreeExpansionEvent => Unit,
    treeExpanding: TreeExpansionEvent => Unit
  ): XTreeExpansionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestChildNodes = js.Any.fromFunction1(requestChildNodes), treeCollapsed = js.Any.fromFunction1(treeCollapsed), treeCollapsing = js.Any.fromFunction1(treeCollapsing), treeExpanded = js.Any.fromFunction1(treeExpanded), treeExpanding = js.Any.fromFunction1(treeExpanding))
    __obj.asInstanceOf[XTreeExpansionListener]
  }
  @scala.inline
  implicit class XTreeExpansionListenerOps[Self <: XTreeExpansionListener] (val x: Self) extends AnyVal {
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
    def setRequestChildNodes(value: TreeExpansionEvent => Unit): Self = this.set("requestChildNodes", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeCollapsed(value: TreeExpansionEvent => Unit): Self = this.set("treeCollapsed", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeCollapsing(value: TreeExpansionEvent => Unit): Self = this.set("treeCollapsing", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeExpanded(value: TreeExpansionEvent => Unit): Self = this.set("treeExpanded", js.Any.fromFunction1(value))
    @scala.inline
    def setTreeExpanding(value: TreeExpansionEvent => Unit): Self = this.set("treeExpanding", js.Any.fromFunction1(value))
  }
  
}

