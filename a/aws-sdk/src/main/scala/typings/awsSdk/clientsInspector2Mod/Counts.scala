package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counts extends StObject {
  
  /**
    * The number of resources.
    */
  var count: js.UndefOr[AggCounts] = js.undefined
  
  /**
    * The key associated with this group
    */
  var groupKey: js.UndefOr[GroupKey] = js.undefined
}
object Counts {
  
  inline def apply(): Counts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counts]
  }
  
  extension [Self <: Counts](x: Self) {
    
    inline def setCount(value: AggCounts): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setGroupKey(value: GroupKey): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
  }
}
