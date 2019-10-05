package typings.applicationinsightsDashJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPointType extends js.Object

@JSGlobal("AI.DataPointType")
@js.native
object DataPointType extends js.Object {
  @js.native
  sealed trait Aggregation extends DataPointType
  
  @js.native
  sealed trait Measurement extends DataPointType
  
  /* 1 */ val Aggregation: typings.applicationinsightsDashJs.AI.DataPointType.Aggregation with Double = js.native
  /* 0 */ val Measurement: typings.applicationinsightsDashJs.AI.DataPointType.Measurement with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPointType with Double] = js.native
}

