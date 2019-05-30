package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PreOrderHookFlags extends js.Object

/** More flags associated with an LView (saved in LView[FLAGS_MORE]) */
@JSImport("@angular/core", "PreOrderHookFlags")
@js.native
object PreOrderHookFlags extends js.Object {
  /** The index of the next pre-order hook to be called in the hooks array, on the first 16
    bits */
  @js.native
  sealed trait IndexOfTheNextPreOrderHookMaskMask
    extends atAngularCoreLib.atAngularCoreMod.PreOrderHookFlags
  
  /**
    * The number of init hooks that have already been called, on the last 16 bits
    */
  @js.native
  sealed trait NumberOfInitHooksCalledIncrementer
    extends atAngularCoreLib.atAngularCoreMod.PreOrderHookFlags
  
  @js.native
  sealed trait NumberOfInitHooksCalledMask
    extends atAngularCoreLib.atAngularCoreMod.PreOrderHookFlags
  
  @js.native
  sealed trait NumberOfInitHooksCalledShift
    extends atAngularCoreLib.atAngularCoreMod.PreOrderHookFlags
  
}

