package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryBindingType extends js.Object

@JSImport("@angular/compiler/src/core", "QueryBindingType")
@js.native
object QueryBindingType extends js.Object {
  @js.native
  sealed trait All
    extends atAngularCompilerLib.srcCoreMod.QueryBindingType
  
  @js.native
  sealed trait First
    extends atAngularCompilerLib.srcCoreMod.QueryBindingType
  
  /* 1 */ val All: All with scala.Double = js.native
  /* 0 */ val First: First with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.QueryBindingType with scala.Double] = js.native
}

