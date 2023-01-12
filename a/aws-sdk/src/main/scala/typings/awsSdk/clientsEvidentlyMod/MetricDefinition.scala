package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDefinition extends StObject {
  
  /**
    * The entity, such as a user or session, that does an action that causes a metric value to be recorded.
    */
  var entityIdKey: js.UndefOr[JsonPath] = js.undefined
  
  /**
    * The EventBridge event pattern that defines how the metric is recorded. For more information about EventBridge event patterns, see Amazon EventBridge event patterns.
    */
  var eventPattern: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The name of the metric.
    */
  var name: js.UndefOr[CwDimensionSafeName] = js.undefined
  
  /**
    * The label for the units that the metric is measuring.
    */
  var unitLabel: js.UndefOr[MetricUnitLabel] = js.undefined
  
  /**
    * The value that is tracked to produce the metric.
    */
  var valueKey: js.UndefOr[JsonPath] = js.undefined
}
object MetricDefinition {
  
  inline def apply(): MetricDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDefinition] (val x: Self) extends AnyVal {
    
    inline def setEntityIdKey(value: JsonPath): Self = StObject.set(x, "entityIdKey", value.asInstanceOf[js.Any])
    
    inline def setEntityIdKeyUndefined: Self = StObject.set(x, "entityIdKey", js.undefined)
    
    inline def setEventPattern(value: JsonValue): Self = StObject.set(x, "eventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "eventPattern", js.undefined)
    
    inline def setName(value: CwDimensionSafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnitLabel(value: MetricUnitLabel): Self = StObject.set(x, "unitLabel", value.asInstanceOf[js.Any])
    
    inline def setUnitLabelUndefined: Self = StObject.set(x, "unitLabel", js.undefined)
    
    inline def setValueKey(value: JsonPath): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
  }
}
