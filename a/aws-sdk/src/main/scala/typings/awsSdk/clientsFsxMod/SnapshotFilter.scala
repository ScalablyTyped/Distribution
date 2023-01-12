package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotFilter extends StObject {
  
  /**
    * The name of the filter to use. You can filter by the file-system-id or by volume-id.
    */
  var Name: js.UndefOr[SnapshotFilterName] = js.undefined
  
  /**
    * The file-system-id or volume-id that you are filtering for.
    */
  var Values: js.UndefOr[SnapshotFilterValues] = js.undefined
}
object SnapshotFilter {
  
  inline def apply(): SnapshotFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: SnapshotFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: SnapshotFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: SnapshotFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
