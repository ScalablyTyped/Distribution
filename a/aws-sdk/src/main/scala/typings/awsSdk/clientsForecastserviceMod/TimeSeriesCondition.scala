package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesCondition extends StObject {
  
  /**
    * The item_id, dimension name, IM name, or timestamp that you are modifying.
    */
  var AttributeName: Name
  
  /**
    * The value that is applied for the chosen Condition.
    */
  var AttributeValue: typings.awsSdk.clientsForecastserviceMod.AttributeValue
  
  /**
    * The condition to apply. Valid values are EQUALS, NOT_EQUALS, LESS_THAN and GREATER_THAN.
    */
  var Condition: typings.awsSdk.clientsForecastserviceMod.Condition
}
object TimeSeriesCondition {
  
  inline def apply(AttributeName: Name, AttributeValue: AttributeValue, Condition: Condition): TimeSeriesCondition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesCondition]
  }
  
  extension [Self <: TimeSeriesCondition](x: Self) {
    
    inline def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
  }
}
