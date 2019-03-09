package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockNode extends js.Object {
  var blockNode: scala.Boolean
  var checkable: scala.Boolean
  var openAnimation: Anon_AppearDone
  var showIcon: scala.Boolean
}

object Anon_BlockNode {
  @scala.inline
  def apply(
    blockNode: scala.Boolean,
    checkable: scala.Boolean,
    openAnimation: Anon_AppearDone,
    showIcon: scala.Boolean
  ): Anon_BlockNode = {
    val __obj = js.Dynamic.literal(blockNode = blockNode, checkable = checkable, openAnimation = openAnimation, showIcon = showIcon)
  
    __obj.asInstanceOf[Anon_BlockNode]
  }
}

