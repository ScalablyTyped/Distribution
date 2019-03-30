package typings
package atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeDetectionStrategy extends js.Object

@JSImport("@angular/core/src/change_detection/constants", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends js.Object {
  /**
    * Use the default `CheckAlways` strategy, in which change detection is automatic until
    * explicitly deactivated.
    */
  @js.native
  sealed trait Default
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy
  
  /**
    * Use the `CheckOnce` strategy, meaning that automatic change detection is deactivated
    * until reactivated by setting the strategy to `Default` (`CheckAlways`).
    * Change detection can still be explicitly invoked.
    * This strategy applies to all child directives and cannot be overridden.
    */
  @js.native
  sealed trait OnPush
    extends atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy
  
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 0 */ val OnPush: OnPush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy with scala.Double
  ] = js.native
}

