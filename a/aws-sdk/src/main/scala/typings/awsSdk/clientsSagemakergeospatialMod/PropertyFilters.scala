package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyFilters extends StObject {
  
  /**
    * The Logical Operator used to combine the Property Filters.
    */
  var LogicalOperator: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.LogicalOperator] = js.undefined
  
  /**
    * A list of Property Filters.
    */
  var Properties: js.UndefOr[PropertyFiltersList] = js.undefined
}
object PropertyFilters {
  
  inline def apply(): PropertyFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyFilters] (val x: Self) extends AnyVal {
    
    inline def setLogicalOperator(value: LogicalOperator): Self = StObject.set(x, "LogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "LogicalOperator", js.undefined)
    
    inline def setProperties(value: PropertyFiltersList): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setPropertiesVarargs(value: PropertyFilter*): Self = StObject.set(x, "Properties", js.Array(value*))
  }
}
