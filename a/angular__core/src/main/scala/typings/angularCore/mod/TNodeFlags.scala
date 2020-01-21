package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`16`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`32`
import typings.angularCore.angularCoreNumbers.`4`
import typings.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the TNode.flags property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`4`
  - typings.angularCore.angularCoreNumbers.`8`
  - typings.angularCore.angularCoreNumbers.`16`
  - typings.angularCore.angularCoreNumbers.`32`
*/
trait TNodeFlags extends js.Object

object TNodeFlags {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** This bit is set if the node has any "class" inputs */
  @scala.inline
  def hasClassInput: `8` = this.cast(8)
  /** This bit is set if any directive on this node has content queries */
  @scala.inline
  def hasContentQuery: `4` = this.cast(4)
  /** This bit is set if the node has any "style" inputs */
  @scala.inline
  def hasStyleInput: `16` = this.cast(16)
  /** This bit is set if the node is a component */
  @scala.inline
  def isComponent: `1` = this.cast(1)
  /** This bit is set if the node has been detached by i18n */
  @scala.inline
  def isDetached: `32` = this.cast(32)
  /** This bit is set if the node has been projected */
  @scala.inline
  def isProjected: `2` = this.cast(2)
}

