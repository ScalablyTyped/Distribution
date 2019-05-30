package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵRenderFlags extends js.Object

@JSImport("@angular/core", "ɵRenderFlags")
@js.native
object ɵRenderFlags extends js.Object {
  @js.native
  sealed trait Create
    extends atAngularCoreLib.atAngularCoreMod.ɵRenderFlags
  
  @js.native
  sealed trait Update
    extends atAngularCoreLib.atAngularCoreMod.ɵRenderFlags
  
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵRenderFlags with scala.Double] = js.native
}

