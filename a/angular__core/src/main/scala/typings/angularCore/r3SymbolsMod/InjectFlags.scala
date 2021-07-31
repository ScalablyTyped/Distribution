package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InjectFlags extends StObject
/**
  * Injection flags for DI.
  *
  * @publicApi
  */
@JSImport("@angular/core/src/r3_symbols", "InjectFlags")
@js.native
object InjectFlags extends StObject {
  
  /** Check self and check parent injector if needed */
  @js.native
  sealed trait Default
    extends StObject
       with InjectFlags
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  @js.native
  sealed trait Host
    extends StObject
       with InjectFlags
  
  /** Inject `defaultValue` instead if token not found. */
  @js.native
  sealed trait Optional
    extends StObject
       with InjectFlags
  
  /** Don't ascend to ancestors of the node requesting injection. */
  @js.native
  sealed trait Self
    extends StObject
       with InjectFlags
  
  /** Skip the node that is requesting injection. */
  @js.native
  sealed trait SkipSelf
    extends StObject
       with InjectFlags
}
