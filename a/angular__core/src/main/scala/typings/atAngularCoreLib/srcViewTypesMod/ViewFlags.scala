package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewFlags extends js.Object

@JSImport("@angular/core/src/view/types", "ViewFlags")
@js.native
object ViewFlags extends js.Object {
  @js.native
  sealed trait None
    extends atAngularCoreLib.srcViewTypesMod.ViewFlags
  
  @js.native
  sealed trait OnPush
    extends atAngularCoreLib.srcViewTypesMod.ViewFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val OnPush: OnPush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.ViewFlags with scala.Double] = js.native
}

