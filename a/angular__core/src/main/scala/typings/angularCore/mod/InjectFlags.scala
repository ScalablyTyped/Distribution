package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InjectFlags extends StObject
@JSImport("@angular/core", "InjectFlags")
@js.native
object InjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InjectFlags with Double] = js.native
  
  /** Check self and check parent injector if needed */
  @js.native
  sealed trait Default extends InjectFlags
  /* 0 */ val Default: typings.angularCore.mod.InjectFlags.Default with Double = js.native
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host extends InjectFlags
  /* 1 */ val Host: typings.angularCore.mod.InjectFlags.Host with Double = js.native
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional extends InjectFlags
  /* 8 */ val Optional: typings.angularCore.mod.InjectFlags.Optional with Double = js.native
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self extends InjectFlags
  /* 2 */ val Self: typings.angularCore.mod.InjectFlags.Self with Double = js.native
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf extends InjectFlags
  /* 4 */ val SkipSelf: typings.angularCore.mod.InjectFlags.SkipSelf with Double = js.native
}
