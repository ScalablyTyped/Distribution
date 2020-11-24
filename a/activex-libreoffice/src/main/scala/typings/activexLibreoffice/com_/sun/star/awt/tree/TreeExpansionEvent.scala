package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event tells you what node is currently expanding or collapsing.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
@js.native
trait TreeExpansionEvent extends EventObject {
  
  var Node: XTreeNode = js.native
}
object TreeExpansionEvent {
  
  @scala.inline
  def apply(Node: XTreeNode, Source: XInterface): TreeExpansionEvent = {
    val __obj = js.Dynamic.literal(Node = Node.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeExpansionEvent]
  }
  
  @scala.inline
  implicit class TreeExpansionEventOps[Self <: TreeExpansionEvent] (val x: Self) extends AnyVal {
    
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
    def setNode(value: XTreeNode): Self = this.set("Node", value.asInstanceOf[js.Any])
  }
}
