package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuildsForProjectInput extends StObject {
  
  /**
    * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the CodeBuild project.
    */
  var projectName: NonEmptyString
  
  /**
    * The order to sort the results in. The results are sorted by build number, not the build identifier. If this is not specified, the results are sorted in descending order. Valid values include:    ASCENDING: List the build identifiers in ascending order, by build number.    DESCENDING: List the build identifiers in descending order, by build number.   If the project has more than 100 builds, setting the sort order will result in an error. 
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.undefined
}
object ListBuildsForProjectInput {
  
  inline def apply(projectName: NonEmptyString): ListBuildsForProjectInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuildsForProjectInput]
  }
  
  extension [Self <: ListBuildsForProjectInput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
