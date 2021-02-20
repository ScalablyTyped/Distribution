package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ɵChangeDetectorStatus extends StObject
@JSImport("@angular/core", "\u0275ChangeDetectorStatus")
@js.native
object ɵChangeDetectorStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ɵChangeDetectorStatus with Double] = js.native
  
  /**
    * A state in which change detection continues automatically until explicitly
    * deactivated.
    */
  @js.native
  sealed trait CheckAlways extends ɵChangeDetectorStatus
  /* 2 */ val CheckAlways: typings.angularCore.mod.ɵChangeDetectorStatus.CheckAlways with Double = js.native
  
  /**
    * A state in which, after calling `detectChanges()`, the change detector
    * state becomes `Checked`, and must be explicitly invoked or reactivated.
    */
  @js.native
  sealed trait CheckOnce extends ɵChangeDetectorStatus
  /* 0 */ val CheckOnce: typings.angularCore.mod.ɵChangeDetectorStatus.CheckOnce with Double = js.native
  
  /**
    * A state in which change detection is skipped until the change detector mode
    * becomes `CheckOnce`.
    */
  @js.native
  sealed trait Checked extends ɵChangeDetectorStatus
  /* 1 */ val Checked: typings.angularCore.mod.ɵChangeDetectorStatus.Checked with Double = js.native
  
  /**
    * Indicates that the change detector has been destroyed.
    */
  @js.native
  sealed trait Destroyed extends ɵChangeDetectorStatus
  /* 5 */ val Destroyed: typings.angularCore.mod.ɵChangeDetectorStatus.Destroyed with Double = js.native
  
  /**
    * A state in which a change detector sub tree is not a part of the main tree and
    * should be skipped.
    */
  @js.native
  sealed trait Detached extends ɵChangeDetectorStatus
  /* 3 */ val Detached: typings.angularCore.mod.ɵChangeDetectorStatus.Detached with Double = js.native
  
  /**
    * Indicates that the change detector encountered an error checking a binding
    * or calling a directive lifecycle method and is now in an inconsistent state. Change
    * detectors in this state do not detect changes.
    */
  @js.native
  sealed trait Errored extends ɵChangeDetectorStatus
  /* 4 */ val Errored: typings.angularCore.mod.ɵChangeDetectorStatus.Errored with Double = js.native
}
