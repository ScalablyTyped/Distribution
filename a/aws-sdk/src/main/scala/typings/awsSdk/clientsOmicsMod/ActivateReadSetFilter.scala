package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateReadSetFilter extends StObject {
  
  /**
    * The filter's start date.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's end date.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's status.
    */
  var status: js.UndefOr[ReadSetActivationJobStatus] = js.undefined
}
object ActivateReadSetFilter {
  
  inline def apply(): ActivateReadSetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateReadSetFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateReadSetFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setStatus(value: ReadSetActivationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
