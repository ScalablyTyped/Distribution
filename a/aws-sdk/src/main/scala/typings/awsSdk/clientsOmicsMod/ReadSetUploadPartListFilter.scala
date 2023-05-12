package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetUploadPartListFilter extends StObject {
  
  /**
    *  Filters for read set uploads after a specified time. 
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Filters for read set part uploads before a specified time. 
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
}
object ReadSetUploadPartListFilter {
  
  inline def apply(): ReadSetUploadPartListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSetUploadPartListFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetUploadPartListFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
  }
}
