package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchMetricAction extends StObject {
  
  /**
    * The CloudWatch metric name.
    */
  var metricName: String
  
  /**
    * The CloudWatch metric namespace name.
    */
  var metricNamespace: String
  
  /**
    * An optional Unix timestamp.
    */
  var metricTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The metric unit supported by CloudWatch.
    */
  var metricUnit: String
  
  /**
    * The CloudWatch metric value.
    */
  var metricValue: String
  
  /**
    * The IAM role that allows access to the CloudWatch metric.
    */
  var roleArn: AwsArn
}
object CloudwatchMetricAction {
  
  inline def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: AwsArn
  ): CloudwatchMetricAction = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchMetricAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudwatchMetricAction] (val x: Self) extends AnyVal {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNamespace(value: String): Self = StObject.set(x, "metricNamespace", value.asInstanceOf[js.Any])
    
    inline def setMetricTimestamp(value: String): Self = StObject.set(x, "metricTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMetricTimestampUndefined: Self = StObject.set(x, "metricTimestamp", js.undefined)
    
    inline def setMetricUnit(value: String): Self = StObject.set(x, "metricUnit", value.asInstanceOf[js.Any])
    
    inline def setMetricValue(value: String): Self = StObject.set(x, "metricValue", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
