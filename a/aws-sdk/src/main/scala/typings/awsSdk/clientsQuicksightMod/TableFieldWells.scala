package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldWells extends StObject {
  
  /**
    * The aggregated field well for the table.
    */
  var TableAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TableAggregatedFieldWells] = js.undefined
  
  /**
    * The unaggregated field well for the table.
    */
  var TableUnaggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TableUnaggregatedFieldWells] = js.undefined
}
object TableFieldWells {
  
  inline def apply(): TableFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldWells] (val x: Self) extends AnyVal {
    
    inline def setTableAggregatedFieldWells(value: TableAggregatedFieldWells): Self = StObject.set(x, "TableAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setTableAggregatedFieldWellsUndefined: Self = StObject.set(x, "TableAggregatedFieldWells", js.undefined)
    
    inline def setTableUnaggregatedFieldWells(value: TableUnaggregatedFieldWells): Self = StObject.set(x, "TableUnaggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setTableUnaggregatedFieldWellsUndefined: Self = StObject.set(x, "TableUnaggregatedFieldWells", js.undefined)
  }
}
