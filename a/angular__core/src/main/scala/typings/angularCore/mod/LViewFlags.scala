package typings.angularCore.mod

import typings.angularCore.angularCoreInts.`1024`
import typings.angularCore.angularCoreInts.`11`
import typings.angularCore.angularCoreInts.`128`
import typings.angularCore.angularCoreInts.`16`
import typings.angularCore.angularCoreInts.`1`
import typings.angularCore.angularCoreInts.`2047`
import typings.angularCore.angularCoreInts.`2048`
import typings.angularCore.angularCoreInts.`256`
import typings.angularCore.angularCoreInts.`32`
import typings.angularCore.angularCoreInts.`3`
import typings.angularCore.angularCoreInts.`4`
import typings.angularCore.angularCoreInts.`512`
import typings.angularCore.angularCoreInts.`64`
import typings.angularCore.angularCoreInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Flags associated with an LView (saved in LView[FLAGS]) */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreInts.`1`
  - typings.angularCore.angularCoreInts.`3`
  - typings.angularCore.angularCoreInts.`4`
  - typings.angularCore.angularCoreInts.`8`
  - typings.angularCore.angularCoreInts.`16`
  - typings.angularCore.angularCoreInts.`32`
  - typings.angularCore.angularCoreInts.`64`
  - typings.angularCore.angularCoreInts.`128`
  - typings.angularCore.angularCoreInts.`256`
  - typings.angularCore.angularCoreInts.`512`
  - typings.angularCore.angularCoreInts.`1024`
  - typings.angularCore.angularCoreInts.`2048`
  - typings.angularCore.angularCoreInts.`11`
  - typings.angularCore.angularCoreInts.`2047`
*/
trait LViewFlags extends StObject
object LViewFlags {
  
  /** Whether or not this view is currently attached to change detection tree. */
  inline def Attached: `64` = 64.asInstanceOf[`64`]
  
  /** Whether this view has default change detection strategy (checks always) or onPush */
  inline def CheckAlways: `16` = 16.asInstanceOf[`16`]
  
  /**
    * Whether or not the view is in creationMode.
    *
    * This must be stored in the view rather than using `data` as a marker so that
    * we can properly support embedded views. Otherwise, when exiting a child view
    * back into the parent view, `data` will be defined and `creationMode` will be
    * improperly reported as false.
    */
  inline def CreationMode: `4` = 4.asInstanceOf[`4`]
  
  /** Whether or not this view is destroyed. */
  inline def Destroyed: `128` = 128.asInstanceOf[`128`]
  
  /** Whether or not this view is currently dirty (needing check) */
  inline def Dirty: `32` = 32.asInstanceOf[`32`]
  
  /**
    * Whether or not this LView instance is on its first processing pass.
    *
    * An LView instance is considered to be on its "first pass" until it
    * has completed one creation mode run and one update mode run. At this
    * time, the flag is turned off.
    */
  inline def FirstLViewPass: `8` = 8.asInstanceOf[`8`]
  
  /** Indicates that the view **or any of its ancestors** have an embedded view injector. */
  inline def HasEmbeddedViewInjector: `1024` = 1024.asInstanceOf[`1024`]
  
  /**
    * Index of the current init phase on last 21 bits
    */
  inline def IndexWithinInitPhaseIncrementer: `2048` = 2048.asInstanceOf[`2048`]
  
  inline def IndexWithinInitPhaseReset: `2047` = 2047.asInstanceOf[`2047`]
  
  inline def IndexWithinInitPhaseShift: `11` = 11.asInstanceOf[`11`]
  
  /** The state of the init phase on the first 2 bits */
  inline def InitPhaseStateIncrementer: `1` = 1.asInstanceOf[`1`]
  
  inline def InitPhaseStateMask: `3` = 3.asInstanceOf[`3`]
  
  /** Whether or not this view is the root view */
  inline def IsRoot: `256` = 256.asInstanceOf[`256`]
  
  /**
    * Whether this moved LView was needs to be refreshed at the insertion location because the
    * declaration was dirty.
    */
  inline def RefreshTransplantedView: `512` = 512.asInstanceOf[`512`]
}
