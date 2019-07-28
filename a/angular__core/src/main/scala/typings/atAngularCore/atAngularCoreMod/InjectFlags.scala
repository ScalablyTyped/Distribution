package typings.atAngularCore.atAngularCoreMod

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
  sealed trait Default extends InjectFlags
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host extends InjectFlags
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional extends InjectFlags
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self extends InjectFlags
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf extends InjectFlags
  
  /* 0 */ val Default: typings.atAngularCore.atAngularCoreMod.InjectFlags.Default with Double = js.native
  /* 1 */ val Host: typings.atAngularCore.atAngularCoreMod.InjectFlags.Host with Double = js.native
  /* 8 */ val Optional: typings.atAngularCore.atAngularCoreMod.InjectFlags.Optional with Double = js.native
  /* 2 */ val Self: typings.atAngularCore.atAngularCoreMod.InjectFlags.Self with Double = js.native
  /* 4 */ val SkipSelf: typings.atAngularCore.atAngularCoreMod.InjectFlags.SkipSelf with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InjectFlags with Double] = js.native
}

