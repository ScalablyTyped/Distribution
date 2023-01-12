package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentOverride extends StObject {
  
  /**
    * A number indicating the order to use to evaluate segment overrides, if there are more than one. Segment overrides with lower numbers are evaluated first.
    */
  var evaluationOrder: Long
  
  /**
    * The ARN of the segment to use.
    */
  var segment: SegmentRef
  
  /**
    * The traffic allocation percentages among the feature variations to assign to this segment. This is a set of key-value pairs. The keys are variation names. The values represent the amount of traffic to allocate to that variation for this segment. This is expressed in thousandths of a percent, so a weight of 50000 represents 50% of traffic.
    */
  var weights: GroupToWeightMap
}
object SegmentOverride {
  
  inline def apply(evaluationOrder: Long, segment: SegmentRef, weights: GroupToWeightMap): SegmentOverride = {
    val __obj = js.Dynamic.literal(evaluationOrder = evaluationOrder.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentOverride] (val x: Self) extends AnyVal {
    
    inline def setEvaluationOrder(value: Long): Self = StObject.set(x, "evaluationOrder", value.asInstanceOf[js.Any])
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setWeights(value: GroupToWeightMap): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
  }
}
