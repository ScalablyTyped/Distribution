package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertSummary extends StObject {
  
  /**
    * The ARN of the alert.
    */
  var AlertArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the alert.
    */
  var AlertName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AlertName] = js.undefined
  
  /**
    * The minimum severity for an anomaly to trigger the alert.
    */
  var AlertSensitivityThreshold: js.UndefOr[SensitivityThreshold] = js.undefined
  
  /**
    * The status of the alert.
    */
  var AlertStatus: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AlertStatus] = js.undefined
  
  /**
    * The type of the alert.
    */
  var AlertType: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AlertType] = js.undefined
  
  /**
    * The ARN of the detector to which the alert is attached.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the alert was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the alert was last modified.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The alert's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object AlertSummary {
  
  inline def apply(): AlertSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertSummary] (val x: Self) extends AnyVal {
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
    
    inline def setAlertArnUndefined: Self = StObject.set(x, "AlertArn", js.undefined)
    
    inline def setAlertName(value: AlertName): Self = StObject.set(x, "AlertName", value.asInstanceOf[js.Any])
    
    inline def setAlertNameUndefined: Self = StObject.set(x, "AlertName", js.undefined)
    
    inline def setAlertSensitivityThreshold(value: SensitivityThreshold): Self = StObject.set(x, "AlertSensitivityThreshold", value.asInstanceOf[js.Any])
    
    inline def setAlertSensitivityThresholdUndefined: Self = StObject.set(x, "AlertSensitivityThreshold", js.undefined)
    
    inline def setAlertStatus(value: AlertStatus): Self = StObject.set(x, "AlertStatus", value.asInstanceOf[js.Any])
    
    inline def setAlertStatusUndefined: Self = StObject.set(x, "AlertStatus", js.undefined)
    
    inline def setAlertType(value: AlertType): Self = StObject.set(x, "AlertType", value.asInstanceOf[js.Any])
    
    inline def setAlertTypeUndefined: Self = StObject.set(x, "AlertType", js.undefined)
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
