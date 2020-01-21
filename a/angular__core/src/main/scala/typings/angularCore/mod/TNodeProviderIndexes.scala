package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`16`
import typings.angularCore.angularCoreNumbers.`65535`
import typings.angularCore.angularCoreNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the TNode.providerIndexes property.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`65535`
  - typings.angularCore.angularCoreNumbers.`16`
  - typings.angularCore.angularCoreNumbers.`65536`
*/
trait TNodeProviderIndexes extends js.Object

object TNodeProviderIndexes {
  /** The count of view providers from the component on this node is encoded on the 16 most
    significant bits */
  @scala.inline
  def CptViewProvidersCountShift: `16` = this.cast(16)
  @scala.inline
  def CptViewProvidersCountShifter: `65536` = this.cast(65536)
  /** The index of the first provider on this node is encoded on the least significant bits */
  @scala.inline
  def ProvidersStartIndexMask: `65535` = this.cast(65535)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

