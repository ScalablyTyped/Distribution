package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentFrameworksResponse extends StObject {
  
  /**
    *  The list of metadata objects for the framework. 
    */
  var frameworkMetadataList: js.UndefOr[FrameworkMetadataList] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentFrameworksResponse {
  
  inline def apply(): ListAssessmentFrameworksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentFrameworksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssessmentFrameworksResponse] (val x: Self) extends AnyVal {
    
    inline def setFrameworkMetadataList(value: FrameworkMetadataList): Self = StObject.set(x, "frameworkMetadataList", value.asInstanceOf[js.Any])
    
    inline def setFrameworkMetadataListUndefined: Self = StObject.set(x, "frameworkMetadataList", js.undefined)
    
    inline def setFrameworkMetadataListVarargs(value: AssessmentFrameworkMetadata*): Self = StObject.set(x, "frameworkMetadataList", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
