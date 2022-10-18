package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAllowListRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
  
  /**
    * Specifies whether to force deletion of the allow list, even if active classification jobs are configured to use the list. When you try to delete an allow list, Amazon Macie checks for classification jobs that use the list and have a status other than COMPLETE or CANCELLED. By default, Macie rejects your request if any jobs meet these criteria. To skip these checks and delete the list, set this value to true. To delete the list only if no active jobs are configured to use it, set this value to false.
    */
  var ignoreJobChecks: js.UndefOr[string] = js.undefined
}
object DeleteAllowListRequest {
  
  inline def apply(id: string): DeleteAllowListRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAllowListRequest]
  }
  
  extension [Self <: DeleteAllowListRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIgnoreJobChecks(value: string): Self = StObject.set(x, "ignoreJobChecks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreJobChecksUndefined: Self = StObject.set(x, "ignoreJobChecks", js.undefined)
  }
}
