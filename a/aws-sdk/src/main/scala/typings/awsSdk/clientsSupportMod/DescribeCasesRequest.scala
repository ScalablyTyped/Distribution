package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCasesRequest extends StObject {
  
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.undefined
  
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.undefined
  
  /**
    * A list of ID numbers of the support cases you want returned. The maximum number of cases is 100.
    */
  var caseIdList: js.UndefOr[CaseIdList] = js.undefined
  
  /**
    * The ID displayed for a case in the Amazon Web Services Support Center user interface.
    */
  var displayId: js.UndefOr[DisplayId] = js.undefined
  
  /**
    * Specifies whether to include communications in the DescribeCases response. By default, communications are included.
    */
  var includeCommunications: js.UndefOr[IncludeCommunications] = js.undefined
  
  /**
    * Specifies whether to include resolved support cases in the DescribeCases response. By default, resolved cases aren't included.
    */
  var includeResolvedCases: js.UndefOr[IncludeResolvedCases] = js.undefined
  
  /**
    * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code for the language parameter if you want support in that language.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeCasesRequest {
  
  inline def apply(): DescribeCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCasesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCasesRequest] (val x: Self) extends AnyVal {
    
    inline def setAfterTime(value: AfterTime): Self = StObject.set(x, "afterTime", value.asInstanceOf[js.Any])
    
    inline def setAfterTimeUndefined: Self = StObject.set(x, "afterTime", js.undefined)
    
    inline def setBeforeTime(value: BeforeTime): Self = StObject.set(x, "beforeTime", value.asInstanceOf[js.Any])
    
    inline def setBeforeTimeUndefined: Self = StObject.set(x, "beforeTime", js.undefined)
    
    inline def setCaseIdList(value: CaseIdList): Self = StObject.set(x, "caseIdList", value.asInstanceOf[js.Any])
    
    inline def setCaseIdListUndefined: Self = StObject.set(x, "caseIdList", js.undefined)
    
    inline def setCaseIdListVarargs(value: CaseId*): Self = StObject.set(x, "caseIdList", js.Array(value*))
    
    inline def setDisplayId(value: DisplayId): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    inline def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    inline def setIncludeCommunications(value: IncludeCommunications): Self = StObject.set(x, "includeCommunications", value.asInstanceOf[js.Any])
    
    inline def setIncludeCommunicationsUndefined: Self = StObject.set(x, "includeCommunications", js.undefined)
    
    inline def setIncludeResolvedCases(value: IncludeResolvedCases): Self = StObject.set(x, "includeResolvedCases", value.asInstanceOf[js.Any])
    
    inline def setIncludeResolvedCasesUndefined: Self = StObject.set(x, "includeResolvedCases", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
