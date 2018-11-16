package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeDetectionStrategy extends js.Object

@JSImport("@angular/compiler/src/core", "ChangeDetectionStrategy")
@js.native
object ChangeDetectionStrategy extends js.Object {
  @js.native
  sealed trait Default
    extends atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy
  
  @js.native
  sealed trait OnPush
    extends atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy
  
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 0 */ val OnPush: OnPush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ChangeDetectionStrategy with scala.Double] = js.native
}

