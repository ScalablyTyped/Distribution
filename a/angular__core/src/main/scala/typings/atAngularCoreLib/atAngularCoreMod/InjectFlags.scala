package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InjectFlags extends js.Object

@JSImport("@angular/core", "InjectFlags")
@js.native
object InjectFlags extends js.Object {
  /** Check self and check parent injector if needed */
  @js.native
  sealed trait Default
    extends atAngularCoreLib.atAngularCoreMod.InjectFlags
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host
    extends atAngularCoreLib.atAngularCoreMod.InjectFlags
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional
    extends atAngularCoreLib.atAngularCoreMod.InjectFlags
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self
    extends atAngularCoreLib.atAngularCoreMod.InjectFlags
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf
    extends atAngularCoreLib.atAngularCoreMod.InjectFlags
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Host: Host with scala.Double = js.native
  /* 8 */ val Optional: Optional with scala.Double = js.native
  /* 2 */ val Self: Self with scala.Double = js.native
  /* 4 */ val SkipSelf: SkipSelf with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.InjectFlags with scala.Double] = js.native
}

