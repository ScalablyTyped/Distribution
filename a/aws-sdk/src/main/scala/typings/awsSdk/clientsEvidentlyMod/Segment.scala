package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /**
    * The ARN of the segment.
    */
  var arn: SegmentArn
  
  /**
    * The date and time that this segment was created.
    */
  var createdTime: js.Date
  
  /**
    * The customer-created description for this segment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The number of experiments that this segment is used in. This count includes all current experiments, not just those that are currently running.
    */
  var experimentCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The date and time that this segment was most recently updated.
    */
  var lastUpdatedTime: js.Date
  
  /**
    * The number of launches that this segment is used in. This count includes all current launches, not just those that are currently running.
    */
  var launchCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the segment.
    */
  var name: SegmentName
  
  /**
    * The pattern that defines the attributes to use to evalute whether a user session will be in the segment. For more information about the pattern syntax, see Segment rule pattern syntax.
    */
  var pattern: SegmentPattern
  
  /**
    * The list of tag keys and values associated with this launch.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object Segment {
  
  inline def apply(
    arn: SegmentArn,
    createdTime: js.Date,
    lastUpdatedTime: js.Date,
    name: SegmentName,
    pattern: SegmentPattern
  ): Segment = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdTime = createdTime.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SegmentArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimentCount(value: Long): Self = StObject.set(x, "experimentCount", value.asInstanceOf[js.Any])
    
    inline def setExperimentCountUndefined: Self = StObject.set(x, "experimentCount", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchCount(value: Long): Self = StObject.set(x, "launchCount", value.asInstanceOf[js.Any])
    
    inline def setLaunchCountUndefined: Self = StObject.set(x, "launchCount", js.undefined)
    
    inline def setName(value: SegmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: SegmentPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
