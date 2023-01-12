package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledSplitConfig extends StObject {
  
  /**
    * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that variation during this step.  &lt;p&gt;The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic to that variation.&lt;/p&gt; &lt;p&gt;If the sum of the weights for all the variations in a segment override does not add up to 100,000, then the remaining traffic that matches this segment is not assigned by this segment override, and instead moves on to the next segment override or the default traffic split.&lt;/p&gt; 
    */
  var groupWeights: GroupToWeightMap
  
  /**
    * Use this parameter to specify different traffic splits for one or more audience segments. A segment is a portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as age. This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that you have already created, and defines the traffic split for that segment.
    */
  var segmentOverrides: js.UndefOr[SegmentOverridesList] = js.undefined
  
  /**
    * The date and time that this step of the launch starts.
    */
  var startTime: js.Date
}
object ScheduledSplitConfig {
  
  inline def apply(groupWeights: GroupToWeightMap, startTime: js.Date): ScheduledSplitConfig = {
    val __obj = js.Dynamic.literal(groupWeights = groupWeights.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledSplitConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledSplitConfig] (val x: Self) extends AnyVal {
    
    inline def setGroupWeights(value: GroupToWeightMap): Self = StObject.set(x, "groupWeights", value.asInstanceOf[js.Any])
    
    inline def setSegmentOverrides(value: SegmentOverridesList): Self = StObject.set(x, "segmentOverrides", value.asInstanceOf[js.Any])
    
    inline def setSegmentOverridesUndefined: Self = StObject.set(x, "segmentOverrides", js.undefined)
    
    inline def setSegmentOverridesVarargs(value: SegmentOverride*): Self = StObject.set(x, "segmentOverrides", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
