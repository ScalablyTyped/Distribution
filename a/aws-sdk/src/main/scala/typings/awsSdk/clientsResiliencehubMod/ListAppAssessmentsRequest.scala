package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppAssessmentsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name for the assessment.
    */
  var assessmentName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The current status of the assessment for the resiliency policy.
    */
  var assessmentStatus: js.UndefOr[AssessmentStatusList] = js.undefined
  
  /**
    * The current status of compliance for the resiliency policy.
    */
  var complianceStatus: js.UndefOr[ComplianceStatus] = js.undefined
  
  /**
    * Specifies the entity that invoked a specific assessment, either a User or the System.
    */
  var invoker: js.UndefOr[AssessmentInvoker] = js.undefined
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Null, or the token from a previous call to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The default is to sort by ascending startTime. To sort by descending startTime, set reverseOrder to true.
    */
  var reverseOrder: js.UndefOr[BooleanOptional] = js.undefined
}
object ListAppAssessmentsRequest {
  
  inline def apply(): ListAppAssessmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppAssessmentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppAssessmentsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "appArn", js.undefined)
    
    inline def setAssessmentName(value: EntityName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setAssessmentStatus(value: AssessmentStatusList): Self = StObject.set(x, "assessmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssessmentStatusUndefined: Self = StObject.set(x, "assessmentStatus", js.undefined)
    
    inline def setAssessmentStatusVarargs(value: AssessmentStatus*): Self = StObject.set(x, "assessmentStatus", js.Array(value*))
    
    inline def setComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "complianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "complianceStatus", js.undefined)
    
    inline def setInvoker(value: AssessmentInvoker): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
    
    inline def setInvokerUndefined: Self = StObject.set(x, "invoker", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReverseOrder(value: BooleanOptional): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
