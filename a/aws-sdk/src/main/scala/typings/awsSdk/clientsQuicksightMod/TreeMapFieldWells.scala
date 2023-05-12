package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMapFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a tree map.
    */
  var TreeMapAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TreeMapAggregatedFieldWells] = js.undefined
}
object TreeMapFieldWells {
  
  inline def apply(): TreeMapFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeMapFieldWells] (val x: Self) extends AnyVal {
    
    inline def setTreeMapAggregatedFieldWells(value: TreeMapAggregatedFieldWells): Self = StObject.set(x, "TreeMapAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setTreeMapAggregatedFieldWellsUndefined: Self = StObject.set(x, "TreeMapAggregatedFieldWells", js.undefined)
  }
}
