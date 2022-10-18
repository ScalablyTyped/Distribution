package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFilter extends StObject {
  
  /**
    * The operator to use when comparing values in the filter
    */
  var comparison: StringComparison
  
  /**
    * The value to filter on.
    */
  var value: StringInput
}
object StringFilter {
  
  inline def apply(comparison: StringComparison, value: StringInput): StringFilter = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFilter]
  }
  
  extension [Self <: StringFilter](x: Self) {
    
    inline def setComparison(value: StringComparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringInput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
