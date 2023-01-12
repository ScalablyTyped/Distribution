package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectVersionsResponse extends StObject {
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to earliest.
    */
  var ProjectVersionDescriptions: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectVersionDescriptions] = js.undefined
}
object DescribeProjectVersionsResponse {
  
  inline def apply(): DescribeProjectVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProjectVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectVersionDescriptions(value: ProjectVersionDescriptions): Self = StObject.set(x, "ProjectVersionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setProjectVersionDescriptionsUndefined: Self = StObject.set(x, "ProjectVersionDescriptions", js.undefined)
    
    inline def setProjectVersionDescriptionsVarargs(value: ProjectVersionDescription*): Self = StObject.set(x, "ProjectVersionDescriptions", js.Array(value*))
  }
}
