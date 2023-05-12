package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedEntityDefinition extends StObject {
  
  /**
    * The name of the entity.
    */
  var FieldName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The definition of a metric.
    */
  var Metric: js.UndefOr[NamedEntityDefinitionMetric] = js.undefined
  
  /**
    * The property name to be used for the named entity.
    */
  var PropertyName: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The property role. Valid values for this structure are PRIMARY and ID.
    */
  var PropertyRole: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PropertyRole] = js.undefined
  
  /**
    * The property usage. Valid values for this structure are INHERIT, DIMENSION, and MEASURE.
    */
  var PropertyUsage: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PropertyUsage] = js.undefined
}
object NamedEntityDefinition {
  
  inline def apply(): NamedEntityDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedEntityDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedEntityDefinition] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: LimitedString): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "FieldName", js.undefined)
    
    inline def setMetric(value: NamedEntityDefinitionMetric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setPropertyName(value: LimitedString): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "PropertyName", js.undefined)
    
    inline def setPropertyRole(value: PropertyRole): Self = StObject.set(x, "PropertyRole", value.asInstanceOf[js.Any])
    
    inline def setPropertyRoleUndefined: Self = StObject.set(x, "PropertyRole", js.undefined)
    
    inline def setPropertyUsage(value: PropertyUsage): Self = StObject.set(x, "PropertyUsage", value.asInstanceOf[js.Any])
    
    inline def setPropertyUsageUndefined: Self = StObject.set(x, "PropertyUsage", js.undefined)
  }
}
