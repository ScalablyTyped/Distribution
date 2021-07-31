package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InjectFlags extends StObject
@JSImport("@angular/core", "InjectFlags")
@js.native
object InjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InjectFlags & Double] = js.native
  
  /** Check self and check parent injector if needed */
  @js.native
  sealed trait Default
    extends StObject
       with InjectFlags
  /* 0 */ val Default: typings.angularCore.mod.InjectFlags.Default & Double = js.native
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host
    extends StObject
       with InjectFlags
  /* 1 */ val Host: typings.angularCore.mod.InjectFlags.Host & Double = js.native
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional
    extends StObject
       with InjectFlags
  /* 8 */ val Optional: typings.angularCore.mod.InjectFlags.Optional & Double = js.native
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self
    extends StObject
       with InjectFlags
  /* 2 */ val Self: typings.angularCore.mod.InjectFlags.Self & Double = js.native
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf
    extends StObject
       with InjectFlags
  /* 4 */ val SkipSelf: typings.angularCore.mod.InjectFlags.SkipSelf & Double = js.native
}
