package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCore.atAngularCoreMod.ChangeDetectionStrategy.Default
import typings.atAngularCore.atAngularCoreMod.ChangeDetectionStrategy.OnPush
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
  /* 1 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 0 */ @js.native
  object OnPush extends TopLevel[OnPush with Double]
  
}

