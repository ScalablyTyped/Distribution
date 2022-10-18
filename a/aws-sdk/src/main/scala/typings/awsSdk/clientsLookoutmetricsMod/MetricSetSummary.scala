package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricSetSummary extends StObject {
  
  /**
    * The ARN of the detector to which the dataset belongs.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the dataset was last modified.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the dataset.
    */
  var MetricSetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The description of the dataset.
    */
  var MetricSetDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetDescription] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var MetricSetName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricSetName] = js.undefined
  
  /**
    * The dataset's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object MetricSetSummary {
  
  inline def apply(): MetricSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricSetSummary]
  }
  
  extension [Self <: MetricSetSummary](x: Self) {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMetricSetArn(value: Arn): Self = StObject.set(x, "MetricSetArn", value.asInstanceOf[js.Any])
    
    inline def setMetricSetArnUndefined: Self = StObject.set(x, "MetricSetArn", js.undefined)
    
    inline def setMetricSetDescription(value: MetricSetDescription): Self = StObject.set(x, "MetricSetDescription", value.asInstanceOf[js.Any])
    
    inline def setMetricSetDescriptionUndefined: Self = StObject.set(x, "MetricSetDescription", js.undefined)
    
    inline def setMetricSetName(value: MetricSetName): Self = StObject.set(x, "MetricSetName", value.asInstanceOf[js.Any])
    
    inline def setMetricSetNameUndefined: Self = StObject.set(x, "MetricSetName", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
