package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatabrewMod.NextToken] = js.undefined
  
  /**
    * A list of projects that are defined .
    */
  var Projects: ProjectList
}
object ListProjectsResponse {
  
  inline def apply(Projects: ProjectList): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(Projects = Projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjects(value: ProjectList): Self = StObject.set(x, "Projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsVarargs(value: Project*): Self = StObject.set(x, "Projects", js.Array(value*))
  }
}
