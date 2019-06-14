package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags associated with an LView (saved in LView[FLAGS]) */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`3`
  - atAngularCoreLib.atAngularCoreLibNumbers.`4`
  - atAngularCoreLib.atAngularCoreLibNumbers.`8`
  - atAngularCoreLib.atAngularCoreLibNumbers.`16`
  - atAngularCoreLib.atAngularCoreLibNumbers.`32`
  - atAngularCoreLib.atAngularCoreLibNumbers.`64`
  - atAngularCoreLib.atAngularCoreLibNumbers.`128`
  - atAngularCoreLib.atAngularCoreLibNumbers.`256`
  - atAngularCoreLib.atAngularCoreLibNumbers.`512`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1024`
  - atAngularCoreLib.atAngularCoreLibNumbers.`10`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1023`
*/
trait LViewFlags extends js.Object

object LViewFlags {
  /** Whether or not this view is currently attached to change detection tree. */
  @scala.inline
  def Attached: atAngularCoreLib.atAngularCoreLibNumbers.`128` = this.cast(128)
  /** Whether this view has default change detection strategy (checks always) or onPush */
  @scala.inline
  def CheckAlways: atAngularCoreLib.atAngularCoreLibNumbers.`16` = this.cast(16)
  /**
    * Whether or not the view is in creationMode.
    *
    * This must be stored in the view rather than using `data` as a marker so that
    * we can properly support embedded views. Otherwise, when exiting a child view
    * back into the parent view, `data` will be defined and `creationMode` will be
    * improperly reported as false.
    */
  @scala.inline
  def CreationMode: atAngularCoreLib.atAngularCoreLibNumbers.`4` = this.cast(4)
  /** Whether or not this view is destroyed. */
  @scala.inline
  def Destroyed: atAngularCoreLib.atAngularCoreLibNumbers.`256` = this.cast(256)
  /** Whether or not this view is currently dirty (needing check) */
  @scala.inline
  def Dirty: atAngularCoreLib.atAngularCoreLibNumbers.`64` = this.cast(64)
  /**
    * Whether or not this LView instance is on its first processing pass.
    *
    * An LView instance is considered to be on its "first pass" until it
    * has completed one creation mode run and one update mode run. At this
    * time, the flag is turned off.
    */
  @scala.inline
  def FirstLViewPass: atAngularCoreLib.atAngularCoreLibNumbers.`8` = this.cast(8)
  /**
    * Index of the current init phase on last 22 bits
    */
  @scala.inline
  def IndexWithinInitPhaseIncrementer: atAngularCoreLib.atAngularCoreLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def IndexWithinInitPhaseReset: atAngularCoreLib.atAngularCoreLibNumbers.`1023` = this.cast(1023)
  @scala.inline
  def IndexWithinInitPhaseShift: atAngularCoreLib.atAngularCoreLibNumbers.`10` = this.cast(10)
  /** The state of the init phase on the first 2 bits */
  @scala.inline
  def InitPhaseStateIncrementer: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  @scala.inline
  def InitPhaseStateMask: atAngularCoreLib.atAngularCoreLibNumbers.`3` = this.cast(3)
  /** Whether or not this view is the root view */
  @scala.inline
  def IsRoot: atAngularCoreLib.atAngularCoreLibNumbers.`512` = this.cast(512)
  /**
    * Whether or not manual change detection is turned on for onPush components.
    *
    * This is a special mode that only marks components dirty in two cases:
    * 1) There has been a change to an @Input property
    * 2) `markDirty()` has been called manually by the user
    *
    * Note that in this mode, the firing of events does NOT mark components
    * dirty automatically.
    *
    * Manual mode is turned off by default for backwards compatibility, as events
    * automatically mark OnPush components dirty in View Engine.
    *
    * TODO: Add a public API to ChangeDetectionStrategy to turn this mode on
    */
  @scala.inline
  def ManualOnPush: atAngularCoreLib.atAngularCoreLibNumbers.`32` = this.cast(32)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

