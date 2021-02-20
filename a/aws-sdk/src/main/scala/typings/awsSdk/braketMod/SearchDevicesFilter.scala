package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDevicesFilter extends StObject {
  
  /**
    * The name to use to filter results.
    */
  var name: SearchDevicesFilterNameString = js.native
  
  /**
    * The values to use to filter results.
    */
  var values: SearchDevicesFilterValuesList = js.native
}
object SearchDevicesFilter {
  
  @scala.inline
  def apply(name: SearchDevicesFilterNameString, values: SearchDevicesFilterValuesList): SearchDevicesFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDevicesFilter]
  }
  
  @scala.inline
  implicit class SearchDevicesFilterMutableBuilder[Self <: SearchDevicesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SearchDevicesFilterNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: SearchDevicesFilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String256*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
