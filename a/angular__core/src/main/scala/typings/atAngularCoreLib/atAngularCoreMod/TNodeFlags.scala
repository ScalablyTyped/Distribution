package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the TNode.flags property.
  */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`2`
  - atAngularCoreLib.atAngularCoreLibNumbers.`4`
  - atAngularCoreLib.atAngularCoreLibNumbers.`8`
  - atAngularCoreLib.atAngularCoreLibNumbers.`16`
  - atAngularCoreLib.atAngularCoreLibNumbers.`32`
*/
trait TNodeFlags extends js.Object

object TNodeFlags {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** This bit is set if the node has any "class" inputs */
  @scala.inline
  def hasClassInput: atAngularCoreLib.atAngularCoreLibNumbers.`8` = this.cast(8)
  /** This bit is set if any directive on this node has content queries */
  @scala.inline
  def hasContentQuery: atAngularCoreLib.atAngularCoreLibNumbers.`4` = this.cast(4)
  /** This bit is set if the node has any "style" inputs */
  @scala.inline
  def hasStyleInput: atAngularCoreLib.atAngularCoreLibNumbers.`16` = this.cast(16)
  /** This bit is set if the node is a component */
  @scala.inline
  def isComponent: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  /** This bit is set if the node has been detached by i18n */
  @scala.inline
  def isDetached: atAngularCoreLib.atAngularCoreLibNumbers.`32` = this.cast(32)
  /** This bit is set if the node has been projected */
  @scala.inline
  def isProjected: atAngularCoreLib.atAngularCoreLibNumbers.`2` = this.cast(2)
}

