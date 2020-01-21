package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InjectFlags extends js.Object

/**
  * Injection flags for DI.
  *
  * @publicApi
  */
@JSImport("@angular/core/src/r3_symbols", "InjectFlags")
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
  
}

