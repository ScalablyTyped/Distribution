package typings.applicationinsightsJs.AI

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
  
}

