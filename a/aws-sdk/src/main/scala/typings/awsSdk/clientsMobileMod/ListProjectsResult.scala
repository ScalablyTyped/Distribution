package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResult extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  var projects: js.UndefOr[ProjectSummaries] = js.undefined
}
object ListProjectsResult {
  
  inline def apply(): ListProjectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProjectsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjects(value: ProjectSummaries): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
