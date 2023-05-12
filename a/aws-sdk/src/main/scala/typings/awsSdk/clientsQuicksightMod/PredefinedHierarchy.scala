package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedHierarchy extends StObject {
  
  /**
    * The list of columns that define the predefined hierarchy.
    */
  var Columns: PredefinedHierarchyColumnList
  
  /**
    * The option that determines the drill down filters for the predefined hierarchy.
    */
  var DrillDownFilters: js.UndefOr[DrillDownFilterList] = js.undefined
  
  /**
    * The hierarchy ID of the predefined hierarchy.
    */
  var HierarchyId: typings.awsSdk.clientsQuicksightMod.HierarchyId
}
object PredefinedHierarchy {
  
  inline def apply(Columns: PredefinedHierarchyColumnList, HierarchyId: HierarchyId): PredefinedHierarchy = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], HierarchyId = HierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredefinedHierarchy] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: PredefinedHierarchyColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnIdentifier*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setDrillDownFilters(value: DrillDownFilterList): Self = StObject.set(x, "DrillDownFilters", value.asInstanceOf[js.Any])
    
    inline def setDrillDownFiltersUndefined: Self = StObject.set(x, "DrillDownFilters", js.undefined)
    
    inline def setDrillDownFiltersVarargs(value: DrillDownFilter*): Self = StObject.set(x, "DrillDownFilters", js.Array(value*))
    
    inline def setHierarchyId(value: HierarchyId): Self = StObject.set(x, "HierarchyId", value.asInstanceOf[js.Any])
  }
}
