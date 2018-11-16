package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryBindingType extends js.Object

@JSImport("@angular/core/src/view/types", "QueryBindingType")
@js.native
object QueryBindingType extends js.Object {
  @js.native
  sealed trait All
    extends atAngularCoreLib.srcViewTypesMod.QueryBindingType
  
  @js.native
  sealed trait First
    extends atAngularCoreLib.srcViewTypesMod.QueryBindingType
  
  /* 1 */ val All: All with scala.Double = js.native
  /* 0 */ val First: First with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.QueryBindingType with scala.Double] = js.native
}

