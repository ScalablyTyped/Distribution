package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetECSServiceRecommendationProjectedMetricsRequest extends StObject {
  
  /**
    *  The timestamp of the last projected metrics data point to return. 
    */
  var endTime: js.Date
  
  /**
    *  The granularity, in seconds, of the projected metrics data points. 
    */
  var period: Period
  
  /**
    *  The ARN that identifies the Amazon ECS service.   The following is the format of the ARN:   arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name 
    */
  var serviceArn: ServiceArn
  
  /**
    *  The timestamp of the first projected metrics data point to return. 
    */
  var startTime: js.Date
  
  /**
    *  The statistic of the projected metrics. 
    */
  var stat: MetricStatistic
}
object GetECSServiceRecommendationProjectedMetricsRequest {
  
  inline def apply(
    endTime: js.Date,
    period: Period,
    serviceArn: ServiceArn,
    startTime: js.Date,
    stat: MetricStatistic
  ): GetECSServiceRecommendationProjectedMetricsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], serviceArn = serviceArn.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetECSServiceRecommendationProjectedMetricsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetECSServiceRecommendationProjectedMetricsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setServiceArn(value: ServiceArn): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStat(value: MetricStatistic): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
