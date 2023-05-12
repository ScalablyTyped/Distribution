package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricAttribute extends StObject {
  
  /**
    * The metric's event type.
    */
  var eventType: EventType
  
  /**
    * The attribute's expression. Available functions are SUM() or SAMPLECOUNT(). For SUM() functions, provide the dataset type (either Interactions or Items) and column to sum as a parameter. For example SUM(Items.PRICE).
    */
  var expression: MetricExpression
  
  /**
    * The metric's name. The name helps you identify the metric in Amazon CloudWatch or Amazon S3.
    */
  var metricName: MetricName
}
object MetricAttribute {
  
  inline def apply(eventType: EventType, expression: MetricExpression, metricName: MetricName): MetricAttribute = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricAttribute] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: MetricExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
