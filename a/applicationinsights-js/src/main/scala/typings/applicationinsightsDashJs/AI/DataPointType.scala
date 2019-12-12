package typings.applicationinsightsDashJs.AI

import org.scalablytyped.runtime.TopLevel
import typings.applicationinsightsDashJs.AI.DataPointType.Aggregation
import typings.applicationinsightsDashJs.AI.DataPointType.Measurement
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPointType with Double] = js.native
  /* 1 */ @js.native
  object Aggregation extends TopLevel[Aggregation with Double]
  
  /* 0 */ @js.native
  object Measurement extends TopLevel[Measurement with Double]
  
}

