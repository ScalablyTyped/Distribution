package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵChangeDetectorStatus extends js.Object

@JSImport("@angular/core", "ɵChangeDetectorStatus")
@js.native
object ɵChangeDetectorStatus extends js.Object {
  /**
    * A state in which change detection continues automatically until explicitly
    * deactivated.
    */
  @js.native
  sealed trait CheckAlways extends ɵChangeDetectorStatus
  
  /**
    * A state in which, after calling `detectChanges()`, the change detector
    * state becomes `Checked`, and must be explicitly invoked or reactivated.
    */
  @js.native
  sealed trait CheckOnce extends ɵChangeDetectorStatus
  
  /**
    * A state in which change detection is skipped until the change detector mode
    * becomes `CheckOnce`.
    */
  @js.native
  sealed trait Checked extends ɵChangeDetectorStatus
  
  /**
    * Indicates that the change detector has been destroyed.
    */
  @js.native
  sealed trait Destroyed extends ɵChangeDetectorStatus
  
  /**
    * A state in which a change detector sub tree is not a part of the main tree and
    * should be skipped.
    */
  @js.native
  sealed trait Detached extends ɵChangeDetectorStatus
  
  /**
    * Indicates that the change detector encountered an error checking a binding
    * or calling a directive lifecycle method and is now in an inconsistent state. Change
    * detectors in this state do not detect changes.
    */
  @js.native
  sealed trait Errored extends ɵChangeDetectorStatus
  
  /* 2 */ val CheckAlways: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.CheckAlways with Double = js.native
  /* 0 */ val CheckOnce: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.CheckOnce with Double = js.native
  /* 1 */ val Checked: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.Checked with Double = js.native
  /* 5 */ val Destroyed: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.Destroyed with Double = js.native
  /* 3 */ val Detached: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.Detached with Double = js.native
  /* 4 */ val Errored: typings.atAngularCore.atAngularCoreMod.ɵChangeDetectorStatus.Errored with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ɵChangeDetectorStatus with Double] = js.native
}

