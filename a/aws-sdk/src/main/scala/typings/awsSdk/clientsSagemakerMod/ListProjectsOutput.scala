package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsOutput extends StObject {
  
  /**
    * If the result of the previous ListCompilationJobs request was truncated, the response includes a NextToken. To retrieve the next set of model compilation jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of summaries of projects.
    */
  var ProjectSummaryList: typings.awsSdk.clientsSagemakerMod.ProjectSummaryList
}
object ListProjectsOutput {
  
  inline def apply(ProjectSummaryList: ProjectSummaryList): ListProjectsOutput = {
    val __obj = js.Dynamic.literal(ProjectSummaryList = ProjectSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsOutput]
  }
  
  extension [Self <: ListProjectsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectSummaryList(value: ProjectSummaryList): Self = StObject.set(x, "ProjectSummaryList", value.asInstanceOf[js.Any])
    
    inline def setProjectSummaryListVarargs(value: ProjectSummary*): Self = StObject.set(x, "ProjectSummaryList", js.Array(value*))
  }
}
