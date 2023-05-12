package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPathSort extends StObject {
  
  /**
    * Determines the sort direction.
    */
  var Direction: SortDirection
  
  /**
    * The list of data paths that need to be sorted.
    */
  var SortPaths: DataPathValueList
}
object DataPathSort {
  
  inline def apply(Direction: SortDirection, SortPaths: DataPathValueList): DataPathSort = {
    val __obj = js.Dynamic.literal(Direction = Direction.asInstanceOf[js.Any], SortPaths = SortPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPathSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataPathSort] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: SortDirection): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setSortPaths(value: DataPathValueList): Self = StObject.set(x, "SortPaths", value.asInstanceOf[js.Any])
    
    inline def setSortPathsVarargs(value: DataPathValue*): Self = StObject.set(x, "SortPaths", js.Array(value*))
  }
}
