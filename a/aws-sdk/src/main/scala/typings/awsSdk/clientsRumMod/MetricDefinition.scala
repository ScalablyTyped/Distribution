package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDefinition extends StObject {
  
  /**
    * This field is a map of field paths to dimension names. It defines the dimensions to associate with this metric in CloudWatch The value of this field is used only if the metric destination is CloudWatch. If the metric destination is Evidently, the value of DimensionKeys is ignored.
    */
  var DimensionKeys: js.UndefOr[DimensionKeysMap] = js.undefined
  
  /**
    * The pattern that defines the metric. RUM checks events that happen in a user's session against the pattern, and events that match the pattern are sent to the metric destination. If the metrics destination is CloudWatch and the event also matches a value in DimensionKeys, then the metric is published with the specified dimensions. 
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsRumMod.EventPattern] = js.undefined
  
  /**
    * The ID of this metric definition.
    */
  var MetricDefinitionId: typings.awsSdk.clientsRumMod.MetricDefinitionId
  
  /**
    * The name of the metric that is defined in this structure.
    */
  var Name: MetricName
  
  /**
    * If this metric definition is for a custom metric instead of an extended metric, this field displays the metric namespace that the custom metric is published to.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsRumMod.Namespace] = js.undefined
  
  /**
    * Use this field only if you are sending this metric to CloudWatch. It defines the CloudWatch metric unit that this metric is measured in. 
    */
  var UnitLabel: js.UndefOr[typings.awsSdk.clientsRumMod.UnitLabel] = js.undefined
  
  /**
    * The field within the event object that the metric value is sourced from.
    */
  var ValueKey: js.UndefOr[typings.awsSdk.clientsRumMod.ValueKey] = js.undefined
}
object MetricDefinition {
  
  inline def apply(MetricDefinitionId: MetricDefinitionId, Name: MetricName): MetricDefinition = {
    val __obj = js.Dynamic.literal(MetricDefinitionId = MetricDefinitionId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDefinition] (val x: Self) extends AnyVal {
    
    inline def setDimensionKeys(value: DimensionKeysMap): Self = StObject.set(x, "DimensionKeys", value.asInstanceOf[js.Any])
    
    inline def setDimensionKeysUndefined: Self = StObject.set(x, "DimensionKeys", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setMetricDefinitionId(value: MetricDefinitionId): Self = StObject.set(x, "MetricDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setName(value: MetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setUnitLabel(value: UnitLabel): Self = StObject.set(x, "UnitLabel", value.asInstanceOf[js.Any])
    
    inline def setUnitLabelUndefined: Self = StObject.set(x, "UnitLabel", js.undefined)
    
    inline def setValueKey(value: ValueKey): Self = StObject.set(x, "ValueKey", value.asInstanceOf[js.Any])
    
    inline def setValueKeyUndefined: Self = StObject.set(x, "ValueKey", js.undefined)
  }
}
