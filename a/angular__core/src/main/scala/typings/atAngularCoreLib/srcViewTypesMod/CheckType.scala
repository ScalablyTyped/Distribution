package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CheckType extends js.Object

@JSImport("@angular/core/src/view/types", "CheckType")
@js.native
object CheckType extends js.Object {
  @js.native
  sealed trait CheckAndUpdate
    extends atAngularCoreLib.srcViewTypesMod.CheckType
  
  @js.native
  sealed trait CheckNoChanges
    extends atAngularCoreLib.srcViewTypesMod.CheckType
  
  /* 0 */ val CheckAndUpdate: CheckAndUpdate with scala.Double = js.native
  /* 1 */ val CheckNoChanges: CheckNoChanges with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.CheckType with scala.Double] = js.native
}

