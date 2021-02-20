package typings.awsSdk.anon

import typings.awsSdk.rekognitionMod.ExtendedPaginationToken
import typings.awsSdk.rekognitionMod.ProjectArn
import typings.awsSdk.rekognitionMod.ProjectVersionsPageSize
import typings.awsSdk.rekognitionMod.VersionName
import typings.awsSdk.rekognitionMod.VersionNames
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/rekognition.DescribeProjectVersionsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeProjectVersionsRe extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100. 
    */
  var MaxResults: js.UndefOr[ProjectVersionsPageSize] = js.native
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
    */
  var ProjectArn: typings.awsSdk.rekognitionMod.ProjectArn = js.native
  
  /**
    * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If you don't specify a value, all model descriptions are returned. A version name is part of a model (ProjectVersion) ARN. For example, my-model.2020-01-21T09.10.15 is the version name in the following ARN. arn:aws:rekognition:us-east-1:123456789012:project/getting-started/version/my-model.2020-01-21T09.10.15/1234567890123.
    */
  var VersionNames: js.UndefOr[typings.awsSdk.rekognitionMod.VersionNames] = js.native
}
object DescribeProjectVersionsRe {
  
  @scala.inline
  def apply(ProjectArn: ProjectArn): DescribeProjectVersionsRe = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectVersionsRe]
  }
  
  @scala.inline
  implicit class DescribeProjectVersionsReMutableBuilder[Self <: DescribeProjectVersionsRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ProjectVersionsPageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNames(value: VersionNames): Self = StObject.set(x, "VersionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNamesUndefined: Self = StObject.set(x, "VersionNames", js.undefined)
    
    @scala.inline
    def setVersionNamesVarargs(value: VersionName*): Self = StObject.set(x, "VersionNames", js.Array(value :_*))
  }
}
