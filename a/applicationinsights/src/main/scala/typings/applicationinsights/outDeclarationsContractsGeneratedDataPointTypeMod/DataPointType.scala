package typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPointType extends js.Object

@JSImport("applicationinsights/out/Declarations/Contracts/Generated/DataPointType", "DataPointType")
@js.native
object DataPointType extends js.Object {
  @js.native
  sealed trait Aggregation extends DataPointType
  
  @js.native
  sealed trait Measurement extends DataPointType
  
}

