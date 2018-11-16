package typings
package atAngularCoreLib.srcViewUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderNodeAction extends js.Object

@JSImport("@angular/core/src/view/util", "RenderNodeAction")
@js.native
object RenderNodeAction extends js.Object {
  @js.native
  sealed trait AppendChild
    extends atAngularCoreLib.srcViewUtilMod.RenderNodeAction
  
  @js.native
  sealed trait Collect
    extends atAngularCoreLib.srcViewUtilMod.RenderNodeAction
  
  @js.native
  sealed trait InsertBefore
    extends atAngularCoreLib.srcViewUtilMod.RenderNodeAction
  
  @js.native
  sealed trait RemoveChild
    extends atAngularCoreLib.srcViewUtilMod.RenderNodeAction
  
  /* 1 */ val AppendChild: AppendChild with scala.Double = js.native
  /* 0 */ val Collect: Collect with scala.Double = js.native
  /* 2 */ val InsertBefore: InsertBefore with scala.Double = js.native
  /* 3 */ val RemoveChild: RemoveChild with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewUtilMod.RenderNodeAction with scala.Double] = js.native
}

