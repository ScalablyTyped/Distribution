package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceStoreFilter extends StObject {
  
  /**
    * The filter's start date.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's end date.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A name to filter on.
    */
  var name: js.UndefOr[SequenceStoreName] = js.undefined
}
object SequenceStoreFilter {
  
  inline def apply(): SequenceStoreFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceStoreFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceStoreFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setName(value: SequenceStoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
