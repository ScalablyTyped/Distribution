package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeDetectionStrategy extends js.Object

@JSImport("@angular/compiler/src/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends js.Object {
  @js.native
  sealed trait Default extends ChangeDetectionStrategy
  
  @js.native
  sealed trait OnPush extends ChangeDetectionStrategy
  
  /* 1 */ val Default: typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy.Default with Double = js.native
  /* 0 */ val OnPush: typings.atAngularCompiler.srcCoreMod.ChangeDetectionStrategy.OnPush with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeDetectionStrategy with Double] = js.native
}

