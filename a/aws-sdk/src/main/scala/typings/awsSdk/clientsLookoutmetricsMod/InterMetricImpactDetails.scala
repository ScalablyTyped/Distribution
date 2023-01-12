package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterMetricImpactDetails extends StObject {
  
  /**
    * The ID of the anomaly group.
    */
  var AnomalyGroupId: js.UndefOr[UUID] = js.undefined
  
  /**
    * For potential causes (CAUSE_OF_INPUT_ANOMALY_GROUP), the percentage contribution the measure has in causing the anomalies.
    */
  var ContributionPercentage: js.UndefOr[MetricChangePercentage] = js.undefined
  
  /**
    * The name of the measure.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricName] = js.undefined
  
  /**
    * Whether a measure is a potential cause of the anomaly group (CAUSE_OF_INPUT_ANOMALY_GROUP), or whether the measure is impacted by the anomaly group (EFFECT_OF_INPUT_ANOMALY_GROUP).
    */
  var RelationshipType: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.RelationshipType] = js.undefined
}
object InterMetricImpactDetails {
  
  inline def apply(): InterMetricImpactDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterMetricImpactDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterMetricImpactDetails] (val x: Self) extends AnyVal {
    
    inline def setAnomalyGroupId(value: UUID): Self = StObject.set(x, "AnomalyGroupId", value.asInstanceOf[js.Any])
    
    inline def setAnomalyGroupIdUndefined: Self = StObject.set(x, "AnomalyGroupId", js.undefined)
    
    inline def setContributionPercentage(value: MetricChangePercentage): Self = StObject.set(x, "ContributionPercentage", value.asInstanceOf[js.Any])
    
    inline def setContributionPercentageUndefined: Self = StObject.set(x, "ContributionPercentage", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setRelationshipType(value: RelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeUndefined: Self = StObject.set(x, "RelationshipType", js.undefined)
  }
}
