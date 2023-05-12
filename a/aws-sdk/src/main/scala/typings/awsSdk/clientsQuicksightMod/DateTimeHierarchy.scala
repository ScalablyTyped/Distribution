package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeHierarchy extends StObject {
  
  /**
    * The option that determines the drill down filters for the DateTime hierarchy.
    */
  var DrillDownFilters: js.UndefOr[DrillDownFilterList] = js.undefined
  
  /**
    * The hierarchy ID of the DateTime hierarchy.
    */
  var HierarchyId: typings.awsSdk.clientsQuicksightMod.HierarchyId
}
object DateTimeHierarchy {
  
  inline def apply(HierarchyId: HierarchyId): DateTimeHierarchy = {
    val __obj = js.Dynamic.literal(HierarchyId = HierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeHierarchy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeHierarchy] (val x: Self) extends AnyVal {
    
    inline def setDrillDownFilters(value: DrillDownFilterList): Self = StObject.set(x, "DrillDownFilters", value.asInstanceOf[js.Any])
    
    inline def setDrillDownFiltersUndefined: Self = StObject.set(x, "DrillDownFilters", js.undefined)
    
    inline def setDrillDownFiltersVarargs(value: DrillDownFilter*): Self = StObject.set(x, "DrillDownFilters", js.Array(value*))
    
    inline def setHierarchyId(value: HierarchyId): Self = StObject.set(x, "HierarchyId", value.asInstanceOf[js.Any])
  }
}
