package typings.awsSdk

import typings.awsSdk.rekognitionMod.ExtendedPaginationToken
import typings.awsSdk.rekognitionMod.ProjectVersionsPageSize
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/rekognition.DescribeProjectVersionsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
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
    * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If you don't specify a value, all model descriptions are returned.
    */
  var VersionNames: js.UndefOr[typings.awsSdk.rekognitionMod.VersionNames] = js.native
}

