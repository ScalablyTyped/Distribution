package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDimension extends StObject {
  
  /**
    * A unique identifier for the dimension.
    */
  var dimensionName: DimensionName
  
  /**
    * Defines how the dimensionValues of a dimension are interpreted. For example, for dimension type TOPIC_FILTER, the IN operator, a message will be counted only if its topic matches one of the topic filters. With NOT_IN operator, a message will be counted only if it doesn't match any of the topic filters. The operator is optional: if it's not provided (is null), it will be interpreted as IN.
    */
  var operator: js.UndefOr[DimensionValueOperator] = js.undefined
}
object MetricDimension {
  
  inline def apply(dimensionName: DimensionName): MetricDimension = {
    val __obj = js.Dynamic.literal(dimensionName = dimensionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDimension] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: DimensionName): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: DimensionValueOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
