package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstancesFilter extends StObject {
  
  /**
    * The name of a filtering criterion.
    */
  var key: js.UndefOr[ListServiceInstancesFilterBy] = js.undefined
  
  /**
    * A value to filter by. With the date/time keys (*At{Before,After}), the value is a valid RFC 3339 string with no UTC offset and with an optional fractional precision (for example, 1985-04-12T23:20:50.52Z).
    */
  var value: js.UndefOr[ListServiceInstancesFilterValue] = js.undefined
}
object ListServiceInstancesFilter {
  
  inline def apply(): ListServiceInstancesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceInstancesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceInstancesFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ListServiceInstancesFilterBy): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: ListServiceInstancesFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
