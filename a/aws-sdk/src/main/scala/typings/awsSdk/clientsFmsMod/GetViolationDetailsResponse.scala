package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetViolationDetailsResponse extends StObject {
  
  /**
    * Violation detail for a resource.
    */
  var ViolationDetail: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationDetail] = js.undefined
}
object GetViolationDetailsResponse {
  
  inline def apply(): GetViolationDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetViolationDetailsResponse]
  }
  
  extension [Self <: GetViolationDetailsResponse](x: Self) {
    
    inline def setViolationDetail(value: ViolationDetail): Self = StObject.set(x, "ViolationDetail", value.asInstanceOf[js.Any])
    
    inline def setViolationDetailUndefined: Self = StObject.set(x, "ViolationDetail", js.undefined)
  }
}
