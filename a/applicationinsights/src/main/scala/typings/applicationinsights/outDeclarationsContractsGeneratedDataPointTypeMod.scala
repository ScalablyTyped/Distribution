package typings.applicationinsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/Generated/DataPointType", JSImport.Namespace)
@js.native
object outDeclarationsContractsGeneratedDataPointTypeMod extends js.Object {
  @js.native
  sealed trait DataPointType extends js.Object
  
  /* 1 */ val Aggregation: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Aggregation with Double = js.native
  /* 0 */ val Measurement: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Measurement with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPointType with Double] = js.native
  @js.native
  object DataPointType extends js.Object {
    @js.native
    sealed trait Aggregation extends DataPointType
    
    @js.native
    sealed trait Measurement extends DataPointType
    
  }
  
}

