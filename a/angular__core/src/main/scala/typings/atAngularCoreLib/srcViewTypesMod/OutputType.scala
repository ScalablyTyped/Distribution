package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputType extends js.Object

@JSImport("@angular/core/src/view/types", "OutputType")
@js.native
object OutputType extends js.Object {
  @js.native
  sealed trait DirectiveOutput
    extends atAngularCoreLib.srcViewTypesMod.OutputType
  
  @js.native
  sealed trait ElementOutput
    extends atAngularCoreLib.srcViewTypesMod.OutputType
  
  /* 1 */ val DirectiveOutput: DirectiveOutput with scala.Double = js.native
  /* 0 */ val ElementOutput: ElementOutput with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.OutputType with scala.Double] = js.native
}

