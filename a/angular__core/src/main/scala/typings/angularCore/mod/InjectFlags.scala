package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InjectFlags extends js.Object
@JSImport("@angular/core", "InjectFlags")
@js.native
object InjectFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InjectFlags with Double] = js.native
  
  /** Check self and check parent injector if needed */
  @js.native
  sealed trait Default extends InjectFlags
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host extends InjectFlags
  /* 1 */ @js.native
  object Host
    extends TopLevel[typings.angularCore.mod.InjectFlags.Host with Double]
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional extends InjectFlags
  /* 8 */ @js.native
  object Optional
    extends TopLevel[typings.angularCore.mod.InjectFlags.Optional with Double]
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self extends InjectFlags
  /* 2 */ @js.native
  object Self
    extends TopLevel[typings.angularCore.mod.InjectFlags.Self with Double]
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf extends InjectFlags
  /* 4 */ @js.native
  object SkipSelf
    extends TopLevel[typings.angularCore.mod.InjectFlags.SkipSelf with Double]
}
