package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveCaseRequest extends StObject {
  
  /**
    * The support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
}
object ResolveCaseRequest {
  
  inline def apply(): ResolveCaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveCaseRequest] (val x: Self) extends AnyVal {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
  }
}
