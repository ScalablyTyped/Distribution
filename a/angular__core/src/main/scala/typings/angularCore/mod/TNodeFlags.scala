package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`128`
import typings.angularCore.angularCoreNumbers.`16`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`32`
import typings.angularCore.angularCoreNumbers.`4`
import typings.angularCore.angularCoreNumbers.`64`
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
  - typings.angularCore.angularCoreNumbers.`64`
  - typings.angularCore.angularCoreNumbers.`128`
*/
trait TNodeFlags extends js.Object

object TNodeFlags {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** Bit #5 - This bit is set if the node has any "class" inputs */
  @scala.inline
  def hasClassInput: `16` = this.cast(16)
  /** Bit #4 - This bit is set if any directive on this node has content queries */
  @scala.inline
  def hasContentQuery: `8` = this.cast(8)
  /**
    * Bit #8 - This bit is set if the node has directives with host bindings.
    *
    * This flags allows us to guard host-binding logic and invoke it only on nodes
    * that actually have directives with host bindings.
    */
  @scala.inline
  def hasHostBindings: `128` = this.cast(128)
  /** Bit #6 - This bit is set if the node has any "style" inputs */
  @scala.inline
  def hasStyleInput: `32` = this.cast(32)
  /**
    * Bit #2 - This bit is set if the node is a host for a component.
    *
    * Setting this bit implies that the `isDirectiveHost` bit is set as well.
    * */
  @scala.inline
  def isComponentHost: `2` = this.cast(2)
  /** Bit #7 This bit is set if the node has been detached by i18n */
  @scala.inline
  def isDetached: `64` = this.cast(64)
  /** Bit #1 - This bit is set if the node is a host for any directive (including a component) */
  @scala.inline
  def isDirectiveHost: `1` = this.cast(1)
  /** Bit #3 - This bit is set if the node has been projected */
  @scala.inline
  def isProjected: `4` = this.cast(4)
}

