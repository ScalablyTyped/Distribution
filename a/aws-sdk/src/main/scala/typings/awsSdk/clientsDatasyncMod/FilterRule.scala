package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterRule extends StObject {
  
  /**
    * The type of filter rule to apply. DataSync only supports the SIMPLE_PATTERN rule type.
    */
  var FilterType: js.UndefOr[typings.awsSdk.clientsDatasyncMod.FilterType] = js.undefined
  
  /**
    * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|" (that is, a pipe), for example: /folder1|/folder2   
    */
  var Value: js.UndefOr[FilterValue] = js.undefined
}
object FilterRule {
  
  inline def apply(): FilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRule]
  }
  
  extension [Self <: FilterRule](x: Self) {
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "FilterType", js.undefined)
    
    inline def setValue(value: FilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
