package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationImportJobsFilter extends StObject {
  
  /**
    * A status to filter on.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * A store name to filter on.
    */
  var storeName: js.UndefOr[String] = js.undefined
}
object ListAnnotationImportJobsFilter {
  
  inline def apply(): ListAnnotationImportJobsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationImportJobsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationImportJobsFilter] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
  }
}
