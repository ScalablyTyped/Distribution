package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵArgumentType extends js.Object

@JSImport("@angular/core", "ɵArgumentType")
@js.native
object ɵArgumentType extends js.Object {
  @js.native
  sealed trait Dynamic
    extends atAngularCoreLib.atAngularCoreMod.ɵArgumentType
  
  @js.native
  sealed trait Inline
    extends atAngularCoreLib.atAngularCoreMod.ɵArgumentType
  
  /* 1 */ val Dynamic: Dynamic with scala.Double = js.native
  /* 0 */ val Inline: Inline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵArgumentType with scala.Double] = js.native
}

