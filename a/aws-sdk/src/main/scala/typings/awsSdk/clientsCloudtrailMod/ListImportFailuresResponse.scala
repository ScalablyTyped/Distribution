package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportFailuresResponse extends StObject {
  
  /**
    *  Contains information about the import failures. 
    */
  var Failures: js.UndefOr[ImportFailureList] = js.undefined
  
  /**
    *  A token you can use to get the next page of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportFailuresResponse {
  
  inline def apply(): ListImportFailuresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportFailuresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportFailuresResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: ImportFailureList): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: ImportFailureListItem*): Self = StObject.set(x, "Failures", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
