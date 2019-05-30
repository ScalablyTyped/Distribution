package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ɵQueryBindingType extends js.Object

@JSImport("@angular/core", "ɵQueryBindingType")
@js.native
object ɵQueryBindingType extends js.Object {
  @js.native
  sealed trait All
    extends atAngularCoreLib.atAngularCoreMod.ɵQueryBindingType
  
  @js.native
  sealed trait First
    extends atAngularCoreLib.atAngularCoreMod.ɵQueryBindingType
  
  /* 1 */ val All: All with scala.Double = js.native
  /* 0 */ val First: First with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.atAngularCoreMod.ɵQueryBindingType with scala.Double] = js.native
}

