package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeDetectorStatus extends js.Object

@JSImport("@angular/core/src/change_detection/constants", "ChangeDetectorStatus")
@js.native
object ChangeDetectorStatus extends js.Object {
  /**
    * A state in which change detection continues automatically until explicitly
    * deactivated.
    */
  @js.native
  sealed trait CheckAlways
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /**
    * A state in which, after calling `detectChanges()`, the change detector
    * state becomes `Checked`, and must be explicitly invoked or reactivated.
    */
  @js.native
  sealed trait CheckOnce
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /**
    * A state in which change detection is skipped until the change detector mode
    * becomes `CheckOnce`.
    */
  @js.native
  sealed trait Checked
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /**
    * Indicates that the change detector has been destroyed.
    */
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /**
    * A state in which a change detector sub tree is not a part of the main tree and
    * should be skipped.
    */
  @js.native
  sealed trait Detached
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /**
    * Indicates that the change detector encountered an error checking a binding
    * or calling a directive lifecycle method and is now in an inconsistent state. Change
    * detectors in this state do not detect changes.
    */
  @js.native
  sealed trait Errored
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus
  
  /* 2 */ val CheckAlways: CheckAlways with scala.Double = js.native
  /* 0 */ val CheckOnce: CheckOnce with scala.Double = js.native
  /* 1 */ val Checked: Checked with scala.Double = js.native
  /* 5 */ val Destroyed: Destroyed with scala.Double = js.native
  /* 3 */ val Detached: Detached with scala.Double = js.native
  /* 4 */ val Errored: Errored with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectorStatus with scala.Double
  ] = js.native
}

