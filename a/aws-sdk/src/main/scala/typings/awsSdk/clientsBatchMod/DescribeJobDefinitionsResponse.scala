package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobDefinitionsResponse extends StObject {
  
  /**
    * The list of job definitions.
    */
  var jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeJobDefinitions request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeJobDefinitionsResponse {
  
  inline def apply(): DescribeJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobDefinitions(value: JobDefinitionList): Self = StObject.set(x, "jobDefinitions", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionsUndefined: Self = StObject.set(x, "jobDefinitions", js.undefined)
    
    inline def setJobDefinitionsVarargs(value: JobDefinition*): Self = StObject.set(x, "jobDefinitions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
