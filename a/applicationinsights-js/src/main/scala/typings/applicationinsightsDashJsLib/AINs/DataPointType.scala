package typings
package applicationinsightsDashJsLib.AINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPointType extends js.Object

@JSGlobal("AI.DataPointType")
@js.native
object DataPointType extends js.Object {
  @js.native
  sealed trait Aggregation
    extends applicationinsightsDashJsLib.AINs.DataPointType
  
  @js.native
  sealed trait Measurement
    extends applicationinsightsDashJsLib.AINs.DataPointType
  
  /* 1 */ val Aggregation: Aggregation with scala.Double = js.native
  /* 0 */ val Measurement: Measurement with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[applicationinsightsDashJsLib.AINs.DataPointType with scala.Double] = js.native
}

