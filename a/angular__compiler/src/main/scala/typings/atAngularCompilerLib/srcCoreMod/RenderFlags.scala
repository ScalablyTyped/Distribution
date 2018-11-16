package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderFlags extends js.Object

@JSImport("@angular/compiler/src/core", "RenderFlags")
@js.native
object RenderFlags extends js.Object {
  @js.native
  sealed trait Create
    extends atAngularCompilerLib.srcCoreMod.RenderFlags
  
  @js.native
  sealed trait Update
    extends atAngularCompilerLib.srcCoreMod.RenderFlags
  
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.RenderFlags with scala.Double] = js.native
}

