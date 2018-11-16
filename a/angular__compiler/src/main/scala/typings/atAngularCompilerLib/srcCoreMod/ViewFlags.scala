package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewFlags extends js.Object

@JSImport("@angular/compiler/src/core", "ViewFlags")
@js.native
object ViewFlags extends js.Object {
  @js.native
  sealed trait None
    extends atAngularCompilerLib.srcCoreMod.ViewFlags
  
  @js.native
  sealed trait OnPush
    extends atAngularCompilerLib.srcCoreMod.ViewFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val OnPush: OnPush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewFlags with scala.Double] = js.native
}

