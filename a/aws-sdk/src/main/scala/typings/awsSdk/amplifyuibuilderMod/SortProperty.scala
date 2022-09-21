package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortProperty extends StObject {
  
  /**
    * The direction of the sort, either ascending or descending.
    */
  var direction: SortDirection
  
  /**
    * The field to perform the sort on.
    */
  var field: String
}
object SortProperty {
  
  inline def apply(direction: SortDirection, field: String): SortProperty = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortProperty]
  }
  
  extension [Self <: SortProperty](x: Self) {
    
    inline def setDirection(value: SortDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
