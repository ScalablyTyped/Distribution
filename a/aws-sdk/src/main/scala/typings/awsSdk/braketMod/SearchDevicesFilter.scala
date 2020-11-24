package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDevicesFilter extends js.Object {
  
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
  implicit class SearchDevicesFilterOps[Self <: SearchDevicesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: SearchDevicesFilterNameString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String256*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: SearchDevicesFilterValuesList): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
