package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataQuery extends StObject {
  
  /**
    * The math expression to perform on the returned data, if this object is performing a math expression. This expression can use the Id of the other metrics to refer to those metrics, and can also use the Id of other expressions to use the result of those expressions.  Conditional: Within each MetricDataQuery object, you must specify either Expression or MetricStat, but not both.
    */
  var Expression: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * A short name that identifies the object's results in the response. This name must be unique among all MetricDataQuery objects specified for a single scaling policy. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscores. The first character must be a lowercase letter. 
    */
  var Id: XmlStringMaxLen255
  
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is a math expression, so that you know what the value represents.
    */
  var Label: js.UndefOr[XmlStringMetricLabel] = js.undefined
  
  /**
    * Information about the metric data to return. Conditional: Within each MetricDataQuery object, you must specify either Expression or MetricStat, but not both.
    */
  var MetricStat: js.UndefOr[typings.awsSdk.autoscalingMod.MetricStat] = js.undefined
  
  /**
    * Indicates whether to return the timestamps and raw data values of this metric.  If you use any math expressions, specify true for this value for only the final math expression that the metric specification is based on. You must specify false for ReturnData for all the other metrics and expressions used in the metric specification. If you are only retrieving metrics and not performing any math expressions, do not specify anything for ReturnData. This sets it to its default (true).
    */
  var ReturnData: js.UndefOr[typings.awsSdk.autoscalingMod.ReturnData] = js.undefined
}
object MetricDataQuery {
  
  inline def apply(Id: XmlStringMaxLen255): MetricDataQuery = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDataQuery]
  }
  
  extension [Self <: MetricDataQuery](x: Self) {
    
    inline def setExpression(value: XmlStringMaxLen1023): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setId(value: XmlStringMaxLen255): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: XmlStringMetricLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setMetricStat(value: MetricStat): Self = StObject.set(x, "MetricStat", value.asInstanceOf[js.Any])
    
    inline def setMetricStatUndefined: Self = StObject.set(x, "MetricStat", js.undefined)
    
    inline def setReturnData(value: ReturnData): Self = StObject.set(x, "ReturnData", value.asInstanceOf[js.Any])
    
    inline def setReturnDataUndefined: Self = StObject.set(x, "ReturnData", js.undefined)
  }
}
