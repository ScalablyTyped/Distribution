package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableUnaggregatedFieldWells extends StObject {
  
  /**
    * The values field well for a pivot table. Values are unaggregated for an unaggregated table.
    */
  var Values: js.UndefOr[UnaggregatedFieldList] = js.undefined
}
object TableUnaggregatedFieldWells {
  
  inline def apply(): TableUnaggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUnaggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableUnaggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setValues(value: UnaggregatedFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: UnaggregatedField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
