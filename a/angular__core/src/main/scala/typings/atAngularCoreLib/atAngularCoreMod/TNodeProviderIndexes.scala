package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TNodeProviderIndexes extends js.Object

/**
  * Corresponds to the TNode.providerIndexes property.
  */
@JSImport("@angular/core", "TNodeProviderIndexes")
@js.native
object TNodeProviderIndexes extends js.Object {
  /** The count of view providers from the component on this node is encoded on the 16 most
    significant bits */
  @js.native
  sealed trait CptViewProvidersCountShift
    extends atAngularCoreLib.atAngularCoreMod.TNodeProviderIndexes
  
  @js.native
  sealed trait CptViewProvidersCountShifter
    extends atAngularCoreLib.atAngularCoreMod.TNodeProviderIndexes
  
  /** The index of the first provider on this node is encoded on the least significant bits */
  @js.native
  sealed trait ProvidersStartIndexMask
    extends atAngularCoreLib.atAngularCoreMod.TNodeProviderIndexes
  
}

