package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LViewFlags extends js.Object

/** Flags associated with an LView (saved in LView[FLAGS]) */
@JSImport("@angular/core", "LViewFlags")
@js.native
object LViewFlags extends js.Object {
  /** Whether or not this view is currently attached to change detection tree. */
  @js.native
  sealed trait Attached
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /** Whether this view has default change detection strategy (checks always) or onPush */
  @js.native
  sealed trait CheckAlways
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /**
    * Whether or not the view is in creationMode.
    *
    * This must be stored in the view rather than using `data` as a marker so that
    * we can properly support embedded views. Otherwise, when exiting a child view
    * back into the parent view, `data` will be defined and `creationMode` will be
    * improperly reported as false.
    */
  @js.native
  sealed trait CreationMode
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /** Whether or not this view is destroyed. */
  @js.native
  sealed trait Destroyed
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /** Whether or not this view is currently dirty (needing check) */
  @js.native
  sealed trait Dirty
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /**
    * Whether or not this LView instance is on its first processing pass.
    *
    * An LView instance is considered to be on its "first pass" until it
    * has completed one creation mode run and one update mode run. At this
    * time, the flag is turned off.
    */
  @js.native
  sealed trait FirstLViewPass
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /**
    * Index of the current init phase on last 22 bits
    */
  @js.native
  sealed trait IndexWithinInitPhaseIncrementer
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  @js.native
  sealed trait IndexWithinInitPhaseReset
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  @js.native
  sealed trait IndexWithinInitPhaseShift
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /** The state of the init phase on the first 2 bits */
  @js.native
  sealed trait InitPhaseStateIncrementer
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  @js.native
  sealed trait InitPhaseStateMask
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
  /** Whether or not this view is the root view */
  @js.native
  sealed trait IsRoot
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
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
  @js.native
  sealed trait ManualOnPush
    extends atAngularCoreLib.atAngularCoreMod.LViewFlags
  
}

