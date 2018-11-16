package typings
package applicationinsightsDashJsLib.AINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DependencySourceType extends js.Object

@JSGlobal("AI.DependencySourceType")
@js.native
object DependencySourceType extends js.Object {
  @js.native
  sealed trait Aic
    extends applicationinsightsDashJsLib.AINs.DependencySourceType
  
  @js.native
  sealed trait Apmc
    extends applicationinsightsDashJsLib.AINs.DependencySourceType
  
  @js.native
  sealed trait Undefined
    extends applicationinsightsDashJsLib.AINs.DependencySourceType
  
  /* 1 */ val Aic: Aic with scala.Double = js.native
  /* 2 */ val Apmc: Apmc with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[applicationinsightsDashJsLib.AINs.DependencySourceType with scala.Double] = js.native
}

