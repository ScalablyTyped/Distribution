package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSummaryResponse extends StObject {
  
  /**
    * A set of key–value pairs containing information about IAM entity usage and IAM quotas.
    */
  var SummaryMap: js.UndefOr[summaryMapType] = js.undefined
}
object GetAccountSummaryResponse {
  
  inline def apply(): GetAccountSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSummaryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccountSummaryResponse] (val x: Self) extends AnyVal {
    
    inline def setSummaryMap(value: summaryMapType): Self = StObject.set(x, "SummaryMap", value.asInstanceOf[js.Any])
    
    inline def setSummaryMapUndefined: Self = StObject.set(x, "SummaryMap", js.undefined)
  }
}
