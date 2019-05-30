package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵViewFlags extends js.Object

@JSImport("@angular/core", "ɵViewFlags")
@js.native
object ɵViewFlags extends js.Object {
  @js.native
  sealed trait None
    extends atAngularCoreLib.atAngularCoreMod.ɵViewFlags
  
  @js.native
  sealed trait OnPush
    extends atAngularCoreLib.atAngularCoreMod.ɵViewFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val OnPush: OnPush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵViewFlags with scala.Double] = js.native
}

