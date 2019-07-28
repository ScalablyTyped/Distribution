package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeDetectionStrategy extends js.Object

@JSImport("@angular/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends js.Object {
  /**
    * Use the default `CheckAlways` strategy, in which change detection is automatic until
    * explicitly deactivated.
    */
  @js.native
  sealed trait Default extends ChangeDetectionStrategy
  
  /**
    * Use the `CheckOnce` strategy, meaning that automatic change detection is deactivated
    * until reactivated by setting the strategy to `Default` (`CheckAlways`).
    * Change detection can still be explicitly invoked.
    * This strategy applies to all child directives and cannot be overridden.
    */
  @js.native
  sealed trait OnPush extends ChangeDetectionStrategy
  
  /* 1 */ val Default: typings.atAngularCore.atAngularCoreMod.ChangeDetectionStrategy.Default with Double = js.native
  /* 0 */ val OnPush: typings.atAngularCore.atAngularCoreMod.ChangeDetectionStrategy.OnPush with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
}

