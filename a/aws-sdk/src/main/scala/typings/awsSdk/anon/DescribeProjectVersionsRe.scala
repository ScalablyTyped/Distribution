package typings.awsSdk.anon

import typings.awsSdk.rekognitionMod.ExtendedPaginationToken
import typings.awsSdk.rekognitionMod.ProjectArn
import typings.awsSdk.rekognitionMod.ProjectVersionsPageSize
import typings.awsSdk.rekognitionMod.VersionName
import typings.awsSdk.rekognitionMod.VersionNames
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/rekognition.DescribeProjectVersionsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeProjectVersionsRe extends js.Object {
  
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
  implicit class DescribeProjectVersionsReOps[Self <: DescribeProjectVersionsRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = this.set("ProjectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ProjectVersionsPageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: ExtendedPaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVersionNamesVarargs(value: VersionName*): Self = this.set("VersionNames", js.Array(value :_*))
    
    @scala.inline
    def setVersionNames(value: VersionNames): Self = this.set("VersionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNames: Self = this.set("VersionNames", js.undefined)
  }
}
