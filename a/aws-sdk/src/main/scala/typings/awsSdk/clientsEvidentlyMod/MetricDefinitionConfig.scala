package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDefinitionConfig extends StObject {
  
  /**
    * The entity, such as a user or session, that does an action that causes a metric value to be recorded. An example is userDetails.userID.
    */
  var entityIdKey: JsonPath
  
  /**
    * The EventBridge event pattern that defines how the metric is recorded. For more information about EventBridge event patterns, see Amazon EventBridge event patterns.
    */
  var eventPattern: js.UndefOr[MetricDefinitionConfigEventPatternString] = js.undefined
  
  /**
    * A name for the metric.
    */
  var name: CwDimensionSafeName
  
  /**
    * A label for the units that the metric is measuring.
    */
  var unitLabel: js.UndefOr[MetricUnitLabel] = js.undefined
  
  /**
    * The value that is tracked to produce the metric.
    */
  var valueKey: JsonPath
}
object MetricDefinitionConfig {
  
  inline def apply(entityIdKey: JsonPath, name: CwDimensionSafeName, valueKey: JsonPath): MetricDefinitionConfig = {
    val __obj = js.Dynamic.literal(entityIdKey = entityIdKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinitionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDefinitionConfig] (val x: Self) extends AnyVal {
    
    inline def setEntityIdKey(value: JsonPath): Self = StObject.set(x, "entityIdKey", value.asInstanceOf[js.Any])
    
    inline def setEventPattern(value: MetricDefinitionConfigEventPatternString): Self = StObject.set(x, "eventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "eventPattern", js.undefined)
    
    inline def setName(value: CwDimensionSafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnitLabel(value: MetricUnitLabel): Self = StObject.set(x, "unitLabel", value.asInstanceOf[js.Any])
    
    inline def setUnitLabelUndefined: Self = StObject.set(x, "unitLabel", js.undefined)
    
    inline def setValueKey(value: JsonPath): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
  }
}
