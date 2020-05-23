package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event tells you what node is currently expanding or collapsing.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait TreeExpansionEvent extends EventObject {
  var Node: XTreeNode
}

object TreeExpansionEvent {
  @scala.inline
  def apply(Node: XTreeNode, Source: XInterface): TreeExpansionEvent = {
    val __obj = js.Dynamic.literal(Node = Node.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeExpansionEvent]
  }
}

